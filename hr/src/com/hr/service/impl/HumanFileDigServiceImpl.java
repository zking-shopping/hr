package com.hr.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mapper.HumanFileDigMapper;
import com.hr.mapper.HumanFileMapper;
import com.hr.pojo.HumanFile;
import com.hr.pojo.HumanFileDig;
import com.hr.service.HumanFileDigService;

@Service
public class HumanFileDigServiceImpl implements HumanFileDigService {
	@Autowired
    HumanFileDigMapper humanFileDigMapper;

	@Override
	public boolean addHumanFileDig(HumanFileDig huf) {
		// TODO Auto-generated method stub
		return humanFileDigMapper.addHumanFileDig(huf);
	}

	@Override
	public boolean removeHumanFileDig(String name) {
		// TODO Auto-generated method stub
		return humanFileDigMapper.removeHumanFileDig(name);
	}

	@Override
	public boolean updateHumanFileDig(HumanFileDig huf) {
		// TODO Auto-generated method stub
		return humanFileDigMapper.updateHumanFileDig(huf);
	}

	@Override
	public HumanFileDig queryHumanFileDigByName(String name) {
		// TODO Auto-generated method stub
		return humanFileDigMapper.queryHumanFileDigByName(name);
	}

	@Override
	public List<HumanFileDig> queryAllHumanFileDig() {
		// TODO Auto-generated method stub
		return humanFileDigMapper.queryAllHumanFileDig();
	}

	

	@Override
	public HumanFileDig queryHumanFileDigByHfd_id(int hfd_id) {
		// TODO Auto-generated method stub
		return humanFileDigMapper.queryHumanFileDigByHfd_id(hfd_id);
	}

	@Override
	public List<HumanFileDig> queryByMapCondition(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		return humanFileDigMapper.queryByMapCondition(map);
	}

	@Override
	public List<HumanFileDig> queryByKeyCondition(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		return humanFileDigMapper.queryByKeyCondition(map);
	}

	@Override
	public boolean removeHumanFileDigById(Short id) {
		// TODO Auto-generated method stub
		return humanFileDigMapper.removeHumanFileDigById(id);
	}
	

	
}
