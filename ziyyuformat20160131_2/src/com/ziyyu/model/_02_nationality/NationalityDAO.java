package com.ziyyu.model._02_nationality;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ziyyu.model._01_member.MemberDAO;
import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._21_hp_trav_info.HP_Trav_InfoVO;

import hibernate_configuration.HibernateUtil;

public class NationalityDAO implements NationalityInterfaceDAO {

	private static final String GET_ALL_STMT = "from NationalityVO ";

	@Override
	public void insert(NationalityVO nationalityVO) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.save(nationalityVO);
	}

	@Override
	public void update(NationalityVO nationalityVO) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.update(nationalityVO);
		return;
	}

	@Override
	public void delete(String code) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		NationalityVO nationalityVO = new NationalityVO();
		nationalityVO.setCode(code);
		session.delete(nationalityVO);
		return;

	}

	@Override
	public NationalityVO findByPrimaryKey(String code) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		NationalityVO nationalityVO = (NationalityVO) session.get(NationalityVO.class, code);
		return nationalityVO;
	}

	@Override
	public List<NationalityVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery(GET_ALL_STMT);
		List<NationalityVO> list = query.list();
		return list;
	}

	@Override
	public Set<HP_Trav_InfoVO> getHP_Trav_InfosByCode(String code) {
		Set<HP_Trav_InfoVO> set = findByPrimaryKey(code).getHp_Trav_Infos();
		return set;
	}

	@Override
	public Set<MemberVO> getMembersByCode(String code) {
		Set<MemberVO> set = findByPrimaryKey(code).getMembers();
		return set;
	}

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
		NationalityDAO dao = new NationalityDAO();

		// insert
//		NationalityVO nationalityVO1 = new NationalityVO();
//		nationalityVO1.setCode("TW");
//		nationalityVO1.setCountry("台灣");
//		nationalityVO1.setState("高雄");
//		dao.insert(nationalityVO1);
//		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

		// update
//		 NationalityVO nationalityVO2=new NationalityVO();
//		 nationalityVO2.setCode("TW");
//		 nationalityVO2.setCountry("台灣");
//		 nationalityVO2.setState("新竹");
//		 dao.update(nationalityVO2);
//		 HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

		// findByPrimaryKey
//		 NationalityVO nationalityVO3=dao.findByPrimaryKey("JPN");
//		 System.out.println(nationalityVO3.getCode());
//		 System.out.println(nationalityVO3.getCountry());
//		 System.out.println(nationalityVO3.getState());
//		 HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

		// getAll
//		 List<NationalityVO> list=dao.getAll();
//		 for(NationalityVO nationalities:list){
//		 System.out.println(nationalities.getCode());
//		 System.out.println(nationalities.getCountry());
//		 System.out.println(nationalities.getState());
//		 System.out.println("------------------------");
//		 }
//		 HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

		// delete
//		 dao.delete("TW");
//		 HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
	}

}
