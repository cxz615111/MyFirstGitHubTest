package com.ziyyu.model._28_admin;

import java.util.List;



public interface AdminInterfaceDAO {
	public AdminVO findByPrimaryKey(String Admin_Account);
	public List<AdminVO> getAll();
}
