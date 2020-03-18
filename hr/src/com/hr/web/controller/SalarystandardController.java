package com.hr.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.pojo.SalaryStandard;
import com.hr.service.impl.SalaryStandardServiceImpl;
import com.hr.web.controller.requestparamtype.SalaryStandardDetailsList;

@Controller
@RequestMapping("/salarystandard")
public class SalarystandardController {
	
	@Autowired
	SalaryStandardServiceImpl salaryStandardServiceImpl;
	
	@RequestMapping("/register")
	public String register(@ModelAttribute SalaryStandardDetailsList salaryStandardDetails){
		Boolean bl = salaryStandardServiceImpl.save(salaryStandardDetails);
		if(bl){
			return "salarystandard_register_success";
		}
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/checkList")
	public List<SalaryStandard> checkList(){
		System.out.println(111);
		ArrayList<SalaryStandard> list = (ArrayList<SalaryStandard>) salaryStandardServiceImpl.queryAll();
//		JSONArray ja = JSONArray.fromObject(list);
		return list;
	}
	
	@RequestMapping("/check")
	public String check(@RequestParam String ssdId){
		
		return null;
	}
}
