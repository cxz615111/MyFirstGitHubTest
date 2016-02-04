package com.ziyyu.model._26_ps_hotel_item;

import java.util.List;

public interface PS_Hotel_ItemInterfaceDAO {
	
	public void insert(PS_Hotel_ItemVO phi);
	public void update(PS_Hotel_ItemVO phi);
	public void delete(String ps_Hotel_Item);
	public PS_Hotel_ItemVO findByPrimaryKey(String ps_Hotel_Item);
	public List<PS_Hotel_ItemVO> getAll();

}
