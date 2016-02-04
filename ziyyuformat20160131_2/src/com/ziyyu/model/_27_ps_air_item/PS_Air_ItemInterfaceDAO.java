package com.ziyyu.model._27_ps_air_item;

import java.util.List;

public interface PS_Air_ItemInterfaceDAO {
	
	public void insert(PS_Air_ItemVO pai);
	public void update(PS_Air_ItemVO pai);
	public void delete(String ps_Air_Item);
	public PS_Air_ItemVO findByPrimaryKey(String ps_Air_Item);
	public List<PS_Air_ItemVO> getAll();

}
