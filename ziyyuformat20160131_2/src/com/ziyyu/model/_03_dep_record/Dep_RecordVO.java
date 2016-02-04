package com.ziyyu.model._03_dep_record;

import java.sql.Timestamp;

import com.ziyyu.model._01_member.MemberVO;

public class Dep_RecordVO implements java.io.Serializable{
    private String trans_Num;
	private Timestamp deposit_Time;
	private Integer trans_Money;		
	private Integer deposit_Point;
	private MemberVO  memberVO;
	public String getTrans_Num() {
		return trans_Num;
	}
	public void setTrans_Num(String trans_Num) {
		this.trans_Num = trans_Num;
	}
	public Timestamp getDeposit_Time() {
		return deposit_Time;
	}
	public void setDeposit_Time(Timestamp deposit_Time) {
		this.deposit_Time = deposit_Time;
	}
	public Integer getTrans_Money() {
		return trans_Money;
	}
	public void setTrans_Money(Integer trans_Money) {
		this.trans_Money = trans_Money;
	}
	public Integer getDeposit_Point() {
		return deposit_Point;
	}
	public void setDeposit_Point(Integer deposit_Point) {
		this.deposit_Point = deposit_Point;
	}
	public MemberVO getMemberVO() {
		return memberVO;
	}
	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	
	
	
}
