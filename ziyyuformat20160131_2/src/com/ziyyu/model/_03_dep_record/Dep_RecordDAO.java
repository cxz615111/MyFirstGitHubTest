package com.ziyyu.model._03_dep_record;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ziyyu.model._01_member.MemberVO;

import hibernate_configuration.HibernateUtil;

public class Dep_RecordDAO implements Dep_RecordInterfaceDAO {

	private static final String GET_ALL_STMT = "from Dep_RecordVO ";

	@Override
	public void insert(Dep_RecordVO dep_RecordVO) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.save(dep_RecordVO);
		return;
	}

	@Override
	public void update(Dep_RecordVO dep_RecordVO) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.update(dep_RecordVO);
		return;
	}

	@Override
	public void delete(String trans_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Dep_RecordVO dep_RecordVO = new Dep_RecordVO();
		dep_RecordVO.setTrans_Num(trans_Num);
		session.delete(dep_RecordVO);
		return;
	}

	@Override
	public Dep_RecordVO findByPrimaryKey(String trans_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Dep_RecordVO dep_RecordVO = (Dep_RecordVO) session.get(Dep_RecordVO.class, trans_Num);
		return dep_RecordVO;
	}

	@Override
	public List<Dep_RecordVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session.createQuery(GET_ALL_STMT);
		List<Dep_RecordVO> list = query.list();
		return list;
	}

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
		Dep_RecordDAO dao = new Dep_RecordDAO();
		MemberVO memberVO = new MemberVO();
		memberVO.setAccount("person1");

		// insert
//		 Dep_RecordVO dep_RecordVO=new Dep_RecordVO();
//		 dep_RecordVO.setTrans_Num("5566555");
//		 long a=0;
//		 try {
//		 a=new SimpleDateFormat("yyyy-MM-dd").parse("2012-3-5").getTime();
//		 } catch (ParseException e) {
//		
//		 e.printStackTrace();
//		 }
//		
//		 dep_RecordVO.setDeposit_Time(new Timestamp(a));
//		 dep_RecordVO.setTrans_Money(123654);
//		 dep_RecordVO.setDeposit_Point(123654);
//		 dep_RecordVO.setMemberVO(memberVO);
//		 dao.insert(dep_RecordVO);
//		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

		// update
//		 Dep_RecordVO dep_RecordVO2=new Dep_RecordVO();
//		 dep_RecordVO2.setTrans_Num("5566555");
//		 long a=0;
//		 try {
//		 a=new SimpleDateFormat("yyyy-MM-dd").parse("2012-12-31").getTime();
//		 } catch (ParseException e) {
//		
//		 e.printStackTrace();
//		 }
//		
//		 dep_RecordVO2.setDeposit_Time(new Timestamp(a));
//		 dep_RecordVO2.setTrans_Money(999110);
//		 dep_RecordVO2.setDeposit_Point(999110);
//		 dep_RecordVO2.setMemberVO(memberVO);
//		 dao.update(dep_RecordVO2);
//		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		
		
		// findByPrimaryKey
//		 Dep_RecordVO dep_RecordVO3=dao.findByPrimaryKey("20151227153302");
//		 System.out.println(dep_RecordVO3.getTrans_Num());
//		 System.out.println(dep_RecordVO3.getDeposit_Time());
//		 System.out.println(dep_RecordVO3.getTrans_Money());
//		 System.out.println(dep_RecordVO3.getDeposit_Point());
//		 System.out.println(dep_RecordVO3.getMemberVO());
//		 System.out.println("----------------------------");
//		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		
		// getAll
//		 List<Dep_RecordVO> list=dao.getAll();
//		 for(Dep_RecordVO dep_Records:list){
//		 System.out.println(dep_Records.getTrans_Num());
//		 System.out.println(dep_Records.getDeposit_Time());
//		 System.out.println(dep_Records.getTrans_Money());
//		 System.out.println(dep_Records.getDeposit_Point());
//		 System.out.println(dep_Records.getMemberVO());
//		 System.out.println("----------------------------");
//		 }
//		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

		// delete
//		 dao.delete("5566555");
//		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
	}
}
