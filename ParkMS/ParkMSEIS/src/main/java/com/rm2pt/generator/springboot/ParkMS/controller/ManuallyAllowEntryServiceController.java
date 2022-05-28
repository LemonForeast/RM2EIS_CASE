package com.rm2pt.generator.springboot.ParkMS.controller;
import com.rm2pt.generator.springboot.ParkMS.service.*;
import com.rm2pt.generator.springboot.ParkMS.Message.*;
import java.util.Date;
import com.rm2pt.generator.springboot.ParkMS.utils.PreconditionException;
import com.rm2pt.generator.springboot.ParkMS.utils.StandardOPs;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/ManuallyAllowEntryService")
public class ManuallyAllowEntryServiceController {
	
	//@Autowired HttpSession hs;
	
	@Autowired 
	private ManuallyAllowEntryService manuallyAllowEntryService;
	
	@RequestMapping(value="/manuallyAllowEntry",method=RequestMethod.POST)	
	public String manuallyAllowEntry(ManuallyAllowEntryMessage manuallyAllowEntryMsg) {
		
		
		JSONObject object = new JSONObject();
		try {
			object.put("data", manuallyAllowEntryService.manuallyAllowEntry(manuallyAllowEntryMsg.plateNumber,manuallyAllowEntryMsg.type,manuallyAllowEntryMsg.time));
			object.put("msg", "success");
			object.put("code", "200");
		} catch (Exception e) {
			if (e instanceof PreconditionException) {
				object.put("msg", "PreConditionException");
			}else {
				object.put("msg", "PostConditionException");
				e.printStackTrace();
			}
			object.put("code", "400");
		}
		String s=JSON.toJSONString(object);
		return s;
	}
	
}
