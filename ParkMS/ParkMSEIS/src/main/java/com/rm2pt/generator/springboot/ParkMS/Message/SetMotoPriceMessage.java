package com.rm2pt.generator.springboot.ParkMS.Message;
import java.sql.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import java.util.List;
import com.rm2pt.generator.springboot.ParkMS.entity.*;

public class SetMotoPriceMessage{
	public int parkID;
	public int getParkID() {
		return parkID;
	}
					
	public void setParkID(int parkID) {
		this.parkID = parkID;
	}
	public double price;
	public double getPrice() {
		return price;
	}
					
	public void setPrice(double price) {
		this.price = price;
	}
}
