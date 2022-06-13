package spring.net.mydream.service;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.net.mydream.entity.*;
import spring.net.mydream.utils.DaoManage;
import spring.net.mydream.utils.PreconditionException;
import spring.net.mydream.utils.ServiceManage;
import spring.net.mydream.utils.StandardOPs;
import spring.net.mydream.redis.CurrentUtils;

@Service
public class UserManageService{
	@Autowired CurrentUtils currentUtils;
	@Autowired private DaoManage DM;
		
	@Autowired private ServiceManage serviceManage;

	public Boolean updateInfo(Integer id,String name) throws PreconditionException{
		SysUser user = (SysUser)GetData(DM.getSysUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(user).equals(false))
		{
			user.setId(id);
			user.setUsername(name);
			DM.getSysUserDao().save(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public SysUser info(Integer id) throws PreconditionException{
		SysUser u = (SysUser)GetData(DM.getSysUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(u).equals(true))
		{
			return u;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public Boolean updatePwd(Integer id,String pwd) throws PreconditionException{
		SysUser user = (SysUser)GetData(DM.getSysUserDao().findById(id));
		
		if(StandardOPs.oclIsUndefined(user).equals(false))
		{
			user.setId(id);
			user.setPassword(pwd);
			DM.getSysUserDao().save(user);
			return true;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<SysUser> listUserByRole(Integer roleId) throws PreconditionException{
		SysRole role = (SysRole)GetData(DM.getSysRoleDao().findById(roleId));
		
		if(StandardOPs.oclIsUndefined(role).equals(false))
		{
			return role.getLinkedUser();
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
	public List<String> listUserPerms(Integer userid) throws PreconditionException{
		SysUser su = (SysUser)GetData(DM.getSysUserDao().findById(userid));
		SysRole role = DM.getSysRoleDao().findByLinkedUser(su);
		List<String> list = new ArrayList<String>();
		String s = null;
		
		if(StandardOPs.oclIsUndefined(role).equals(false))
		{
			for(SysMenu menu : role.getAssoicatedMenu()){
				s = menu.getPerms();
				list.add(s);
			
			}return list;
			
		}else{
		
		 	 throw new PreconditionException();
		
		}
		
	}
				
	public static Object GetData(Optional<?> op) {
		if (op.isPresent())
			return op.get();
		else 
			return null;
	}
}
