package com.ziyyu.model._20_hp_pur_order;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._21_hp_trav_info.HP_Trav_InfoVO;

public class HP_Pur_OrderVO implements java.io.Serializable{
     private String pay_Detail_Num;
	 private HPVO hpVO;
     private MemberVO memberVO;
	 private Integer pay_Amount;	
	 private Timestamp pay_Date;
     private String detail_Stat;
     
	 private Set<HP_Trav_InfoVO> hp_Trav_Infos=new HashSet<HP_Trav_InfoVO>();

	public String getPay_Detail_Num() {
		return pay_Detail_Num;
	}

	public void setPay_Detail_Num(String pay_Detail_Num) {
		this.pay_Detail_Num = pay_Detail_Num;
	}

	public HPVO getHpVO() {
		return hpVO;
	}

	public void setHpVO(HPVO hpVO) {
		this.hpVO = hpVO;
	}

	public MemberVO getMemberVO() {
		return memberVO;
	}

	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}

	public Integer getPay_Amount() {
		return pay_Amount;
	}

	public void setPay_Amount(Integer pay_Amount) {
		this.pay_Amount = pay_Amount;
	}

	public Timestamp getPay_Date() {
		return pay_Date;
	}

	public void setPay_Date(Timestamp pay_Date) {
		this.pay_Date = pay_Date;
	}

	public String getDetail_Stat() {
		return detail_Stat;
	}

	public void setDetail_Stat(String detail_Stat) {
		this.detail_Stat = detail_Stat;
	}

	public Set<HP_Trav_InfoVO> getHp_Trav_Infos() {
		return hp_Trav_Infos;
	}

	public void setHp_Trav_Infos(Set<HP_Trav_InfoVO> hp_Trav_Infos) {
		this.hp_Trav_Infos = hp_Trav_Infos;
	}

	
	
	 
	 
}
