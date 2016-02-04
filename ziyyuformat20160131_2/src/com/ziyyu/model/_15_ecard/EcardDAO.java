package com.ziyyu.model._15_ecard;

import hibernate_configuration.HibernateUtil;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.ziyyu.model._12_taxi.TaxiDAO;

public class EcardDAO implements EcardInterfaceDAO {

	@Override
	public void insert(EcardVO ecard) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
      
			session.save(ecard);
	
		return ;

	}

	@Override
	public void update(EcardVO ecard) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       
			session.update(ecard);
		
	
	
		return ;
	}

	@Override
	public void  delete(String Ecard_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       
			EcardVO ecard=(EcardVO)session.get(EcardVO.class, Ecard_Num);
			session.delete(ecard);
	
		return ;

	}

	@Override
	public EcardVO findByPrimaryKey(String Ecard_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		

		 EcardVO ecard=(EcardVO)session.get(EcardVO.class, Ecard_Num);
	
		return ecard;
	}

	@Override
	public List<EcardVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		

			Query query=session.createQuery("from EcardVO order by Ecard_Num");
			List<EcardVO> ecards=query.list();
	
		
		return ecards;
	}
	public static void main(String[] args) {
		EcardDAO dao = new EcardDAO();
		// insert
//		EcardVO vo=new EcardVO();
//		vo.setEcard_Num("6");
//		vo.setEcard_Price(999);
//		vo.setEcard_Inv(4444);
//		vo.setEcard_Type_Zh("�@�d�q300");
//		vo.setEcard_Type_En("ONECARD");
//		dao.insert(vo);
		 
		// update
//		EcardVO vo1=new EcardVO();
//		vo1.setEcard_Num("6");
//		vo1.setEcard_Price(777);
//		vo1.setEcard_Inv(4444);
//		vo1.setEcard_Type_Zh("�@�d�q400");
//		vo1.setEcard_Type_En("ONECARD");
//			 dao.update(vo1);

		//find by primary key
//			 EcardVO vo2= dao.findByPrimaryKey("6");
//			 System.out.println("Ecard_Num:"+vo2.getEcard_Num()); 
//			 System.out.println("Ecard_Price:"+vo2.getEcard_Price());
//			 System.out.println("Ecard_Inv:"+vo2.getEcard_Inv());
//			 System.out.println("Ecard_Type_Zh:"+vo2.getEcard_Type_Zh());
//			 System.out.println("Ecard_Type_En:"+vo2.getEcard_Type_En());

	
//		//find all
//			 List<EcardVO> ecards = dao.getAll();
//			 for (EcardVO ecard : ecards) {
//					System.out.print(ecard.getEcard_Num() + ", ");
//					System.out.print(ecard.getEcard_Price() + ", ");
//		            System.out.print(ecard.getEcard_Inv() + ", ");
//          	    System.out.print(ecard.getEcard_Type_Zh() + ", ");
//					System.out.print(ecard.getEcard_Type_En() + "\n");
//				}

		
//		//delete
//	         dao.delete("6");

	}
}
