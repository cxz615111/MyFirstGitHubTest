package com.ziyyu.model._26_ps_hotel_item;

import com.ziyyu.model._24_hotel.HotelVO;

public class PS_Hotel_ItemVO implements java.io.Serializable{
	private String ps_Hotel_Item;
	private HotelVO hotelVO;
	private Integer guest_Num;
	private String room_Name;
	private String ps_Status;
	public String getPs_Hotel_Item() {
		return ps_Hotel_Item;
	}
	public void setPs_Hotel_Item(String ps_Hotel_Item) {
		this.ps_Hotel_Item = ps_Hotel_Item;
	}
	public HotelVO getHotelVO() {
		return hotelVO;
	}
	public void setHotelVO(HotelVO hotelVO) {
		this.hotelVO = hotelVO;
	}
	public Integer getGuest_Num() {
		return guest_Num;
	}
	public void setGuest_Num(Integer guest_Num) {
		this.guest_Num = guest_Num;
	}
	public String getRoom_Name() {
		return room_Name;
	}
	public void setRoom_Name(String room_Name) {
		this.room_Name = room_Name;
	}
	public String getPs_Status() {
		return ps_Status;
	}
	public void setPs_Status(String ps_Status) {
		this.ps_Status = ps_Status;
	}
	
	

}
