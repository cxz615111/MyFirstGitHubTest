package com.ziyyu.model._20_hp_pur_order;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ziyyu.model._21_hp_trav_info.HP_Trav_InfoVO;

public interface HP_Pur_OrderInterfaceDAO {
	public void insert(HP_Pur_OrderVO hp_Pur_OrderVO);

	public void update(HP_Pur_OrderVO hp_Pur_OrderVO);

	public void delete(String pay_Detail_Num);

	public HP_Pur_OrderVO findByPrimaryKey(String pay_Detail_Num);

	public List<HP_Pur_OrderVO> getAll();

	public Set<HP_Trav_InfoVO>  gethp_Trav_InfosByPay_Detail_Num(String pay_Detail_Num);
}
