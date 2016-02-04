package com.ziyyu.model._22_ps_air_ticket_order;

import java.util.List;

import com.ziyyu.model._25_airline.AirlineVO;



public interface PS_Air_Ticket_OrderInterfaceDAO {

	public void insert(PS_Air_Ticket_OrderVO pato);
	public void delete(String ps_Air_Order,AirlineVO airlineVO);//??
	public void update(PS_Air_Ticket_OrderVO pato);
	public PS_Air_Ticket_OrderVO findByPrimaryKey(String ps_Air_Order,AirlineVO airlineVO);//??
	public List<PS_Air_Ticket_OrderVO> getAll();
}
