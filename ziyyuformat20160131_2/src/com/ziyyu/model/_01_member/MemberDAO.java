package com.ziyyu.model._01_member;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ziyyu.model._02_nationality.NationalityVO;
import com.ziyyu.model._03_dep_record.Dep_RecordVO;
import com.ziyyu.model._04_mem_grade.Mem_GradeVO;
import com.ziyyu.model._05_article.ArticleVO;
import com.ziyyu.model._07_repost.RepostVO;
import com.ziyyu.model._20_hp_pur_order.HP_Pur_OrderVO;
import com.ziyyu.model._22_ps_air_ticket_order.PS_Air_Ticket_OrderVO;
import com.ziyyu.model._23_ps_hotel_order.PS_Hotel_OrderVO;

import hibernate_configuration.HibernateUtil;

public class MemberDAO implements MemberDAO_Interface {

	private static final String GET_ALL_STMT = "from MemberVO ";

	@Override
	public void insert(MemberVO memberVO) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.save(memberVO);
		return;

	}

	@Override
	public void update(MemberVO memberVO) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.update(memberVO);
		return;

	}

	@Override
	public void delete(String account) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		MemberVO memberVO = new MemberVO();
		memberVO.setAccount(account);
		session.delete(memberVO);
		return;

	}

	@Override
	public MemberVO findByPrimaryKey(String account) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		MemberVO memberVO = (MemberVO) session.get(MemberVO.class, account);
		return memberVO;
	}

	@Override
	public List<MemberVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session.createQuery(GET_ALL_STMT);
		List<MemberVO> list = query.list();
		return list;
	}

	@Override
	public Set<PS_Hotel_OrderVO> getPS_Hotel_OrdersByAccount(String account) {
		Set<PS_Hotel_OrderVO> set = findByPrimaryKey(account).getPs_Hotel_Orders();
		return set;
	};

	@Override
	public Set<HP_Pur_OrderVO> getHP_Pur_OrdersBYAccount(String account) {
		Set<HP_Pur_OrderVO> set = findByPrimaryKey(account).getHp_Pur_Orders();
		return set;
	};

	@Override
	public Set<PS_Air_Ticket_OrderVO> getPS_Air_Ticket_OrdersByAccount(String account) {
		Set<PS_Air_Ticket_OrderVO> set = findByPrimaryKey(account).getPs_Air_Ticket_Orders();
		return set;
	};

	@Override
	public Set<Dep_RecordVO> getDep_RecordsByAccount(String account) {
		Set<Dep_RecordVO> set = findByPrimaryKey(account).getDep_Records();
		return set;
	};

	public Set<ArticleVO> getArticlesByAccount(String account) {
		Set<ArticleVO> set = findByPrimaryKey(account).getArticles();
		return set;
	};

	public Set<RepostVO> getRepostsByAccount(String account) {
		Set<RepostVO> set = findByPrimaryKey(account).getReposts();
		return set;
	};

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
		MemberDAO dao = new MemberDAO();
		com.ziyyu.model._02_nationality.NationalityVO nationalityVO = new com.ziyyu.model._02_nationality.NationalityVO();
		nationalityVO.setCode("TWN");
		com.ziyyu.model._04_mem_grade.Mem_GradeVO mem_GradeVO = new com.ziyyu.model._04_mem_grade.Mem_GradeVO();
		mem_GradeVO.setMem_Grade_Id("A");

		// insert
		// MemberVO memberVO1=new MemberVO();
		// memberVO1.setAccount("person1");
		// memberVO1.setPassword("123654");
		// memberVO1.setUsername("King1");
		// memberVO1.setEmail("hibern@gmail.com");
		// memberVO1.setPerson_Id("SNN");
		// memberVO1.setMob_Phone("0933666777");
		// memberVO1.setPassport_Num("99999");
		// memberVO1.setExpiry_Date(null);
		// memberVO1.setName_En("YOYOYO");
		// memberVO1.setNationalityVO(nationalityVO);
		// memberVO1.setBirth(null);
		// memberVO1.setGender("M");
		// memberVO1.setAddress("台北市文華路三段");
		// memberVO1.setOff_Phone("0222430000");
		// memberVO1.setHome_Phone("89411100");
		// memberVO1.setIncome(42000);
		// memberVO1.setEdu_Level("大學");
		// memberVO1.setMem_Pic(null);
		// memberVO1.setMem_GradeVO(mem_GradeVO);
		// memberVO1.setMem_Auth("B");
		// memberVO1.setAcc_Point(60);
		// dao.insert(memberVO1);
		// HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

		// update
		// MemberVO memberVO1=new MemberVO();
		// memberVO1.setAccount("person1");
		// memberVO1.setPassword("9987566");
		// memberVO1.setUsername("King1");
		// memberVO1.setEmail("hibern@gmail.com");
		// memberVO1.setPerson_Id("SNN");
		// memberVO1.setMob_Phone("0933666777");
		// memberVO1.setPassport_Num("99999");
		// memberVO1.setExpiry_Date(null);
		// memberVO1.setName_En("YOYOYO");
		// memberVO1.setNationalityVO(nationalityVO);
		// memberVO1.setBirth(null);
		// memberVO1.setGender("M");
		// memberVO1.setAddress("台北市文華路三段");
		// memberVO1.setOff_Phone("0222430000");
		// memberVO1.setHome_Phone("89411100");
		// memberVO1.setIncome(42000);
		// memberVO1.setEdu_Level("碩士");
		// memberVO1.setMem_Pic(null);
		// memberVO1.setMem_GradeVO(mem_GradeVO);
		// memberVO1.setMem_Auth("C");
		// memberVO1.setAcc_Point(60);
		// dao.update(memberVO1);
		// HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

		// findByPrimaryKey
		// MemberVO memberVO3=dao.findByPrimaryKey("person1");
		// System.out.println(memberVO3.getAccount());
		// System.out.println(memberVO3.getPassword());
		// System.out.println(memberVO3.getUsername());
		// System.out.println(memberVO3.getEmail());
		// System.out.println(memberVO3.getPerson_Id());
		// System.out.println(memberVO3.getMob_Phone());
		// System.out.println(memberVO3.getPassport_Num());
		// System.out.println(memberVO3.getExpiry_Date());
		// System.out.println(memberVO3.getName_En());
		// System.out.println(memberVO3.getNationalityVO());
		// System.out.println(memberVO3.getBirth());
		// System.out.println(memberVO3.getGender());
		// System.out.println(memberVO3.getAddress());
		// System.out.println(memberVO3.getOff_Phone());
		// System.out.println(memberVO3.getHome_Phone());
		// System.out.println(memberVO3.getIncome());
		// System.out.println(memberVO3.getEdu_Level());
		// System.out.println(memberVO3.getMem_Pic());
		// System.out.println(memberVO3.getMem_GradeVO());
		// System.out.println(memberVO3.getMem_Auth());
		// System.out.println(memberVO3.getAcc_Point());
		// HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

		// getAll
//		 List<MemberVO> list=dao.getAll();
//		 for(MemberVO members:list){
//		 System.out.println(members.getPassword());
//		 System.out.println(members.getUsername());
//		 System.out.println(members.getEmail());
//		 System.out.println(members.getPerson_Id());
//		 System.out.println(members.getMob_Phone());
//		 System.out.println(members.getPassport_Num());
//		 System.out.println(members.getExpiry_Date());
//		 System.out.println(members.getName_En());
//		 System.out.println(members.getNationalityVO());
//		 System.out.println(members.getBirth());
//		 System.out.println(members.getGender());
//		 System.out.println(members.getAddress());
//		 System.out.println(members.getOff_Phone());
//		 System.out.println(members.getHome_Phone());
//		 System.out.println(members.getIncome());
//		 System.out.println(members.getEdu_Level());
//		 System.out.println(members.getMem_Pic());
//		 System.out.println(members.getMem_GradeVO());
//		 System.out.println(members.getMem_Auth());
//		 System.out.println(members.getAcc_Point());
//		 System.out.println("-----------------------");
//		 }
//		 HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

		// delete
		// dao.delete("person1");
		// HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
	}

}
