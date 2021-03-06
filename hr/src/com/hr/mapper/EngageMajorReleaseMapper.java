package com.hr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hr.pojo.Bonus;
import com.hr.pojo.EngageMajorRelease;

public interface EngageMajorReleaseMapper {
	public boolean addEngageMajorRelease(EngageMajorRelease emr);
	public List<EngageMajorRelease> selectAllEngageMajorRelease();
	public boolean deleteEngageMajorReleaseById(int mre_id);
	public boolean updateEngageMajorRelease(EngageMajorRelease emr);
}
