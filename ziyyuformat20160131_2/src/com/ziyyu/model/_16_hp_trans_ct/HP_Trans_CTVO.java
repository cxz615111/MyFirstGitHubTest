package com.ziyyu.model._16_hp_trans_ct;

import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._13_trans.TransVO;

public class HP_Trans_CTVO  implements java.io.Serializable{
	private HPVO hpVO;
	private TransVO transVO;
	private Integer amount;
	public HPVO getHpVO() {
		return hpVO;
	}
	public void setHpVO(HPVO hpVO) {
		this.hpVO = hpVO;
	}
	public TransVO getTransVO() {
		return transVO;
	}
	public void setTransVO(TransVO transVO) {
		this.transVO = transVO;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	
}
