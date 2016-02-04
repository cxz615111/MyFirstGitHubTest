package com.ziyyu.model._10_hp_hotelri;

import java.io.Serializable;
import java.util.Set;

import com.ziyyu.model._19_hp_hotelri_ct.HP_HotelRI_CTVO;
import com.ziyyu.model._24_hotel.HotelVO;

public class HP_HotelRIVO implements Serializable {
	private String hp_HotelRI_Num;
	private HotelVO hotel;
	private java.sql.Date hp_Hotel_Checktime;
	private Integer hp_Hotel_Night;
	private String room_Name;
	private String bed;
	private Integer room_Num;
	private Integer hp_Hotel_Price;
	private Set<HP_HotelRI_CTVO> hp_Hotelri_CtVOs;
	public String getHp_HotelRI_Num() {
		return hp_HotelRI_Num;
	}
	public void setHp_HotelRI_Num(String hp_HotelRI_Num) {
		this.hp_HotelRI_Num = hp_HotelRI_Num;
	}
	public HotelVO getHotel() {
		return hotel;
	}
	public void setHotel(HotelVO hotel) {
		this.hotel = hotel;
	}
	public java.sql.Date getHp_Hotel_Checktime() {
		return hp_Hotel_Checktime;
	}
	public void setHp_Hotel_Checktime(java.sql.Date hp_Hotel_Checktime) {
		this.hp_Hotel_Checktime = hp_Hotel_Checktime;
	}
	public Integer getHp_Hotel_Night() {
		return hp_Hotel_Night;
	}
	public void setHp_Hotel_Night(Integer hp_Hotel_Night) {
		this.hp_Hotel_Night = hp_Hotel_Night;
	}
	public String getRoom_Name() {
		return room_Name;
	}
	public void setRoom_Name(String room_Name) {
		this.room_Name = room_Name;
	}
	public String getBed() {
		return bed;
	}
	public void setBed(String bed) {
		this.bed = bed;
	}
	public Integer getRoom_Num() {
		return room_Num;
	}
	public void setRoom_Num(Integer room_Num) {
		this.room_Num = room_Num;
	}
	public Integer getHp_Hotel_Price() {
		return hp_Hotel_Price;
	}
	public void setHp_Hotel_Price(Integer hp_Hotel_Price) {
		this.hp_Hotel_Price = hp_Hotel_Price;
	}
	public Set<HP_HotelRI_CTVO> getHp_Hotelri_CtVOs() {
		return hp_Hotelri_CtVOs;
	}
	public void setHp_Hotelri_CtVOs(Set<HP_HotelRI_CTVO> hp_Hotelri_CtVOs) {
		this.hp_Hotelri_CtVOs = hp_Hotelri_CtVOs;
	}
	
	

	
}
