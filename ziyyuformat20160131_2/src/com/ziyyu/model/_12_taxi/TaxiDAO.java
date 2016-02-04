package com.ziyyu.model._12_taxi;

import hibernate_configuration.HibernateUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;


public class TaxiDAO implements TaxiInterfaceDAO {

	@Override
	public void insert(TaxiVO taxi) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.save(taxi);
		return ;
	}

	@Override
	public void  update(TaxiVO taxi) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();   
			session.update(taxi);	
		return ;
	}

	@Override
	public void delete(String hp_taxi_guild) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			
			TaxiVO taxi=(TaxiVO)session.get(TaxiVO.class, hp_taxi_guild);
			session.delete(taxi);		
		return ;

	}

	@Override
	public TaxiVO findByPrimaryKey(String hp_taxi_guild) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		TaxiVO 	taxi=(TaxiVO)session.get(TaxiVO.class, hp_taxi_guild);
		return taxi;
	}

	@Override
	public List<TaxiVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			Query query=session.createQuery("from TaxiVO order ");
			List<TaxiVO> taxis=query.list();
	
		return taxis;
	}
	public static void main(String[] args) {
		TaxiDAO dao = new TaxiDAO();
		// insert
//		TaxiVO vo=new TaxiVO();
//		vo.setHp_Taxi_Guild("8");
//		 vo.setTaxi_Comp("�P777");
//		 vo.setTaxi_Price(3);
//		 dao.insert(vo);
		 
		// update
//		 TaxiVO vo1=new TaxiVO();
//			vo1.setHp_Taxi_Guild("8");
//			 vo1.setTaxi_Comp("�ӳ��|777");
//			 vo1.setTaxi_Price(30);
//			 dao.update(vo1);

		//find by primary key
			 TaxiVO vo2= dao.findByPrimaryKey("5");
			 System.out.println("hp_taxi_guild:"+vo2.getHp_Taxi_Guild()); 
			 System.out.println("Taxi_Comp:"+vo2.getTaxi_Comp());
			 System.out.println("Taxi_Price:"+vo2.getTaxi_Price());

	
//		//find all
//			 List<TaxiVO> taixes = dao.getAll();
//			 for (TaxiVO taix : taixes) {
//					System.out.print(taix.getHp_Taxi_Guild() + ", ");
//					System.out.print(taix.getTaxi_Comp() + ", ");
//					System.out.print(taix.getTaxi_Price() + "\n");
//				}

//		
//		//delete
//			 dao.delete("6");
			
	}
}