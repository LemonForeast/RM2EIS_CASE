package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class QueryLibrarianMessage{
	public String librarianid;
	public String getLibrarianid() {
		return librarianid;
	}
					
	public void setLibrarianid(String librarianid) {
		this.librarianid = librarianid;
	}
}
