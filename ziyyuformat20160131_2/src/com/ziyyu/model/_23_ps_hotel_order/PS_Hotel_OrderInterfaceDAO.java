package com.ziyyu.model._23_ps_hotel_order;

import java.util.List;

import com.ziyyu.model._24_hotel.HotelVO;


public interface PS_Hotel_OrderInterfaceDAO {
	public void insert(PS_Hotel_OrderVO pho);
	public void delete(String ps_Hotel_Order,HotelVO hotelVO);//??
	public void update(PS_Hotel_OrderVO pho);
	public PS_Hotel_OrderVO findByPrimaryKey(String ps_Hotel_Order,HotelVO hotelVO);//??
	public List<PS_Hotel_OrderVO> getAll();
}
