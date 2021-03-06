package com.hr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hr.pojo.Bonus;
import com.hr.pojo.EngageInterview;

public interface EngageInterviewMapper {
	public List<EngageInterview> select();
	public EngageInterview selectByEinId(@Param("ein_id") int ein_id);
	public List<EngageInterview> selectForResult();
	public EngageInterview selectByResumeId(@Param("resume_id") int resume_id);
	public int insert(EngageInterview engageInterview);
	public int update(EngageInterview engageInterview);
	public int updateForResult(@Param("result") String result,@Param("ein_id") String ein_id);
	public int delete(@Param("ein_id") int ein_id);
}