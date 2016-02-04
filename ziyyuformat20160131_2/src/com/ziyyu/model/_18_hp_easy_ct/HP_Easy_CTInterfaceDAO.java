package com.ziyyu.model._18_hp_easy_ct;

import java.util.List;

import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._15_ecard.EcardVO;
import com.ziyyu.model._19_hp_hotelri_ct.HP_HotelRI_CTVO;


public interface HP_Easy_CTInterfaceDAO {
	
	public void insert(HP_Easy_CTVO hec);
	public void update(HP_Easy_CTVO hec);
	public void deleteFK(HPVO hp,EcardVO ecard);
	public HP_Easy_CTVO selectFK(HPVO hp,EcardVO ecard);
	public List<HP_Easy_CTVO> getAll();
	public List<HP_Easy_CTVO> selectByHP_Num(String hp_Num);

}
