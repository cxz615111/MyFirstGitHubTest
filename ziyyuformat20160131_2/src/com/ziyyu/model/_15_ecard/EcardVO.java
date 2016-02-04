package com.ziyyu.model._15_ecard;

import java.util.Set;

import com.ziyyu.model._18_hp_easy_ct.HP_Easy_CTVO;

public class EcardVO  implements java.io.Serializable{
		private String ecard_Num;
		private Integer ecard_Price;
		private Integer ecard_Inv;
		private String ecard_Type_Zh;
		private String ecard_Type_En;
		private Set<HP_Easy_CTVO> hp_Easy_CtVOs ;
		public String getEcard_Num() {
			return ecard_Num;
		}
		public void setEcard_Num(String ecard_Num) {
			this.ecard_Num = ecard_Num;
		}
		public Integer getEcard_Price() {
			return ecard_Price;
		}
		public void setEcard_Price(Integer ecard_Price) {
			this.ecard_Price = ecard_Price;
		}
		public Integer getEcard_Inv() {
			return ecard_Inv;
		}
		public void setEcard_Inv(Integer ecard_Inv) {
			this.ecard_Inv = ecard_Inv;
		}
		public String getEcard_Type_Zh() {
			return ecard_Type_Zh;
		}
		public void setEcard_Type_Zh(String ecard_Type_Zh) {
			this.ecard_Type_Zh = ecard_Type_Zh;
		}
		public String getEcard_Type_En() {
			return ecard_Type_En;
		}
		public void setEcard_Type_En(String ecard_Type_En) {
			this.ecard_Type_En = ecard_Type_En;
		}
		public Set<HP_Easy_CTVO> getHp_Easy_CtVOs() {
			return hp_Easy_CtVOs;
		}
		public void setHp_Easy_CtVOs(Set<HP_Easy_CTVO> hp_Easy_CtVOs) {
			this.hp_Easy_CtVOs = hp_Easy_CtVOs;
		}
		
	
		
}
