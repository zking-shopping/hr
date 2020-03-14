package com.hr.mapper;

import java.util.List;

import com.hr.pojo.ConfigFileSecondKind;

public interface ConfigFileSecondKindMapper {
	public boolean addConfigFileSecondKind(ConfigFileSecondKind fsk);
    public boolean removeConfigFileSecondKind(int fskId);
    public boolean updateConfigFileSecondKind(ConfigFileSecondKind fsk);
    public ConfigFileSecondKind queryConfigFileSecondKindById(int fskId);
    public List<ConfigFileSecondKind> queryAllConfigFileSecondKind();
}
