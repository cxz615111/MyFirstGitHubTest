package com.ziyyu.model._05_article;

import hibernate_configuration.HibernateUtil;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ziyyu.model._09_hp_air_ticket.HP_Air_TicketVO;

public class ArticleDAO implements ArticleInterfaceDAO {
	public static void main(String[] args) {
		HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
//			ArticleInterfaceDAO dao = new ArticleDAO();
//			ArticleVO VO=new ArticleVO();
//			
//			long b=0;
//			try {
//				b=new SimpleDateFormat("yyyy-MM-dd").parse("2014-4-9").getTime();
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			VO.setPost_Time(new Timestamp(b));
//			
//			com.ziyyu.model._01_member.MemberVO mb=new com.ziyyu.model._01_member.MemberVO();
//			mb.setAccount("acca01");
//			VO.setMemberVO(mb);
//			VO.setArticle_Cont("ylajf");
//			VO.setGp(5);
//			VO.setBp(4);
//			
//			long a=0;
//			try {
//				a=new SimpleDateFormat("yyyy-MM-dd").parse("2012-3-5").getTime();
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			VO.setEdit_Time(new Timestamp(a));
//			VO.setUser_Stat("d");
//			VO.setArticle_Type("Y");
//			VO.setRepost_Num(7);
//			com.ziyyu.model._01_member.MemberVO vb=new com.ziyyu.model._01_member.MemberVO();
//			vb.setAccount("acca01");
//			VO.setReporter_memVO(vb);
//			dao.insert(VO);
//			
			
/*----------------------------------------------------------------------------------------------*/
//			ArticleInterfaceDAO dao = new ArticleDAO();
//			ArticleVO VO=new ArticleVO();
//			VO.setArticle_Num(11);
//			long b=0;
//			try {
//				b=new SimpleDateFormat("yyyy-MM-dd").parse("2222-3-2").getTime();
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			VO.setPost_Time(new Timestamp(b));
//			
//			com.ziyyu.model._01_member.MemberVO mb=new com.ziyyu.model._01_member.MemberVO();
//			mb.setAccount("acca01");
//			VO.setMemberVO(mb);
//			VO.setArticle_Cont("ylajf");
//			VO.setGp(5);
//			VO.setBp(4);
//			
//			long a=0;
//			try {
//				a=new SimpleDateFormat("yyyy-MM-dd").parse("2012-3-5").getTime();
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			VO.setEdit_Time(new Timestamp(a));
//			VO.setUser_Stat("d");
//			VO.setArticle_Type("Y");
//			VO.setRepost_Num(7);
//			com.ziyyu.model._01_member.MemberVO vb=new com.ziyyu.model._01_member.MemberVO();
//			vb.setAccount("acca01");
//			VO.setReporter_memVO(vb);
//			dao.update(VO);
			/*----------------------------------------------------------*/
		ArticleInterfaceDAO dao = new ArticleDAO();

		ArticleVO xx=dao.findByPrimaryKey(1);
			System.out.println(xx.getArticle_Type());
			System.out.println(xx.getBp());
/*--------------------------------------------------------------------*/
//		ArticleInterfaceDAO dao = new ArticleDAO();
//			List<ArticleVO> pais = dao.getAll();
//			for (ArticleVO pai : pais) {
//			System.out.print(pai.getArticle_Num()+ ", ");
//		}
/*------------------------------------------------------------*/
//			ArticleDAO bb=new ArticleDAO();
//			
//			
//			
//			bb.delete(2);
		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
	
	}
			
	@Override
	public void insert(ArticleVO atc) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			
		session.save(atc);
		
		return ;

	}

	@Override
	public void update(ArticleVO atc) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		
			session.update(atc);
		
		return ;

	}

	@Override
	public void  delete(int article_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
     
			ArticleVO hat = (ArticleVO) session.get(ArticleVO.class,article_Num);
			session.delete(hat);
		
		return ;

	}

	@Override
	public ArticleVO findByPrimaryKey(int article_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	

	
			
		ArticleVO atc = (ArticleVO) session.get(ArticleVO.class, article_Num);
		
		return atc;
	}

	@Override
	public List<ArticleVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		

		
			Query query = session
					.createQuery("from ArticleVO order by article_Num");
			List<ArticleVO> atcs = query.list();
		

		return atcs;
	}
}
