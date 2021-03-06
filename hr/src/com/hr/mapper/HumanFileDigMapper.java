package com.hr.mapper;

import java.util.HashMap;
import java.util.List;

import com.hr.pojo.Bonus;
import com.hr.pojo.HumanFileDig;
import com.hr.pojo.HumanFileDig;

public interface HumanFileDigMapper {
	public boolean addHumanFileDig(HumanFileDig hfd);
    public boolean removeHumanFileDig(String name);
    public boolean removeHumanFileDigById(Short id);
    public boolean updateHumanFileDig(HumanFileDig hfd);
    public HumanFileDig queryHumanFileDigByName(String name);
    public List<HumanFileDig> queryAllHumanFileDig();
    public HumanFileDig queryHumanFileDigByHfd_id(int hfd_id);
    public List<HumanFileDig> queryByMapCondition(HashMap<String, String> map);
    public List<HumanFileDig> queryByKeyCondition(HashMap<String, String> map);

}
