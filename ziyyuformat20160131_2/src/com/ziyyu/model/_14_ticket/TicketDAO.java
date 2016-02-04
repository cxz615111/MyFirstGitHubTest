package com.ziyyu.model._14_ticket;

import hibernate_configuration.HibernateUtil;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.ziyyu.model._13_trans.TransDAO;

public class TicketDAO implements TicketInterfaceDAO {

	@Override
	public void insert(TicketVO ticket) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.save(ticket);
		return ;
	}

	@Override
	public void update(TicketVO ticket) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.update(ticket);
		return ;
	}

	@Override
	public void delete(String Ticket_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();  			
			TicketVO ticket=(TicketVO)session.get(TicketVO.class, Ticket_Num);
			session.delete(ticket);
        return ;

	}

	@Override
	public TicketVO findByPrimaryKey(String Ticket_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();		 
		 TicketVO ticket=(TicketVO)session.get(TicketVO.class, Ticket_Num);
	
		return ticket;
	}

	@Override
	public List<TicketVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		

			Query query=session.createQuery("from TicketVO order by Ticket_Num");
			List<TicketVO> tickets=query.list();
		
		
		return tickets;
	}
	public static void main(String[] args) {
		TicketDAO dao = new TicketDAO();
		// insert
//		TicketVO vo=new TicketVO();
//		vo.setTicket_Num("6");
//		 vo.setTicket_Type("�n");
//		 vo.setTicket_Name_Zh("���c�T����");
//		 vo.setTicket_Name_En("zonlithree");
//		 vo.setTicket_Price(300);
//		 vo.setFare_Cate("�k�H");
//		 vo.setLocation("��鿤");
//		 vo.setTicket_Inv(6000);
//		 dao.insert(vo);
		 
		// update
//		 TicketVO vo1=new TicketVO();
//		 vo1.setTicket_Num("6");
//		 vo1.setTicket_Type("�n");
//		 vo1.setTicket_Name_Zh("�����F��");
//		 vo1.setTicket_Name_En("zonsow");
//		 vo1.setTicket_Price(300);
//		 vo1.setFare_Cate("�k�H");
//		 vo1.setLocation("��鿤");
//		 vo1.setTicket_Inv(6000);
//			 dao.update(vo1);

		//find by primary key
//			TicketVO vo2= dao.findByPrimaryKey("6");
//			 System.out.println("Ticket_Num:"+vo2.getTicket_Num()); 
//			 System.out.println("Ticket_Type:"+vo2.getTicket_Type());
//			 System.out.println("Ticket_Name_Zh:"+vo2.getTicket_Name_Zh());
//			 System.out.println("Ticket_Name_En:"+vo2.getTicket_Name_En());
//			 System.out.println("Ticket_Price:"+vo2.getTicket_Price());
//			 System.out.println("Fare_Cate:"+vo2.getFare_Cate());
//			 System.out.println("Location:"+vo2.getLocation());
//			 System.out.println("Ticket_Inv:"+vo2.getTicket_Inv());

		
		
//		//find all
//			 List<TicketVO> tickets = dao.getAll();
//			 for (TicketVO ticket : tickets) {
//					System.out.print(ticket.getTicket_Num() + ", ");
//					System.out.print(ticket.getTicket_Type() + ", ");
//					System.out.print(ticket.getTicket_Name_Zh() + ", ");
//					System.out.print(ticket.getTicket_Name_En() + ", ");
//					System.out.print(ticket.getTicket_Price() + ", ");
//					System.out.print(ticket.getFare_Cate() + ", ");
//					System.out.print(ticket.getLocation() + ", ");
//					System.out.print(ticket.getTicket_Inv() + "\n");
//				}

		
//		//delete
				 dao.delete("6");
			

	}
}
