package com.ziyyu.model._21_hp_trav_info;

import com.ziyyu.model._02_nationality.NationalityVO;
import com.ziyyu.model._20_hp_pur_order.HP_Pur_OrderVO;

public class HP_Trav_InfoVO implements java.io.Serializable{
	
    private HP_Pur_OrderVO hp_Pur_OrderVO;
	private String passport_Num;
	private String name_En;	
	private String gender;
	private java.sql.Date birth; 	
	private NationalityVO 	nationalityVO;
	private java.sql.Date expiry_Date;	
	private String  address;	
	private Integer  postcode;	
	private String pay_Relation;
	public HP_Pur_OrderVO getHp_Pur_OrderVO() {
		return hp_Pur_OrderVO;
	}
	public void setHp_Pur_OrderVO(HP_Pur_OrderVO hp_Pur_OrderVO) {
		this.hp_Pur_OrderVO = hp_Pur_OrderVO;
	}
	public String getPassport_Num() {
		return passport_Num;
	}
	public void setPassport_Num(String passport_Num) {
		this.passport_Num = passport_Num;
	}
	public String getName_En() {
		return name_En;
	}
	public void setName_En(String name_En) {
		this.name_En = name_En;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public java.sql.Date getBirth() {
		return birth;
	}
	public void setBirth(java.sql.Date birth) {
		this.birth = birth;
	}
	public NationalityVO getNationalityVO() {
		return nationalityVO;
	}
	public void setNationalityVO(NationalityVO nationalityVO) {
		this.nationalityVO = nationalityVO;
	}
	public java.sql.Date getExpiry_Date() {
		return expiry_Date;
	}
	public void setExpiry_Date(java.sql.Date expiry_Date) {
		this.expiry_Date = expiry_Date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPostcode() {
		return postcode;
	}
	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
	}
	public String getPay_Relation() {
		return pay_Relation;
	}
	public void setPay_Relation(String pay_Relation) {
		this.pay_Relation = pay_Relation;
	}
	
	
		
}
