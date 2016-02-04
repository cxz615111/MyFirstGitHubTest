package com.ziyyu.model._09_hp_air_ticket;

import hibernate_configuration.HibernateUtil;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class HP_Air_TicketDAO implements HP_Air_TicketInterfaceDAO {

	@Override
	public void insert(HP_Air_TicketVO hat) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.save(hat);
			return;
	}

	@Override
	public void update(HP_Air_TicketVO hat) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
			session.update(hat);
			return;

	}

	@Override
	public void delete(String hp_Air_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			HP_Air_TicketVO hat = (HP_Air_TicketVO) session.get(
					HP_Air_TicketVO.class, hp_Air_Num);
			session.delete(hat);
			
		return;

	}

	@Override
	public HP_Air_TicketVO findByPrimaryKey(String hp_Air_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();		
		 HP_Air_TicketVO hat = (HP_Air_TicketVO) session.get(HP_Air_TicketVO.class,
					hp_Air_Num);
			
		return hat;
	}

	@Override
	public List<HP_Air_TicketVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			Query query = session
					.createQuery("from HP_Air_TicketVO order by hp_Air_Num");
			List<HP_Air_TicketVO> hats = query.list();
		return hats;
	}

}
