package com.ziyyu.model._19_hp_hotelri_ct;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._09_hp_air_ticket.HP_Air_TicketVO;
import com.ziyyu.model._10_hp_hotelri.HP_HotelRIVO;
import com.ziyyu.model._17_hp_ticket_ct.HP_Ticket_CTVO;
import com.ziyyu.model._18_hp_easy_ct.HP_Easy_CTDAO;
import com.ziyyu.model._18_hp_easy_ct.HP_Easy_CTVO;

import hibernate_configuration.HibernateUtil;

public class HP_HotelRI_CTDAO implements HP_HotelRI_CTInterfaceDAO {

	@Override
	public void insert(HP_HotelRI_CTVO hhc) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.save(hhc);
		return;
	}

	@Override
	public void update(HP_HotelRI_CTVO hhc) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.update(hhc);
		return;
	}

	@Override
	public void deleteFK(HPVO hp, HP_HotelRIVO hp_Hotel_Ri) {
	
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		HP_HotelRI_CTVO hhc = new HP_HotelRI_CTVO();
		hhc.setHp(hp);
		hhc.setHp_Hotel_Ri(hp_Hotel_Ri);
		HP_HotelRI_CTVO hP_HotelRI_CT = (HP_HotelRI_CTVO) session.get(HP_HotelRI_CTVO.class, hhc);

		session.delete(hP_HotelRI_CT);
		return;
	}

	@Override
	public HP_HotelRI_CTVO findByPrimaryKey(HPVO hp, HP_HotelRIVO hp_Hotel_Ri) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		 		 
			HP_HotelRI_CTVO hhc = new HP_HotelRI_CTVO();
			hhc.setHp(hp);
			hhc.setHp_Hotel_Ri(hp_Hotel_Ri);
		 
			HP_HotelRI_CTVO hP_HotelRI_CT = (HP_HotelRI_CTVO) session.get(HP_HotelRI_CTVO.class, hhc);

			return hP_HotelRI_CT;

		 
	}

	@Override
	public List<HP_HotelRI_CTVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			Query query = session.createQuery("from HP_HotelRI_CTVO order by HP_num,HP_hotelRI_num");
			List<HP_HotelRI_CTVO> hhcs = query.list();

		return hhcs;

	}
	
	@Override
	public List<HP_HotelRI_CTVO> selectByHP_Num(String hp_Num){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query=session.createQuery("from HP_HotelRI_CTVO where HP_num = ?");
		query.setParameter(0, hp_Num);	
		return (List<HP_HotelRI_CTVO>)query.list();
		
	}
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		HP_HotelRI_CTDAO dao = new HP_HotelRI_CTDAO();
		
		for(HP_HotelRI_CTVO hhc:dao.selectByHP_Num("TPI5D")){
		System.out.println(hhc.getAmount());
		}
		
//		com.ziyyu.model._08_hp.HPVO hvo = new com.ziyyu.model._08_hp.HPVO();
//		hvo.setHp_Num("TPI5D");
//		com.ziyyu.model._10_hp_hotelri.HP_HotelRIVO htvo = new com.ziyyu.model._10_hp_hotelri.HP_HotelRIVO();
//		htvo.setHp_HotelRI_Num("HPHotel3");

		// insert
//		 HP_HotelRI_CTVO vo = new HP_HotelRI_CTVO();
//		
//		 vo.setHp(hvo);
//		
//		vo.setHp_Hotel_Ri(htvo);
//		 vo.setAmount(3);
//		 dao.insert(vo);

		// update
//		HP_HotelRI_CTVO vo2 = new HP_HotelRI_CTVO();
//		 vo2.setHp(hvo);
//		
//		 vo2.setHp_Hotel_Ri(htvo);
//		 vo2.setAmount(7);
//		
//		 dao.update(vo2);

		// find by primary key
//		HP_HotelRI_CTVO vo3 = dao.selectFK(hvo,htvo);
//		 System.out.println("HP_num:"+vo3.getHp());
//		 System.out.println("Ecard_num:"+vo3.getHp_Hotel_Ri());
//		 System.out.println("amount:"+vo3.getAmount());

		// find all
//		List<HP_HotelRI_CTVO> hecs = dao.getAll();
//		for (HP_HotelRI_CTVO hec : hecs) {
//			System.out.print(hec.getHp() + ", ");
//			System.out.print(hec.getHp_Hotel_Ri() + ", ");
//			System.out.println(hec.getAmount() + "\n");
//
//		}

		// delete
		// dao.deleteFK(hvo,htvo);
 		 
		tx.commit();
	}
}