package com.ziyyu.model._19_hp_hotelri_ct;

import java.util.List;

import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._10_hp_hotelri.HP_HotelRIVO;
import com.ziyyu.model._17_hp_ticket_ct.HP_Ticket_CTVO;

public interface HP_HotelRI_CTInterfaceDAO {
	
//	public void insert(HP_HotelRI_CTVO hhc);
	public void insert(HP_HotelRI_CTVO hhc);
	public void update(HP_HotelRI_CTVO hhc);
	//public void delete(String hp_Num, String hp_HotelRI_Num);//???
	public void deleteFK(HPVO hp,HP_HotelRIVO hp_Hotel_Ri);
	public HP_HotelRI_CTVO findByPrimaryKey(HPVO hp,HP_HotelRIVO hp_Hotel_Ri);
	//public HP_HotelRI_CTVO findByPrimaryKey(String hp_Num, String hp_HotelRI_Num);
	public List<HP_HotelRI_CTVO> getAll();
	public List<HP_HotelRI_CTVO> selectByHP_Num(String hp_Num);

}
