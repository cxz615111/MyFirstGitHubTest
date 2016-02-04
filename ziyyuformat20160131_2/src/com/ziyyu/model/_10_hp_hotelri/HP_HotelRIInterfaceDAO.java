package com.ziyyu.model._10_hp_hotelri;

import java.util.List;

public interface HP_HotelRIInterfaceDAO {
	
	public void insert(HP_HotelRIVO hhRI);
	public void update(HP_HotelRIVO hhRI);
	public void delete(String hp_HotelRI_Num);
	public HP_HotelRIVO findByPrimaryKey(String hp_HotelRI_Num);
	public List<HP_HotelRIVO> getAll();

}
