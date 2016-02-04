package com.ziyyu.model._10_hp_hotelri;

import hibernate_configuration.HibernateUtil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HP_HotelRIDAO implements HP_HotelRIInterfaceDAO {

	@Override
	public void insert(HP_HotelRIVO hhRI) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        
			session.save(hhRI);
			
		return ;
	}

	@Override
	public void update(HP_HotelRIVO hhRI) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

			session.update(hhRI);
			
		return;

	}

	@Override
	public void delete(String hp_HotelRI_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            
			session.delete( session.get(HP_HotelRIVO.class,hp_HotelRI_Num));  
			
		return ;

	}

	@Override
	public HP_HotelRIVO findByPrimaryKey(String hp_HotelRI_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		HP_HotelRIVO hhRI=(HP_HotelRIVO)session.get(HP_HotelRIVO.class ,hp_HotelRI_Num);
		return hhRI;
	}

	@Override
	public List<HP_HotelRIVO> getAll() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();		
			Query query=session.createQuery("from HP_HotelRIVO order by hp_HotelRI_Num");
			List<HP_HotelRIVO> hhRIs =query.list();
			
		return hhRIs;
	}

}
