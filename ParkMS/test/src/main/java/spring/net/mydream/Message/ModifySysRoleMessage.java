package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ModifySysRoleMessage{
	public Integer id;
	public Integer getId() {
		return id;
	}
					
	public void setId(Integer id) {
		this.id = id;
	}
	public String roleSign;
	public String getRoleSign() {
		return roleSign;
	}
					
	public void setRoleSign(String roleSign) {
		this.roleSign = roleSign;
	}
}