package com.hr.service;

import com.hr.pojo.SalaryGrant;
import com.hr.web.controller.requestparamtype.SalaryGrantAndDetails;
import com.hr.web.controller.requestparamtype.SalaryStandardDetailsList;

public interface SalaryGrantService {
	

	public Boolean save(SalaryGrantAndDetails salaryGrantAndDetails);
}