package com.ziyyu.model._21_hp_trav_info;

import hibernate_configuration.HibernateUtil;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.ziyyu.model._02_nationality.NationalityVO;
import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._20_hp_pur_order.HP_Pur_OrderVO;

public class HP_Trav_InfoDAO implements HP_Trav_InfoInterfaceDAO {
	public static void main(String arg[]) {
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
//		 HP_Trav_InfoInterfaceDAO a=new HP_Trav_InfoDAO();
//		
//		 HP_Trav_InfoVO c=new HP_Trav_InfoVO();
//		
//		 HP_Pur_OrderVO b=new HP_Pur_OrderVO();
//		
//		 b.setPay_Detail_Num("1");
//		 c.setHp_Pur_OrderVO(b);
//		
//		 c.setPassport_Num("3");
//		 c.setName_En("kenny");
//		 c.setGender("M");
//		
//		 String formatSqlDate = "2013-05-09";
//		 java.sql.Date valueOf = java.sql.Date.valueOf(formatSqlDate);
//		 c.setBirth(valueOf);
//		
//		 NationalityVO z=new NationalityVO();
//		 z.setCode("USA");
//		 c.setNationalityVO(z);
//		
//		 String formatSqlDate1 = "2018-05-10";
//		 java.sql.Date valueOf1 = java.sql.Date.valueOf(formatSqlDate1);
//		 c.setExpiry_Date(valueOf1);
//		 c.setAddress("高雄市");
//		 c.setPostcode(20045);
//		 c.setPay_Relation("姊妹");
//		
//		 a.insert(c);

		// ----------------------------------------------------------------------------------------------
//
//		 HP_Trav_InfoInterfaceDAO a=new HP_Trav_InfoDAO();
//		
//		 HP_Trav_InfoVO c=new HP_Trav_InfoVO();
//		
//		 HP_Pur_OrderVO b=new HP_Pur_OrderVO();
//		
//		 b.setPay_Detail_Num("1");
//		 c.setHp_Pur_OrderVO(b);
//		
//		 c.setPassport_Num("3");
//		 c.setName_En("tommy");
//		 c.setGender("f");
//		
//		 String formatSqlDate = "2013-05-09";
//		 java.sql.Date valueOf = java.sql.Date.valueOf(formatSqlDate);
//		 c.setBirth(valueOf);
//		
//		 NationalityVO z=new NationalityVO();
//		 z.setCode("JPN");
//		 c.setNationalityVO(z);
//		
//		 String formatSqlDate1 = "2019-09-12";
//		 java.sql.Date valueOf1 = java.sql.Date.valueOf(formatSqlDate1);
//		 c.setExpiry_Date(valueOf1);
//		 c.setAddress("台中市");
//		 c.setPostcode(21100);
//		 c.setPay_Relation("FATHER");
//		
//		 a.update(c);
//		 -------------------------------------------------------------------------------
//		 HP_Trav_InfoInterfaceDAO a=new HP_Trav_InfoDAO();
//		 HP_Pur_OrderVO b=new HP_Pur_OrderVO();
//		 b.setPay_Detail_Num("1");
//		 a.delete(b, "3");
		// ------------------------------------------------------------------------------
//		 HP_Trav_InfoInterfaceDAO a=new HP_Trav_InfoDAO();
//		 HP_Pur_OrderVO bb=new HP_Pur_OrderVO();
//		 bb.setPay_Detail_Num("1");
//		
//		 HP_Trav_InfoVO a3= a.findByPrimaryKey(bb, "e");
//		
//		 System.out.println(a3.getGender());
//		 System.out.println(a3.getName_En());
		// ------------------------------------------------------------------------------
//		HP_Trav_InfoDAO a = new HP_Trav_InfoDAO();
//		List<HP_Trav_InfoVO> bb = a.getAll();
//		for (HP_Trav_InfoVO PPP : bb) {
//			System.out.println(PPP.getAddress());
//			System.out.println(PPP.getGender());
//			System.out.println(PPP.getName_En());
//			System.out.println(PPP.getPay_Relation());
//			System.out.println(PPP.getPostcode());
//			System.out.println(PPP.getExpiry_Date());
//		}
		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
	}

	@Override
	public void insert(HP_Trav_InfoVO hti) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.saveOrUpdate(hti);

		return;
	}

	@Override
	public void update(HP_Trav_InfoVO hti) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.saveOrUpdate(hti);

		return;
	}

	@Override
	public void delete(HP_Pur_OrderVO pay_Detail_Num, String passport_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		HP_Trav_InfoVO aa = new HP_Trav_InfoVO();
		aa.setHp_Pur_OrderVO(pay_Detail_Num);
		aa.setPassport_Num(passport_Num);

		HP_Trav_InfoVO hti = (HP_Trav_InfoVO) session.get(HP_Trav_InfoVO.class, aa);
		session.delete(hti);

		return;
	}

	@Override
	public HP_Trav_InfoVO findByPrimaryKey(HP_Pur_OrderVO pay_Detail_Num, String passport_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		HP_Trav_InfoVO travIVO = new HP_Trav_InfoVO();
		travIVO.setHp_Pur_OrderVO(pay_Detail_Num);
		travIVO.setPassport_Num(passport_Num);
		HP_Trav_InfoVO hti = (HP_Trav_InfoVO) session.get(HP_Trav_InfoVO.class, travIVO);

		return hti;

	}

	@Override
	public List<HP_Trav_InfoVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Query query = session.createQuery("from HP_Trav_InfoVO order by pay_detail_num");
		List<HP_Trav_InfoVO> htis = query.list();

		return htis;
	}
}
