package com.ziyyu.model._11_scard;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.ziyyu.model._08_hp.HPVO;

public class ScardVO implements Serializable {
	private String hp_Scard_Num;
	private String tel_Comp;
	private String scard_Cate;
	private Integer scard_Price;
	private Integer scard_Inv;
	private Set<HPVO> hpVOs ;
	public String getHp_Scard_Num() {
		return hp_Scard_Num;
	}
	public void setHp_Scard_Num(String hp_Scard_Num) {
		this.hp_Scard_Num = hp_Scard_Num;
	}
	public String getTel_Comp() {
		return tel_Comp;
	}
	public void setTel_Comp(String tel_Comp) {
		this.tel_Comp = tel_Comp;
	}
	public String getScard_Cate() {
		return scard_Cate;
	}
	public void setScard_Cate(String scard_Cate) {
		this.scard_Cate = scard_Cate;
	}
	public Integer getScard_Price() {
		return scard_Price;
	}
	public void setScard_Price(Integer scard_Price) {
		this.scard_Price = scard_Price;
	}
	public Integer getScard_Inv() {
		return scard_Inv;
	}
	public void setScard_Inv(Integer scard_Inv) {
		this.scard_Inv = scard_Inv;
	}
	public Set<HPVO> getHpVOs() {
		return hpVOs;
	}
	public void setHpVOs(Set<HPVO> hpVOs) {
		this.hpVOs = hpVOs;
	}
	
	
	
}
