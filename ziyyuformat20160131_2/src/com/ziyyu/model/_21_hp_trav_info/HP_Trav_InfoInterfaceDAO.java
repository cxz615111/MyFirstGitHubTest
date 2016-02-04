package com.ziyyu.model._21_hp_trav_info;

import java.util.List;

import com.ziyyu.model._20_hp_pur_order.HP_Pur_OrderVO;

public interface HP_Trav_InfoInterfaceDAO {
	public void insert(HP_Trav_InfoVO hti);
	public void update(HP_Trav_InfoVO hti);
	public void delete(HP_Pur_OrderVO pay_Detail_Num,String passport_Num);
	public HP_Trav_InfoVO findByPrimaryKey(HP_Pur_OrderVO pay_Detail_Num,String passport_Num);
	public List<HP_Trav_InfoVO> getAll();
}
