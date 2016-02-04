package com.ziyyu.model._17_hp_ticket_ct;

import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._14_ticket.TicketVO;

public class HP_Ticket_CTVO implements java.io.Serializable {
	private HPVO hp;
	private TicketVO ticket;
	private Integer amount;
	public HPVO getHp() {
		return hp;
	}
	public void setHp(HPVO hp) {
		this.hp = hp;
	}
	public TicketVO getTicket() {
		return ticket;
	}
	public void setTicket(TicketVO ticket) {
		this.ticket = ticket;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	
}
