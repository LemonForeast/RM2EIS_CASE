package spring.net.mydream.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import spring.net.mydream.entity.*;

public class CreateFacultyMessage{
	public String userID;
	public String getUserID() {
		return userID;
	}
					
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String name;
	public String getName() {
		return name;
	}
					
	public void setName(String name) {
		this.name = name;
	}
	public Integer sex;
	public Integer getSex() {
		return sex;
	}
					
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String password;
	public String getPassword() {
		return password;
	}
					
	public void setPassword(String password) {
		this.password = password;
	}
	public String email;
	public String getEmail() {
		return email;
	}
					
	public void setEmail(String email) {
		this.email = email;
	}
	public String faculty;
	public String getFaculty() {
		return faculty;
	}
					
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public Integer position;
	public Integer getPosition() {
		return position;
	}
					
	public void setPosition(Integer position) {
		this.position = position;
	}
	public Integer status;
	public Integer getStatus() {
		return status;
	}
					
	public void setStatus(Integer status) {
		this.status = status;
	}
}
