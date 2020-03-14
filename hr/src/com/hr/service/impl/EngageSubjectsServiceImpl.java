package com.hr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.EngageSubjectsMapper;
import com.hr.pojo.EngageSubjects;
import com.hr.service.EngageSubjectsService;

@Service
public class EngageSubjectsServiceImpl implements EngageSubjectsService{
	@Autowired
	EngageSubjectsMapper engageSubjectsMapper;
	
	public Boolean save(EngageSubjects engageSubjects){
		if(engageSubjectsMapper.insert(engageSubjects) > 0)
			return true;
		return false;
	}
	public Boolean update(EngageSubjects engageSubjects){
		if(engageSubjectsMapper.update(engageSubjects) > 0)
			return true;
		return false;
	}
	
	public List<EngageSubjects> listEngageSubjects(String firstKindName,
			String keyWord, String start, String end) {
		return engageSubjectsMapper.select(firstKindName, keyWord, start, end);
	}
}
