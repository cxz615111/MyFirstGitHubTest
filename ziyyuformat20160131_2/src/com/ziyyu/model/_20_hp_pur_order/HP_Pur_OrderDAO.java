package com.ziyyu.model._20_hp_pur_order;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._21_hp_trav_info.HP_Trav_InfoVO;

import hibernate_configuration.HibernateUtil;

public class HP_Pur_OrderDAO implements HP_Pur_OrderInterfaceDAO {

	private static final String GET_ALL_STMT = "from HP_Pur_OrderVO ";

	@Override
	public void insert(HP_Pur_OrderVO hp_Pur_OrderVO) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.save(hp_Pur_OrderVO);
		return;
	}

	@Override
	public void update(HP_Pur_OrderVO hp_Pur_OrderVO) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.update(hp_Pur_OrderVO);
		return;
	}

	@Override
	public void delete(String pay_Detail_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		HP_Pur_OrderVO hp_Pur_OrderVO = new HP_Pur_OrderVO();
		hp_Pur_OrderVO.setPay_Detail_Num(pay_Detail_Num);
		session.delete(hp_Pur_OrderVO);
		return;
	}

	@Override
	public HP_Pur_OrderVO findByPrimaryKey(String pay_Detail_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		HP_Pur_OrderVO hp_Pur_OrderVO = (HP_Pur_OrderVO) session.get(HP_Pur_OrderVO.class, pay_Detail_Num);
		return hp_Pur_OrderVO;
	}

	@Override
	public List<HP_Pur_OrderVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session.createQuery(GET_ALL_STMT);
		List<HP_Pur_OrderVO> list = query.list();
		return list;

	}

	@Override
	public Set<HP_Trav_InfoVO> gethp_Trav_InfosByPay_Detail_Num(String pay_Detail_Num) {
		Set<HP_Trav_InfoVO> set = findByPrimaryKey(pay_Detail_Num).getHp_Trav_Infos();
		return set;
	}

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
		HP_Pur_OrderDAO dao = new HP_Pur_OrderDAO();
		HPVO hpVO = new HPVO();
		hpVO.setHp_Num("TPI3D");
		MemberVO memberVO = new MemberVO();
		memberVO.setAccount("acca01");

		// insert   
//		 HP_Pur_OrderVO hp_Pur_OrderVO=new HP_Pur_OrderVO();
//		
//		 hp_Pur_OrderVO.setPay_Detail_Num("SS");
//		 hp_Pur_OrderVO.setHpVO(hpVO);
//		 hp_Pur_OrderVO.setMemberVO(memberVO);
//		 hp_Pur_OrderVO.setPay_Amount(1);
//		 long a=0;
//		 try {
//		 a=new SimpleDateFormat("yyyy-MM-dd").parse("2012-3-5").getTime();
//		 } catch (ParseException e) {
//		
//		 e.printStackTrace();
//		 }
//		
//		 hp_Pur_OrderVO.setPay_Date(new Timestamp(a));
//		 hp_Pur_OrderVO.setDetail_Stat("Y");
//		 dao.insert(hp_Pur_OrderVO);
//		 HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		
		
		// update  
//		 HP_Pur_OrderVO hp_Pur_OrderVO1=new HP_Pur_OrderVO();
//		 hp_Pur_OrderVO1.setPay_Detail_Num("SS");
//		 hp_Pur_OrderVO1.setHpVO(hpVO);
//		 hp_Pur_OrderVO1.setMemberVO(memberVO);
//		 hp_Pur_OrderVO1.setPay_Amount(1);
//		 long a=0;
//		 try {
//		 a=new SimpleDateFormat("yyyy-MM-dd").parse("2012-07-05").getTime();
//		 } catch (ParseException e) {
//		
//		 e.printStackTrace();
//		 }
//		
//		 hp_Pur_OrderVO1.setPay_Date(new Timestamp(a));
//		 hp_Pur_OrderVO1.setDetail_Stat("N");
//		 dao.update(hp_Pur_OrderVO1);
//		 HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		
		
		
		// findByPrimaryKey
//		 HP_Pur_OrderVO hp_Pur_OrderVO3=dao.findByPrimaryKey("2");
//		 System.out.println(hp_Pur_OrderVO3.getPay_Detail_Num());
//		 System.out.println(hp_Pur_OrderVO3.getHpVO());
//		 System.out.println(hp_Pur_OrderVO3.getMemberVO());
//		 System.out.println(hp_Pur_OrderVO3.getPay_Amount());
//		 System.out.println(hp_Pur_OrderVO3.getPay_Date());
//		 System.out.println(hp_Pur_OrderVO3.getDetail_Stat());
//		 HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		
		
		// getAll

//		 List<HP_Pur_OrderVO> list=dao.getAll();
//		 for(HP_Pur_OrderVO hp_Pur_Orders:list){
//		 System.out.println(hp_Pur_Orders.getPay_Detail_Num());
//		 System.out.println(hp_Pur_Orders.getHpVO());
//		 System.out.println(hp_Pur_Orders.getMemberVO());
//		 System.out.println(hp_Pur_Orders.getPay_Amount());
//		 System.out.println(hp_Pur_Orders.getPay_Date());
//		 System.out.println(hp_Pur_Orders.getDetail_Stat());
//		 System.out.println("-----------------------------");
//		
//		 }
//		 HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

		// delete  
//		 dao.delete("SS");
//		 HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

	}

}
