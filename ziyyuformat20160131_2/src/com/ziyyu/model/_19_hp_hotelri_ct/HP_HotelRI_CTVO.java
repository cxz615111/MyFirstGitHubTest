package com.ziyyu.model._19_hp_hotelri_ct;

import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._10_hp_hotelri.HP_HotelRIVO;

public class HP_HotelRI_CTVO implements java.io.Serializable {
	private HPVO hp;
	private HP_HotelRIVO hp_Hotel_Ri;
	private Integer amount;
	public HPVO getHp() {
		return hp;
	}
	public void setHp(HPVO hp) {
		this.hp = hp;
	}
	public HP_HotelRIVO getHp_Hotel_Ri() {
		return hp_Hotel_Ri;
	}
	public void setHp_Hotel_Ri(HP_HotelRIVO hp_Hotel_Ri) {
		this.hp_Hotel_Ri = hp_Hotel_Ri;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	

}
