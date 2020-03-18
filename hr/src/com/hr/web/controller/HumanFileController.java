package com.hr.web.controller;  

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hr.pojo.ConfigFileSecondKind;
import com.hr.pojo.HumanFile;
import com.hr.service.ConfigFileSecondKindService;
import com.hr.service.ConfigFileSecondKindService;
import com.hr.service.ConfigMajorService;
import com.hr.service.HumanFileService;

@Controller
@RequestMapping("/humanfile")
public class HumanFileController {
	@Autowired
    HumanFileService humanFileServiceImpl;
	
	@RequestMapping("/humanRigister")
	public ModelAndView addHumanRigister(@RequestParam String firstKindName,@RequestParam String secondKindName,@RequestParam String thirdKindName,@RequestParam String humanMajorKindName,@RequestParam String humanMajorName
			,@RequestParam String humanProDesignation,@RequestParam String humanName,@RequestParam String humanSex,@RequestParam String humanEmail,@RequestParam String humanTelephone,@RequestParam String humanQq,@RequestParam String humanMobilephone,@RequestParam String humanAddress,
			@RequestParam String humanPostcode,@RequestParam String humanNationality,@RequestParam String humanBirthplace,@RequestParam String str_humanBirthday,@RequestParam String humanRace,@RequestParam String humanReligion,@RequestParam String humanParty,
			@RequestParam String humanIdCard,@RequestParam String humanSocietySecurityId,@RequestParam String humanAge,@RequestParam String humanEducatedDegree,@RequestParam String humanEducatedYears,@RequestParam String humanEducatedMajor,@RequestParam String salaryStandardName,@RequestParam String humanBank,
			@RequestParam String humanAccount,@RequestParam String register,@RequestParam String remark,@RequestParam String str_registTime,@RequestParam String humanSpeciality,@RequestParam String humanHobby,@RequestParam String humanHistroyRecords,@RequestParam String humanFamilyMembership){
	    HumanFile hf = new HumanFile();
	    //获得一级机构
	    String[] first = splitStr(firstKindName);
	    hf.setFirst_kind_id(first[0]);
	    hf.setFirst_kind_name(first[1]);
	    //获得二级机构
	    String[] second = splitStr(secondKindName);
	    hf.setSecond_kind_id(second[0]);
	    hf.setSecond_kind_name(second[1]);
	    //获得三级机构
	    String[] third = splitStr(thirdKindName);
	    hf.setThird_kind_id(third[0]);
	    hf.setThird_kind_name(third[1]);
	    
	    //获得职位分类 humanMajorKindName
	    String[] majorKind = splitStr(humanMajorKindName);
	    hf.setHuman_major_kind_id(majorKind[0]);
	    hf.setHuman_major_kind_name(majorKind[1]);
	    
	    //获得职位名称  hunmaMajorName
	    String[] major = splitStr(humanMajorName);
	    hf.setHuman_major_id(major[0]);
	    hf.setHuman_major_name(major[1]);
	    
	    //获得标准薪酬  salaryStandardName
	    String[] salary = splitStr(salaryStandardName);
	    hf.setSalary_standard_id(salary[0]);
	    hf.setSalary_standard_name(salary[1]);
	    
	   
	    hf.setHuman_pro_designation(humanProDesignation);
	    hf.setHuman_name(humanName);
	    hf.setHuman_sex(humanSex);
	    hf.setHuman_email(humanEmail);
	    hf.setHuman_telephone(humanTelephone);
	    hf.setHuman_qq(humanQq);
	    hf.setHuman_mobilephone(humanMobilephone);
	    hf.setHuman_address(humanAddress);
	    hf.setHuman_postcode(humanPostcode);
	    hf.setHuman_nationality(humanNationality);
	    hf.setHuman_birthplace(humanBirthplace);
	    Date date;
	    Date regist_time;
		try {
			regist_time = new SimpleDateFormat("yyyy-MM-dd").parse(str_registTime);
			date = new SimpleDateFormat("yyyy-MM-dd").parse(str_humanBirthday);
			hf.setHuman_birthday(date);
			hf.setRegist_time(regist_time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		hf.setHuman_race(humanRace);
		hf.setHuman_religion(humanReligion);
		hf.setHuman_party(humanParty);
		hf.setHuman_id_card(humanIdCard);
		int h_age = Integer.parseInt(humanAge);
		Short age = (short) h_age;
		hf.setHuman_age(age);
		hf.setHuman_educated_degree(humanEducatedDegree);
		int h_year = Integer.parseInt(humanEducatedYears);
		Short year = (short) h_year;
		hf.setHuman_educated_years(year);
		hf.setHuman_educated_major(humanEducatedMajor);
		hf.setHuman_bank(humanBank);
		hf.setHuman_account(humanAccount);
		hf.setRegister(register);
		hf.setRemark(remark);
		hf.setHuman_speciality(humanSpeciality);
		hf.setHuman_hobby(humanHobby);
		hf.setHuman_histroy_records(humanHistroyRecords);
		hf.setHuman_family_membership(humanFamilyMembership);
		Short human_file_status = 0;
		hf.setHuman_file_status(human_file_status);
		System.out.println("档案审核中");
	    ModelAndView mav = new ModelAndView();
	    mav.setViewName("human_registing");
	    
	    return mav;
	}
	
	public String[] splitStr(String str){
		String[] strs = str.split("/");
		return strs;
	}

}