package spring.net.mydream.redis;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.stereotype.Component;

import spring.net.mydream.entity.User;
import spring.net.mydream.jwt.JwtUtils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import spring.net.mydream.utils.DaoManage;

import static spring.net.mydream.service.AirportSystem.GetData;

@Component
@ConfigurationProperties("jwt.config")
public class CurrentUtils {
	
	@Autowired
	HttpServletRequest request;

	@Autowired
	HttpServletResponse response;
	
	@Autowired
	private JwtUtils jwtUtils;
	
	@Autowired
	private RedisUtil redisUtil;
	@Autowired
	private DaoManage DM;

	
	//签名失效时间
	private Long ttl;

	public Long getTtl() {
		return ttl;
	}

	public void setTtl(Long ttl) {
		this.ttl = ttl;
	}

	public Object getAttribute(String key) throws IllegalArgumentException,ExpiredJwtException{
		/**
		 *	-----------currentSale-----------
		 * 	HttpServletRequest request;
		 * 	
		 * 	String authorization=request.getHeader("Authorization");
		 *	
		 *	Claims claims=jwtUtils.parseJwt(authorization);
		 *	
		 *	String id=claims.getId();
		 *
		 *	Sale sale=(Sale)reids.get("Sale"+id);
		 */
		String authorization=request.getHeader("Authorization");
//		Claims claims=jwtUtils.parseJwt(authorization);

		//----------------------------测试使用代码--------------------------------------------
		Claims claims=null;

		try {
			claims=jwtUtils.parseJwt(authorization);
		}catch(Exception e) {
			User user = (User)GetData(DM.getUserDao().findById(1));
			return user;
		}
		//----------------------------------------------------------------------------------
		String id=claims.getId();
		String subject=claims.getSubject();
		if(key.equals(subject)) {
			Object o=redisUtil.get(key+id);
			return o;
		}else {
			User user = (User)GetData(DM.getUserDao().findById(1));
			return user;
		}
	}

	public void setAttribute(String key,String id, Object value) throws RedisConnectionFailureException{
		//1.设置失效时间
		//Long now=System.currentTimeMillis();
		//Long exp=now+ttl;
		redisUtil.set(key+id, value, ttl/1000);
		String token=jwtUtils.CreateJwt(id, key, null);
		response.setHeader("Authorization", token);
	}
	public void setAttribute(String keyAndid, Object value) throws RedisConnectionFailureException{
		//Long now=System.currentTimeMillis();
		//Long exp=now+ttl;
		redisUtil.set(keyAndid, value, ttl/1000);
	}
}

