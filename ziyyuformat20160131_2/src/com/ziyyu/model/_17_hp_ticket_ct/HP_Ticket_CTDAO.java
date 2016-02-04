package com.ziyyu.model._17_hp_ticket_ct;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ziyyu.model._07_repost.RepostVO;
import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._14_ticket.TicketVO;
import com.ziyyu.model._19_hp_hotelri_ct.HP_HotelRI_CTVO;
import com.ziyyu.model._26_ps_hotel_item.PS_Hotel_ItemDAO;

import hibernate_configuration.HibernateUtil;

public class HP_Ticket_CTDAO implements HP_Ticket_CTInterfaceDAO {

	@Override
	public void insert(HP_Ticket_CTVO htc) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.save(htc);
		return;

	}

	@Override
	public void update(HP_Ticket_CTVO htc) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.update(htc);
		return;
	}

	@Override
	public void deleteFK(HPVO hp, TicketVO ticket) {
		int i = 0;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		HP_Ticket_CTVO htc = new HP_Ticket_CTVO();
		htc.setHp(hp);
		htc.setTicket(ticket);

		HP_Ticket_CTVO hP_Ticket_CT = (HP_Ticket_CTVO) session.get(HP_Ticket_CTVO.class, htc);
		session.delete(hP_Ticket_CT);
		return;
	}

	@Override
	public HP_Ticket_CTVO findByPrimaryKey(HPVO hp, TicketVO ticket) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		HP_Ticket_CTVO htc = new HP_Ticket_CTVO();
		htc.setHp(hp);
		htc.setTicket(ticket);

		HP_Ticket_CTVO hP_Ticket_CT = (HP_Ticket_CTVO) session.get(HP_Ticket_CTVO.class, htc);

		return hP_Ticket_CT;
	}

	@Override
	public List<HP_Ticket_CTVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Query query = session.createQuery("from HP_Ticket_CTVO order by HP_num,ticket_num");
		List<HP_Ticket_CTVO> htcs = query.list();

		return htcs;

	}
	
    @Override
	public List<HP_Ticket_CTVO> selectByHP_Num(String hp_Num){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query=session.createQuery("from HP_Ticket_CTVO where HP_num = ?");
		query.setParameter(0, hp_Num);	
		return (List<HP_Ticket_CTVO>)query.list();
		
	}
	

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		HP_Ticket_CTDAO dao = new HP_Ticket_CTDAO();
		com.ziyyu.model._08_hp.HPVO hvo = new com.ziyyu.model._08_hp.HPVO();
		hvo.setHp_Num("TPI5D");
		com.ziyyu.model._14_ticket.TicketVO tvo = new com.ziyyu.model._14_ticket.TicketVO();
		tvo.setTicket_Num("1");
		// insert
//		HP_Ticket_CTVO vo = new HP_Ticket_CTVO();
//		vo.setHp(hvo);
//		vo.setAmount(2);
//		vo.setTicket(tvo);
//		dao.insert(vo);

		// update
//		 HP_Ticket_CTVO vo2=new HP_Ticket_CTVO();
//		 vo2.setHp(hvo);
//		 vo2.setAmount(3);
//		 vo2.setTicket(tvo);
//		 dao.update(vo2);

//		 find by primary key
//		 HP_Ticket_CTVO vo3 = dao.selectFK(hvo,tvo);
//		 System.out.println("HP_num:"+vo3.getHp());
//		 System.out.println("ticket_num:"+vo3.getTicket());
//		 System.out.println("amount:"+vo3.getAmount());

		// find all
//		 List<HP_Ticket_CTVO> htcs = dao.getAll();
//		 for (HP_Ticket_CTVO htc : htcs) {
//		 System.out.print(htc.getHp() + ", ");
//		 System.out.print(htc.getTicket() + ", ");
//		 System.out.print(htc.getAmount() + "\n");
//		
//		 }

		// delete
		// dao.deleteFK(hvo, tvo);
		tx.commit();
	}

}