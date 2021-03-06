package com.hr.web.controller;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hr.pojo.ConfigMajor;
import com.hr.pojo.ConfigMajorKind;
import com.hr.service.ConfigMajorKindService;
import com.hr.service.ConfigMajorService;
import com.hr.util.CharacterEncodingHelper;

@Controller
@RequestMapping("/configMajor")
public class ConfigMajorController {
	@Autowired
	ConfigMajorService configMajorServiceImpl;
	@Autowired
	ConfigMajorKindService configMajorKindService;
	
	private ModelAndView mav = new ModelAndView();
	
	@RequestMapping(value="/toDelete")
	@ResponseBody
	public String toDelete(@RequestParam("delete_name")String major_name){
		major_name = CharacterEncodingHelper.getChinese(major_name);
		boolean b = configMajorServiceImpl.deleteConfigMajor(major_name);
		return String.valueOf(b);
	}
	
	@RequestMapping("/selectAll")
	public ModelAndView selectAll() {
		List<ConfigMajor> list = configMajorServiceImpl.selectAllConfigMajor();
		mav.setViewName("major");
		mav.addObject("majorList",list);
		return mav;
	}
	
	@RequestMapping("/selectIdByName")
	public ModelAndView selectIdByName(String major_name) {
		String major_id = configMajorServiceImpl.selectConfigMajorIdByName(major_name);
		mav.setViewName("");
		mav.addObject("majorId",major_id);
		return mav;
	}
	
	/**
	 * 用于简历筛选功能
	 */
	@RequestMapping("/selectAllForEngage")
	public String selectAllForEngage(String choose, HttpServletRequest request){
		List<ConfigMajor> list = configMajorServiceImpl.selectAllConfigMajor();
		request.setAttribute("configMajorList", list);
		
		List<ConfigMajorKind> list2 = configMajorKindService.selectAllConfigMajorKind();
		request.setAttribute("configMajorKindList", list2);
		
		if("1".equals(choose)){
			return "engage_resume_query_locate";
		}
		if("2".equals(choose)){
			return "engage_resume_query_effective_locate";
		}
		if("3".equals(choose)){
			return "engage_interview_query_locate";
		}
		return "engage_resume_register";
	}
	
}
