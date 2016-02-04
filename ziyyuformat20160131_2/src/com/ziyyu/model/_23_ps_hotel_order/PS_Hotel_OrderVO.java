package com.ziyyu.model._23_ps_hotel_order;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._24_hotel.HotelDAO;
import com.ziyyu.model._24_hotel.HotelVO;

public class PS_Hotel_OrderVO implements Serializable{


	private String ps_Hotel_Order;
	private HotelVO hotelVO;
	private MemberVO memberVO;
	private Timestamp psh_Pay_Date;
	private Integer psh_Pay_Amount;
	private java.sql.Date psh_Checkin;
	private Integer psh_Pay;
	private String psh_Order_Stat;
	

	public String getPs_Hotel_Order() {
		return ps_Hotel_Order;
	}
	public void setPs_Hotel_Order(String ps_Hotel_Order) {
		this.ps_Hotel_Order = ps_Hotel_Order;
	}
	public HotelVO getHotelVO() {
		return hotelVO;
	}
	public void setHotelVO(HotelVO hotelVO) {
		this.hotelVO = hotelVO;
	}
	public MemberVO getMemberVO() {
		return memberVO;
	}
	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	public Timestamp getPsh_Pay_Date() {
		return psh_Pay_Date;
	}
	public void setPsh_Pay_Date(Timestamp psh_Pay_Date) {
		this.psh_Pay_Date = psh_Pay_Date;
	}
	public Integer getPsh_Pay_Amount() {
		return psh_Pay_Amount;
	}
	public void setPsh_Pay_Amount(Integer psh_Pay_Amount) {
		this.psh_Pay_Amount = psh_Pay_Amount;
	}
	public java.sql.Date getPsh_Checkin() {
		return psh_Checkin;
	}
	public void setPsh_Checkin(java.sql.Date psh_Checkin) {
		this.psh_Checkin = psh_Checkin;
	}
	public Integer getPsh_Pay() {
		return psh_Pay;
	}
	public void setPsh_Pay(Integer psh_Pay) {
		this.psh_Pay = psh_Pay;
	}
	public String getPsh_Order_Stat() {
		return psh_Order_Stat;
	}
	public void setPsh_Order_Stat(String psh_Order_Stat) {
		this.psh_Order_Stat = psh_Order_Stat;
	}
	
	
	
	
}