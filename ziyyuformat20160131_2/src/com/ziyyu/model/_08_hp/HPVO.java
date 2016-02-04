package com.ziyyu.model._08_hp;

import java.io.Serializable;
import java.util.Set;

import com.ziyyu.model._09_hp_air_ticket.HP_Air_TicketVO;
import com.ziyyu.model._11_scard.ScardVO;
import com.ziyyu.model._12_taxi.TaxiVO;
import com.ziyyu.model._16_hp_trans_ct.HP_Trans_CTVO;
import com.ziyyu.model._17_hp_ticket_ct.HP_Ticket_CTVO;
import com.ziyyu.model._18_hp_easy_ct.HP_Easy_CTVO;
import com.ziyyu.model._19_hp_hotelri_ct.HP_HotelRI_CTVO;
import com.ziyyu.model._20_hp_pur_order.HP_Pur_OrderVO;

public class HPVO implements Serializable {
	private String hp_Num;
	private String hp_Name_Zh;
	private String hp_Name_En;
	private HP_Air_TicketVO hp_Air_Ticket;
	private Integer hp_Air_Amount;
	private ScardVO scard;
	private Integer hp_Scard_Amount;
	private TaxiVO taxi;
	private Integer hp_Price;
	private Integer hp_Inv;
	private String hp_Stat;
	private Set<HP_Ticket_CTVO> hp_Ticket_CtVOs ;
	private Set<HP_HotelRI_CTVO> hp_Hotelri_CtVOs ;
	private Set<HP_Trans_CTVO> hp_Trans_CtVOs;
	private Set<HP_Pur_OrderVO> hp_Pur_OrderVOs ;
	private Set<HP_Easy_CTVO> hp_Easy_CtVOs;
	public String getHp_Num() {
		return hp_Num;
	}
	public void setHp_Num(String hp_Num) {
		this.hp_Num = hp_Num;
	}
	public String getHp_Name_Zh() {
		return hp_Name_Zh;
	}
	public void setHp_Name_Zh(String hp_Name_Zh) {
		this.hp_Name_Zh = hp_Name_Zh;
	}
	public String getHp_Name_En() {
		return hp_Name_En;
	}
	public void setHp_Name_En(String hp_Name_En) {
		this.hp_Name_En = hp_Name_En;
	}
	public HP_Air_TicketVO getHp_Air_Ticket() {
		return hp_Air_Ticket;
	}
	public void setHp_Air_Ticket(HP_Air_TicketVO hp_Air_Ticket) {
		this.hp_Air_Ticket = hp_Air_Ticket;
	}
	public Integer getHp_Air_Amount() {
		return hp_Air_Amount;
	}
	public void setHp_Air_Amount(Integer hp_Air_Amount) {
		this.hp_Air_Amount = hp_Air_Amount;
	}
	public ScardVO getScard() {
		return scard;
	}
	public void setScard(ScardVO scard) {
		this.scard = scard;
	}
	public Integer getHp_Scard_Amount() {
		return hp_Scard_Amount;
	}
	public void setHp_Scard_Amount(Integer hp_Scard_Amount) {
		this.hp_Scard_Amount = hp_Scard_Amount;
	}
	public TaxiVO getTaxi() {
		return taxi;
	}
	public void setTaxi(TaxiVO taxi) {
		this.taxi = taxi;
	}
	public Integer getHp_Price() {
		return hp_Price;
	}
	public void setHp_Price(Integer hp_Price) {
		this.hp_Price = hp_Price;
	}
	public Integer getHp_Inv() {
		return hp_Inv;
	}
	public void setHp_Inv(Integer hp_Inv) {
		this.hp_Inv = hp_Inv;
	}
	public String getHp_Stat() {
		return hp_Stat;
	}
	public void setHp_Stat(String hp_Stat) {
		this.hp_Stat = hp_Stat;
	}
	public Set<HP_Ticket_CTVO> getHp_Ticket_CtVOs() {
		return hp_Ticket_CtVOs;
	}
	public void setHp_Ticket_CtVOs(Set<HP_Ticket_CTVO> hp_Ticket_CtVOs) {
		this.hp_Ticket_CtVOs = hp_Ticket_CtVOs;
	}
	public Set<HP_HotelRI_CTVO> getHp_Hotelri_CtVOs() {
		return hp_Hotelri_CtVOs;
	}
	public void setHp_Hotelri_CtVOs(Set<HP_HotelRI_CTVO> hp_Hotelri_CtVOs) {
		this.hp_Hotelri_CtVOs = hp_Hotelri_CtVOs;
	}
	public Set<HP_Trans_CTVO> getHp_Trans_CtVOs() {
		return hp_Trans_CtVOs;
	}
	public void setHp_Trans_CtVOs(Set<HP_Trans_CTVO> hp_Trans_CtVOs) {
		this.hp_Trans_CtVOs = hp_Trans_CtVOs;
	}
	public Set<HP_Pur_OrderVO> getHp_Pur_OrderVOs() {
		return hp_Pur_OrderVOs;
	}
	public void setHp_Pur_OrderVOs(Set<HP_Pur_OrderVO> hp_Pur_OrderVOs) {
		this.hp_Pur_OrderVOs = hp_Pur_OrderVOs;
	}
	public Set<HP_Easy_CTVO> getHp_Easy_CtVOs() {
		return hp_Easy_CtVOs;
	}
	public void setHp_Easy_CtVOs(Set<HP_Easy_CTVO> hp_Easy_CtVOs) {
		this.hp_Easy_CtVOs = hp_Easy_CtVOs;
	}
	
	
	
	
	
	
	
}
