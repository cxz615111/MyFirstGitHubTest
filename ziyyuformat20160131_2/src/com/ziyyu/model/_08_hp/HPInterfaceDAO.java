package com.ziyyu.model._08_hp;

import java.util.List;

public interface HPInterfaceDAO {
	
	public void insert(HPVO hp);
	public void delete(String hp_Num);
	public void update(HPVO hp);
	public HPVO findByPrimaryKey(String hp_Num);
	public List<HPVO> getAll();
	public List<HPVO> selectHPByCondition(Integer numberOfPeople,String keyWord_En ,String keyWord_zh,String hp_Air_Num);

}
