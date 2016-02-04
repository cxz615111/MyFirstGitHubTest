package com.ziyyu.model._22_ps_air_ticket_order;

import java.io.Serializable;
import java.sql.Timestamp;

import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._25_airline.AirlineVO;



public class PS_Air_Ticket_OrderVO implements Serializable{

	private String ps_Air_Order;
	private AirlineVO airlineVO;
	private MemberVO memberVO;
	private Integer psa_Price;
	private String psa_Flight;
	private String psa_Order_Stat;
	private Timestamp psa_Pay_Date;
	private Integer psa_Pay_Amount;
	
	public String getPs_Air_Order() {
		return ps_Air_Order;
	}
	public void setPs_Air_Order(String ps_Air_Order) {
		this.ps_Air_Order = ps_Air_Order;
	}
	public AirlineVO getAirlineVO() {
		return airlineVO;
	}
	public void setAirlineVO(AirlineVO airlineVO) {
		this.airlineVO = airlineVO;
	}
	public MemberVO getMemberVO() {
		return memberVO;
	}
	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	public Integer getPsa_Price() {
		return psa_Price;
	}
	public void setPsa_Price(Integer psa_Price) {
		this.psa_Price = psa_Price;
	}
	public String getPsa_Flight() {
		return psa_Flight;
	}
	public void setPsa_Flight(String psa_Flight) {
		this.psa_Flight = psa_Flight;
	}
	public String getPsa_Order_Stat() {
		return psa_Order_Stat;
	}
	public void setPsa_Order_Stat(String psa_Order_Stat) {
		this.psa_Order_Stat = psa_Order_Stat;
	}
	public Timestamp getPsa_Pay_Date() {
		return psa_Pay_Date;
	}
	public void setPsa_Pay_Date(Timestamp psa_Pay_Date) {
		this.psa_Pay_Date = psa_Pay_Date;
	}
	public Integer getPsa_Pay_Amount() {
		return psa_Pay_Amount;
	}
	public void setPsa_Pay_Amount(Integer psa_Pay_Amount) {
		this.psa_Pay_Amount = psa_Pay_Amount;
	}
}
