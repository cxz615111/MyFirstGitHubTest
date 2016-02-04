package com.ziyyu.model._14_ticket;

import java.util.Set;

import com.ziyyu.model._17_hp_ticket_ct.HP_Ticket_CTVO;



public class TicketVO  implements java.io.Serializable{
		private String ticket_Num;
		private String ticket_Type;
		private String ticket_Name_Zh;
		private String ticket_Name_En;
		private Integer ticket_Price;
		private String fare_Cate;
		private String location;
		private Integer ticket_Inv;
		private Set<HP_Ticket_CTVO> hp_Ticket_CtVOs ;
		public String getTicket_Num() {
			return ticket_Num;
		}
		public void setTicket_Num(String ticket_Num) {
			this.ticket_Num = ticket_Num;
		}
		public String getTicket_Type() {
			return ticket_Type;
		}
		public void setTicket_Type(String ticket_Type) {
			this.ticket_Type = ticket_Type;
		}
		public String getTicket_Name_Zh() {
			return ticket_Name_Zh;
		}
		public void setTicket_Name_Zh(String ticket_Name_Zh) {
			this.ticket_Name_Zh = ticket_Name_Zh;
		}
		public String getTicket_Name_En() {
			return ticket_Name_En;
		}
		public void setTicket_Name_En(String ticket_Name_En) {
			this.ticket_Name_En = ticket_Name_En;
		}
		public Integer getTicket_Price() {
			return ticket_Price;
		}
		public void setTicket_Price(Integer ticket_Price) {
			this.ticket_Price = ticket_Price;
		}
		public String getFare_Cate() {
			return fare_Cate;
		}
		public void setFare_Cate(String fare_Cate) {
			this.fare_Cate = fare_Cate;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public Integer getTicket_Inv() {
			return ticket_Inv;
		}
		public void setTicket_Inv(Integer ticket_Inv) {
			this.ticket_Inv = ticket_Inv;
		}
		public Set<HP_Ticket_CTVO> getHp_Ticket_CtVOs() {
			return hp_Ticket_CtVOs;
		}
		public void setHp_Ticket_CtVOs(Set<HP_Ticket_CTVO> hp_Ticket_CtVOs) {
			this.hp_Ticket_CtVOs = hp_Ticket_CtVOs;
		}
		
		
	
		
}
