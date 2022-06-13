package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class ListCRMessage{
	public Integer orgId;
	public Integer getOrgId() {
		return orgId;
	}
					
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public Integer parkManageId;
	public Integer getParkManageId() {
		return parkManageId;
	}
					
	public void setParkManageId(Integer parkManageId) {
		this.parkManageId = parkManageId;
	}
}
