package com.ziyyu.model._24_hotel;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ziyyu.model._10_hp_hotelri.HP_HotelRIVO;
import com.ziyyu.model._23_ps_hotel_order.PS_Hotel_OrderVO;
import com.ziyyu.model._26_ps_hotel_item.PS_Hotel_ItemVO;

public class HotelVO implements java.io.Serializable{

	private String hotel_Num;
	private String hotel_Loc;
	private String hotel_Name_Zh;
	private String hotel_Name_En;
	private String hotel_Type;
	private String hotel_Tel;
	private String hotel_Star;
	private String hotel_Fax;
	private String checktime;
	private String hotel_Info;
	private String room_Pref;
	private Set<PS_Hotel_OrderVO> ps_Hotel_OrderVOs = new HashSet<PS_Hotel_OrderVO>();
	
	private Set<HP_HotelRIVO> hp_HotelRIVOs = new HashSet<HP_HotelRIVO>();
	
	private Set<PS_Hotel_ItemVO> ps_Hotel_ItemVOs = new HashSet<PS_Hotel_ItemVO>();


	public String getHotel_Num() {
		return hotel_Num;
	}

	public void setHotel_Num(String hotel_Num) {
		this.hotel_Num = hotel_Num;
	}

	public String getHotel_Loc() {
		return hotel_Loc;
	}

	public void setHotel_Loc(String hotel_Loc) {
		this.hotel_Loc = hotel_Loc;
	}

	public String getHotel_Name_Zh() {
		return hotel_Name_Zh;
	}

	public void setHotel_Name_Zh(String hotel_Name_Zh) {
		this.hotel_Name_Zh = hotel_Name_Zh;
	}

	public String getHotel_Name_En() {
		return hotel_Name_En;
	}

	public void setHotel_Name_En(String hotel_Name_En) {
		this.hotel_Name_En = hotel_Name_En;
	}

	public String getHotel_Type() {
		return hotel_Type;
	}

	public void setHotel_Type(String hotel_Type) {
		this.hotel_Type = hotel_Type;
	}

	public String getHotel_Tel() {
		return hotel_Tel;
	}

	public void setHotel_Tel(String hotel_Tel) {
		this.hotel_Tel = hotel_Tel;
	}

	public String getHotel_Star() {
		return hotel_Star;
	}

	public void setHotel_Star(String hotel_Star) {
		this.hotel_Star = hotel_Star;
	}

	public String getHotel_Fax() {
		return hotel_Fax;
	}

	public void setHotel_Fax(String hotel_Fax) {
		this.hotel_Fax = hotel_Fax;
	}

	public String getChecktime() {
		return checktime;
	}

	public void setChecktime(String checktime) {
		this.checktime = checktime;
	}

	public String getHotel_Info() {
		return hotel_Info;
	}

	public void setHotel_Info(String hotel_Info) {
		this.hotel_Info = hotel_Info;
	}

	public String getRoom_Pref() {
		return room_Pref;
	}

	public void setRoom_Pref(String room_Pref) {
		this.room_Pref = room_Pref;
	}

	public Set<PS_Hotel_OrderVO> getPs_Hotel_OrderVOs() {
		return ps_Hotel_OrderVOs;
	}

	public void setPs_Hotel_OrderVOs(Set<PS_Hotel_OrderVO> ps_Hotel_OrderVOs) {
		this.ps_Hotel_OrderVOs = ps_Hotel_OrderVOs;
	}

	public Set<HP_HotelRIVO> getHp_HotelRIVOs() {
		return hp_HotelRIVOs;
	}

	public void setHp_HotelRIVOs(Set<HP_HotelRIVO> hp_HotelRIVOs) {
		this.hp_HotelRIVOs = hp_HotelRIVOs;
	}

	public Set<PS_Hotel_ItemVO> getPs_Hotel_ItemVOs() {
		return ps_Hotel_ItemVOs;
	}

	public void setPs_Hotel_ItemVOs(Set<PS_Hotel_ItemVO> ps_Hotel_ItemVOs) {
		this.ps_Hotel_ItemVOs = ps_Hotel_ItemVOs;
	}

	
	
}

