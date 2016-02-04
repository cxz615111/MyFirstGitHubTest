package com.ziyyu.model._18_hp_easy_ct;

import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._15_ecard.EcardVO;

public class HP_Easy_CTVO implements java.io.Serializable{
	private HPVO hp;
	private EcardVO ecard;
	private Integer amount;
	public HPVO getHp() {
		return hp;
	}
	public void setHp(HPVO hp) {
		this.hp = hp;
	}
	public EcardVO getEcard() {
		return ecard;
	}
	public void setEcard(EcardVO ecard) {
		this.ecard = ecard;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	
	
}
