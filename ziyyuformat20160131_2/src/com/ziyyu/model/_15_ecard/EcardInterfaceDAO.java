package com.ziyyu.model._15_ecard;

import java.util.List;

public interface EcardInterfaceDAO {
	public void insert(EcardVO ecard);
	public void update(EcardVO ecard);
	public void delete(String Ecard_Num);
	public EcardVO findByPrimaryKey(String Ecard_Num);
	public List<EcardVO> getAll();
}
