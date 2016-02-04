package com.ziyyu.model._28_admin;

import hibernate_configuration.HibernateUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.ziyyu.model._26_ps_hotel_item.PS_Hotel_ItemVO;

public class AdminDAO implements AdminInterfaceDAO {

	@Override
	public AdminVO findByPrimaryKey(String admin_account) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		AdminVO admin = (AdminVO) session.get(AdminVO.class, admin_account);
		return admin;
	}

	@Override
	public List<AdminVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session.createQuery("from AdminVO order by admin_account ");
		List<AdminVO> admins = query.list();

		return admins;
	}

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		AdminDAO dao = new AdminDAO();

		// find by primary key
//		 AdminVO vo2= dao.findByPrimaryKey("ad0001");
//		 System.out.println("hp_taxi_guild:"+vo2.getAdmin_Account());
//		 System.out.println("Taxi_Comp:"+vo2.getAdmin_Name());
//		 System.out.println("Taxi_Price:"+vo2.getAdmin_Pass());

		// //find all
//		List<AdminVO> admins = dao.getAll();
//		for (AdminVO admin : admins) {
//			System.out.print(admin.getAdmin_Account() + ", ");
//			System.out.print(admin.getAdmin_Name() + ", ");
//			System.out.print(admin.getAdmin_Pass() + "\n");
//		}
		tx.commit();
	}
}