package com.ziyyu.model._04_mem_grade;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ziyyu.model._01_member.MemberVO;

import hibernate_configuration.HibernateUtil;

public class Mem_GradeDAO implements Mem_GradeInterfaceDAO {

	private static final String GET_ALL_STMT = "from Mem_GradeVO ";

	@Override
	public void insert(Mem_GradeVO mem_GradeVO) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.save(mem_GradeVO);
		return;
	}

	@Override
	public void update(Mem_GradeVO mem_GradeVO) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.update(mem_GradeVO);
		return;
	}

	@Override
	public void delete(String mem_Grade_Id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Mem_GradeVO mem_GradeVO = new Mem_GradeVO();
		mem_GradeVO.setMem_Grade_Id(mem_Grade_Id);
		session.delete(mem_GradeVO);
		return;
	}

	@Override
	public Mem_GradeVO findByPrimaryKey(String mem_Grade_Id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Mem_GradeVO mem_GradeVO = (Mem_GradeVO) session.get(Mem_GradeVO.class, mem_Grade_Id);
		return mem_GradeVO;
	}

	@Override
	public List<Mem_GradeVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session.createQuery(GET_ALL_STMT);
		List<Mem_GradeVO> list = query.list();
		return list;
	}

	@Override
	public Set<MemberVO> getMembersByMem_Grade_Id(String mem_Grade_Id) {
		Set<MemberVO> set = findByPrimaryKey(mem_Grade_Id).getMembers();
		return set;
	}

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
		MemberVO memberVO = new MemberVO();
		memberVO.setAccount("acca01");
		Mem_GradeDAO dao = new Mem_GradeDAO();

		// insert
//		 Mem_GradeVO mem_GradeVO=new Mem_GradeVO();
//		 mem_GradeVO.setMem_Grade_Id("R");
//		 mem_GradeVO.setMem_Grade_Name("不存在");
//		 dao.insert(mem_GradeVO);
//		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		
		// update   ???
//		 Mem_GradeVO mem_GradeVO1=new Mem_GradeVO();
//		 mem_GradeVO1.setMem_Grade_Id("R");
//		 mem_GradeVO1.setMem_Grade_Name("測試用");
//		 dao.update(mem_GradeVO1);
//		 HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		
		// findByPrimaryKey
//		 Mem_GradeVO mem_GradeVO3=dao.findByPrimaryKey("C");
//		 System.out.println(mem_GradeVO3.getMem_Grade_Id());
//		 System.out.println(mem_GradeVO3.getMem_Grade_Name());
//		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		
		// getAll
//		 List<Mem_GradeVO> list=dao.getAll();
//		 for(Mem_GradeVO Mem_Grades:list){
//		 System.out.println(Mem_Grades.getMem_Grade_Id());
//		 System.out.println(Mem_Grades.getMem_Grade_Name());
//		 System.out.println("----------------------");
//		 }
//		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		
		// delete
//		 dao.delete("R");
//		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

	}

}
