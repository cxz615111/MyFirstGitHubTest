package com.ziyyu.model._13_trans;

import hibernate_configuration.HibernateUtil;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.ziyyu.model._12_taxi.TaxiDAO;
import com.ziyyu.model._12_taxi.TaxiVO;

public class TransDAO implements TransInterfaceDAO {

	@Override
	public void insert(TransVO trans) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.save(trans);
			return;
	}

	@Override
	public void update(TransVO trans) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.update(trans);
		return;
	}

	@Override
	public void delete(String Trans_Ticket_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();     
			TransVO trans=(TransVO)session.get(TransVO.class, Trans_Ticket_Num);
			session.delete(trans);
		return ;

	}

	@Override
	public TransVO findByPrimaryKey(String Trans_Ticket_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		 TransVO trans=(TransVO)session.get(TransVO.class, Trans_Ticket_Num);
		return trans;
	}

	@Override
	public List<TransVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			Query query=session.createQuery("from TransVO order by Trans_Ticket_Num");
			List<TransVO> transes=query.list();
		return transes;
	}
	public static void main(String[] args) {
		TransDAO dao = new TransDAO();
		// insert
//		TransVO vo=new TransVO();
//		vo.setTrans_Ticket_Num("6");
//		 vo.setTrans_Cate("�۱j");
//		 vo.setTrans_Class("���q��");
//		 vo.setTrans_Inv(111);
//		 vo.setTrans_Price(300);
//		 dao.insert(vo);
		 
		// update
//		 TransVO vo1=new TransVO();
//		 vo1.setTrans_Ticket_Num("6");
//		 vo1.setTrans_Cate("�۱j1");
//		 vo1.setTrans_Class("���q��1");
//		 vo1.setTrans_Inv(101);
//		 vo1.setTrans_Price(500);
//			 dao.update(vo1);

		//find by primary key
//			 TransVO vo2= dao.findByPrimaryKey("6");
//			 System.out.println("Trans_Ticket_Num:"+vo2.getTrans_Ticket_Num()); 
//			 System.out.println("Trans_Cate:"+vo2.getTrans_Cate());
//			 System.out.println("Trans_Class:"+vo2.getTrans_Class());
//			 System.out.println("Trans_Inv:"+vo2.getTrans_Inv());
//			 System.out.println("Trans_Price:"+vo2.getTrans_Price());

	
//		//find all
//			 List<TransVO> transes = dao.getAll();
//			 for (TransVO trans : transes) {
//					System.out.print(trans.getTrans_Ticket_Num() + ", ");
//					System.out.print(trans.getTrans_Cate() + ", ");
//					System.out.print(trans.getTrans_Class() + ", ");
//					System.out.print(trans.getTrans_Inv() + ", ");
//					System.out.print(trans.getTrans_Price() + "\n");
//				}

	
//		//delete
			 dao.delete("6");

	}
}

