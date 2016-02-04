package com.ziyyu.model._09_hp_air_ticket;

import java.io.Serializable;
import java.util.Set;

import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._25_airline.AirlineVO;

public class HP_Air_TicketVO implements Serializable {

	private String hp_Air_Num;    
	private java.sql.Date hp_Flight_Date;
	private java.sql.Date hp_Back_Date;
	private String origin;                                   
	private String destination;                              
	private AirlineVO airlineVO;                                                                                                
	private String hp_Air_Class;                             
	private Integer hp_Air_Price;                                                                    
	private Integer hp_Air_Inv;                               
	private Set<HPVO> hpVOs;
	
	public String getHp_Air_Num() {
		return hp_Air_Num;
	}
	public void setHp_Air_Num(String hp_Air_Num) {
		this.hp_Air_Num = hp_Air_Num;
	}
	public java.sql.Date getHp_Flight_Date() {
		return hp_Flight_Date;
	}
	public void setHp_Flight_Date(java.sql.Date hp_Flight_Date) {
		this.hp_Flight_Date = hp_Flight_Date;
	}
	public java.sql.Date getHp_Back_Date() {
		return hp_Back_Date;
	}
	public void setHp_Back_Date(java.sql.Date hp_Back_Date) {
		this.hp_Back_Date = hp_Back_Date;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public AirlineVO getAirlineVO() {
		return airlineVO;
	}
	public void setAirlineVO(AirlineVO airlineVO) {
		this.airlineVO = airlineVO;
	}
	public String getHp_Air_Class() {
		return hp_Air_Class;
	}
	public void setHp_Air_Class(String hp_Air_Class) {
		this.hp_Air_Class = hp_Air_Class;
	}
	public Integer getHp_Air_Price() {
		return hp_Air_Price;
	}
	public void setHp_Air_Price(Integer hp_Air_Price) {
		this.hp_Air_Price = hp_Air_Price;
	}
	public Integer getHp_Air_Inv() {
		return hp_Air_Inv;
	}
	public void setHp_Air_Inv(Integer hp_Air_Inv) {
		this.hp_Air_Inv = hp_Air_Inv;
	}
	public Set<HPVO> getHpVOs() {
		return hpVOs;
	}
	public void setHpVOs(Set<HPVO> hpVOs) {
		this.hpVOs = hpVOs;
	}
	
	
}
