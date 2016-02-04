package com.ziyyu.model._27_ps_air_item;

import com.ziyyu.model._25_airline.AirlineVO;

public class PS_Air_ItemVO implements java.io.Serializable {
	private String ps_Air_Item;
	private AirlineVO airlineVO;
	private String ps_Air_Class;
	private String ps_Status;
	public String getPs_Air_Item() {
		return ps_Air_Item;
	}
	public void setPs_Air_Item(String ps_Air_Item) {
		this.ps_Air_Item = ps_Air_Item;
	}
	public AirlineVO getAirlineVO() {
		return airlineVO;
	}
	public void setAirlineVO(AirlineVO airlineVO) {
		this.airlineVO = airlineVO;
	}
	public String getPs_Air_Class() {
		return ps_Air_Class;
	}
	public void setPs_Air_Class(String ps_Air_Class) {
		this.ps_Air_Class = ps_Air_Class;
	}
	public String getPs_Status() {
		return ps_Status;
	}
	public void setPs_Status(String ps_Status) {
		this.ps_Status = ps_Status;
	}
	
	
	
	
	
}
