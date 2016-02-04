package com.ziyyu.model._25_airline;

import java.util.Set;

import com.ziyyu.model._09_hp_air_ticket.HP_Air_TicketVO;
import com.ziyyu.model._22_ps_air_ticket_order.PS_Air_Ticket_OrderVO;
import com.ziyyu.model._27_ps_air_item.PS_Air_ItemVO;


public class AirlineVO implements java.io.Serializable{
	private String carrier_Num;
	private String air_Name_Zh;
	private String air_Name_En;
	private String air_Fax;
	private String air_Tel;
	private String air_Address;
	private Set<PS_Air_Ticket_OrderVO> ps_Air_Ticket_OrderVOs ;
	private Set<HP_Air_TicketVO> hp_Air_TicketVOs ;
	private Set<PS_Air_ItemVO> ps_Air_ItemVOs ;
	
 
	@Override
	public String toString() {
		return carrier_Num ;
	}
	public String getCarrier_Num() {
		return carrier_Num;
	}
	public void setCarrier_Num(String carrier_Num) {
		this.carrier_Num = carrier_Num;
	}
	public String getAir_Name_Zh() {
		return air_Name_Zh;
	}
	public void setAir_Name_Zh(String air_Name_Zh) {
		this.air_Name_Zh = air_Name_Zh;
	}
	public String getAir_Name_En() {
		return air_Name_En;
	}
	public void setAir_Name_En(String air_Name_En) {
		this.air_Name_En = air_Name_En;
	}
	public String getAir_Fax() {
		return air_Fax;
	}
	public void setAir_Fax(String air_Fax) {
		this.air_Fax = air_Fax;
	}
	public String getAir_Tel() {
		return air_Tel;
	}
	public void setAir_Tel(String air_Tel) {
		this.air_Tel = air_Tel;
	}
	public String getAir_Address() {
		return air_Address;
	}
	public void setAir_Address(String air_Address) {
		this.air_Address = air_Address;
	}
	public Set<PS_Air_Ticket_OrderVO> getPs_Air_Ticket_OrderVOs() {
		return ps_Air_Ticket_OrderVOs;
	}
	public void setPs_Air_Ticket_OrderVOs(
			Set<PS_Air_Ticket_OrderVO> ps_Air_Ticket_OrderVOs) {
		this.ps_Air_Ticket_OrderVOs = ps_Air_Ticket_OrderVOs;
	}
	public Set<HP_Air_TicketVO> getHp_Air_TicketVOs() {
		return hp_Air_TicketVOs;
	}
	public void setHp_Air_TicketVOs(Set<HP_Air_TicketVO> hp_Air_TicketVOs) {
		this.hp_Air_TicketVOs = hp_Air_TicketVOs;
	}
	public Set<PS_Air_ItemVO> getPs_Air_ItemVOs() {
		return ps_Air_ItemVOs;
	}
	public void setPs_Air_ItemVOs(Set<PS_Air_ItemVO> ps_Air_ItemVOs) {
		this.ps_Air_ItemVOs = ps_Air_ItemVOs;
	}
	
	
	
	
}
