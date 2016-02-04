package com.ziyyu.model._13_trans;

import java.util.Set;

import com.ziyyu.model._16_hp_trans_ct.HP_Trans_CTVO;



public class TransVO  implements java.io.Serializable{
	private String trans_Ticket_Num;
	private String trans_Cate;
	private String trans_Class;
	private Integer trans_Inv;
	private Integer trans_Price;
	private Set<HP_Trans_CTVO> hp_Trans_CtVOs ;
	public String getTrans_Ticket_Num() {
		return trans_Ticket_Num;
	}
	public void setTrans_Ticket_Num(String trans_Ticket_Num) {
		this.trans_Ticket_Num = trans_Ticket_Num;
	}
	public String getTrans_Cate() {
		return trans_Cate;
	}
	public void setTrans_Cate(String trans_Cate) {
		this.trans_Cate = trans_Cate;
	}
	public String getTrans_Class() {
		return trans_Class;
	}
	public void setTrans_Class(String trans_Class) {
		this.trans_Class = trans_Class;
	}
	public Integer getTrans_Inv() {
		return trans_Inv;
	}
	public void setTrans_Inv(Integer trans_Inv) {
		this.trans_Inv = trans_Inv;
	}
	public Integer getTrans_Price() {
		return trans_Price;
	}
	public void setTrans_Price(Integer trans_Price) {
		this.trans_Price = trans_Price;
	}
	public Set<HP_Trans_CTVO> getHp_Trans_CtVOs() {
		return hp_Trans_CtVOs;
	}
	public void setHp_Trans_CtVOs(Set<HP_Trans_CTVO> hp_Trans_CtVOs) {
		this.hp_Trans_CtVOs = hp_Trans_CtVOs;
	}
	
	
	
	

}
