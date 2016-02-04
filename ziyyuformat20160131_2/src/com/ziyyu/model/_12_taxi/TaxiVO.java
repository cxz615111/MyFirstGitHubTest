package com.ziyyu.model._12_taxi;

import java.util.Set;

import com.ziyyu.model._08_hp.HPVO;

public class TaxiVO  implements java.io.Serializable{
	private Integer taxi_Price;
	private String hp_Taxi_Guild;
	private String taxi_Comp;
	private Set<HPVO> hpVOs;
	public Integer getTaxi_Price() {
		return taxi_Price;
	}
	public void setTaxi_Price(Integer taxi_Price) {
		this.taxi_Price = taxi_Price;
	}
	public String getHp_Taxi_Guild() {
		return hp_Taxi_Guild;
	}
	public void setHp_Taxi_Guild(String hp_Taxi_Guild) {
		this.hp_Taxi_Guild = hp_Taxi_Guild;
	}
	public String getTaxi_Comp() {
		return taxi_Comp;
	}
	public void setTaxi_Comp(String taxi_Comp) {
		this.taxi_Comp = taxi_Comp;
	}
	public Set<HPVO> getHpVOs() {
		return hpVOs;
	}
	public void setHpVOs(Set<HPVO> hpVOs) {
		this.hpVOs = hpVOs;
	}
	
	
}
