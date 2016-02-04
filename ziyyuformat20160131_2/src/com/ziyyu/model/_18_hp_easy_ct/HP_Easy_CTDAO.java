package com.ziyyu.model._18_hp_easy_ct;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._15_ecard.EcardVO;
import com.ziyyu.model._17_hp_ticket_ct.HP_Ticket_CTDAO;
import com.ziyyu.model._17_hp_ticket_ct.HP_Ticket_CTVO;
import com.ziyyu.model._19_hp_hotelri_ct.HP_HotelRI_CTVO;

import hibernate_configuration.HibernateUtil;

public class HP_Easy_CTDAO implements HP_Easy_CTInterfaceDAO {

	@Override
	public void insert(HP_Easy_CTVO hec) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.save(hec);
		return;

	}

	@Override
	public void update(HP_Easy_CTVO hec) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.update(hec);
		return;

	}

	@Override
	public void deleteFK(HPVO hp, EcardVO ecard) {
	 
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		HP_Easy_CTVO hec = new HP_Easy_CTVO();
		hec.setHp(hp);
		hec.setEcard(ecard);
	 
		HP_Easy_CTVO hP_Easy_CT = (HP_Easy_CTVO) session.get(HP_Easy_CTVO.class, hec);
		session.delete(hP_Easy_CT);
		return;
	}

	@Override
	public HP_Easy_CTVO selectFK(HPVO hp, EcardVO ecard) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		HP_Easy_CTVO hec = new HP_Easy_CTVO();
		hec.setHp(hp);
		hec.setEcard(ecard);
		;
		HP_Easy_CTVO hP_Easy_CT = (HP_Easy_CTVO) session.get(HP_Easy_CTVO.class, hec);

		return hP_Easy_CT;
	}

	@Override
	public List<HP_Easy_CTVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		Query query = session.createQuery("from HP_Easy_CTVO order by HP_num,ecard_num");
		List<HP_Easy_CTVO> hecs = query.list();

		return hecs;

	}
	
	@Override
	public List<HP_Easy_CTVO> selectByHP_Num(String hp_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query=session.createQuery("from HP_Easy_CTVO where HP_num = ?");
		query.setParameter(0, hp_Num);	
		return (List<HP_Easy_CTVO>)query.list();
	}
	
	

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		HP_Easy_CTDAO dao = new HP_Easy_CTDAO();
		com.ziyyu.model._08_hp.HPVO hvo = new com.ziyyu.model._08_hp.HPVO();
		hvo.setHp_Num("TPI5D");
		com.ziyyu.model._15_ecard.EcardVO evo = new com.ziyyu.model._15_ecard.EcardVO();
		evo.setEcard_Num("3");

		// insert
//		 HP_Easy_CTVO vo = new HP_Easy_CTVO();
//		
//		 vo.setHp(hvo);
//		
//		 vo.setEcard(evo);
//		 vo.setAmount(3);
//		 dao.insert(vo);

		// update
		// HP_Easy_CTVO vo2 = new HP_Easy_CTVO();
		// vo2.setHp(hvo);
		//
		// vo2.setEcard(evo);
		// vo2.setAmount(7);
		//
		// dao.update(vo2);

		// find by primary key
		// HP_Easy_CTVO vo3 = dao.selectFK(hvo,evo);
		// System.out.println("HP_num:"+vo3.getHp());
		// System.out.println("Ecard_num:"+vo3.getEcard());
		// System.out.println("amount:"+vo3.getAmount());

		// find all
		// List<HP_Easy_CTVO> hecs = dao.getAll();
		// for (HP_Easy_CTVO hec : hecs) {
		// System.out.print(hec.getHp()+ ", ");
		// System.out.print(hec.getEcard()+ ", ");
		// System.out.println(hec.getAmount()+"\n");
		//
		// }

		// delete
		dao.deleteFK(hvo, evo);

		tx.commit();
	}

}