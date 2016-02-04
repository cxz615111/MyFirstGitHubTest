package com.ziyyu.model._14_ticket;

import java.util.List;

public interface TicketInterfaceDAO {
		public void insert(TicketVO ticket);

		public void update(TicketVO ticket);

		public void delete(String Ticket_Num);

		public TicketVO findByPrimaryKey(String Ticket_Num);

		public List<TicketVO> getAll();
	}

