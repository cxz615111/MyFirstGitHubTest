package com.ziyyu.model._17_hp_ticket_ct;

import java.util.List;

import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._14_ticket.TicketVO;

public interface HP_Ticket_CTInterfaceDAO {

	// public void insert(HP_Ticket_CTVO htc);
	public void insert(HP_Ticket_CTVO htc);

	public void update(HP_Ticket_CTVO htc);

	public void deleteFK(HPVO hp, TicketVO ticket);

	public HP_Ticket_CTVO findByPrimaryKey(HPVO hp, TicketVO ticket);

	public List<HP_Ticket_CTVO> getAll();
	
	public List<HP_Ticket_CTVO> selectByHP_Num(String hp_Num);

}
