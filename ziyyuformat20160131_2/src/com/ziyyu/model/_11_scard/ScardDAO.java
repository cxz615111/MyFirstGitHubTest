package com.ziyyu.model._11_scard;

import hibernate_configuration.HibernateUtil;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;

public class ScardDAO implements ScardInterfaceDAO {

	@Override
	public void insert(ScardVO scard) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        
			session.save(scard);
			
		return ;

	}

	@Override
	public void update(ScardVO scard) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();		
			session.update(scard);		
		return ;
	}

	@Override
	public void delete(String hp_Scard_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
			ScardVO scard=(ScardVO)session.get(ScardVO.class, hp_Scard_Num);
			session.delete(scard);
			
		return ;

	}

	@Override
	public ScardVO findByPrimaryKey(String hp_Scard_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		ScardVO scard = scard=(ScardVO)session.get(ScardVO.class, hp_Scard_Num);
		
		return scard;
	}

	@Override
	public List<ScardVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	
			Query query=session.createQuery("from ScardVO order by hp_Scard_Num");
			List<ScardVO> scards=query.list();
	
		return scards;
	}

}
