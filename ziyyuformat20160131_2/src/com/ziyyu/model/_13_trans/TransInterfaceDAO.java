package com.ziyyu.model._13_trans;

import java.util.List;

public interface TransInterfaceDAO {
	public void insert(TransVO trans);
	public void update(TransVO trans);
	public void delete(String Trans_Ticket_Num);
	public TransVO findByPrimaryKey(String Trans_Ticket_Num);
	public List<TransVO> getAll();
}
