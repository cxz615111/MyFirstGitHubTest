package com.ziyyu.model._24_hotel;

import java.util.List;

public interface HotelInterfaceDAO {
	
	public void insert(HotelVO hotel);
	public void delete(String hotel_Num);
	public void update(HotelVO hotel);
	public HotelVO findByPrimaryKey(String hotel_Num);
	public List<HotelVO> getAll();
}
