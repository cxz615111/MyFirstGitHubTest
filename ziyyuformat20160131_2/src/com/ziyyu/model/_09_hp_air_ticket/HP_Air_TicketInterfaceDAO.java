package com.ziyyu.model._09_hp_air_ticket;

import java.util.List;

public interface HP_Air_TicketInterfaceDAO {
	
	public void insert(HP_Air_TicketVO hat);
	public void update(HP_Air_TicketVO hat);
	public void delete(String hp_Air_Num);
	public HP_Air_TicketVO findByPrimaryKey(String hp_Air_Num);
	public List<HP_Air_TicketVO> getAll();

}
