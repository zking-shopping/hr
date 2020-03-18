package com.hr.service;

import java.util.List;

import com.hr.pojo.EngageResume;

public interface EngageResumeService {
	public List<EngageResume> listAll();
	public EngageResume getByResId(int res_id);
	public Boolean save(EngageResume engageResume);
	public Boolean update(EngageResume engageResume);
	public Boolean remove(int res_id);
	public List<EngageResume> listFind(String human_major_kind_id, String human_major_id, String keyWord, String start, String end);
	public List<EngageResume> listFindForEffective(String human_major_kind_id, String human_major_id, String keyWord, String start, String end);
}