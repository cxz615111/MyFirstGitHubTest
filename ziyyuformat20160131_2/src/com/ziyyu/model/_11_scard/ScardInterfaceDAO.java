package com.ziyyu.model._11_scard;

import java.util.List;

public interface ScardInterfaceDAO {
	
	public void insert(ScardVO scard);
	public void update(ScardVO scard);
	public void delete(String hp_Scard_Num);
	public ScardVO findByPrimaryKey(String hp_Scard_Num);
	public List<ScardVO> getAll();
}
