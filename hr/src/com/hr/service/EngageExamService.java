package com.hr.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hr.pojo.EngageExam;

public interface EngageExamService {
	public List<EngageExam> listAll();
	public int getCount(String major_kind_id, String major_id);
	public Boolean save(EngageExam engageExam);
	public Boolean update(EngageExam engageExam);
	public Boolean remove(int exa_id);
	public List<EngageExam> listByMajorId(String major_kind_id, String major_id);
}
