package com.ziyyu.model._07_repost;

import hibernate_configuration.HibernateUtil;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._05_article.ArticleVO;
import com.ziyyu.model._12_taxi.TaxiVO;
import com.ziyyu.model._19_hp_hotelri_ct.HP_HotelRI_CTDAO;

public class RepostDAO implements RepostInterfaceDAO {

	@Override
	public void insert(RepostVO rpt) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.save(rpt);
		return;
	}

	@Override
	public void update(RepostVO rpt) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.update(rpt);
		return;
	}

	@Override
	public void delete(ArticleVO article, MemberVO member, Timestamp repost_time) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		RepostVO rpt = new RepostVO();
		rpt.setArticle(article);
		rpt.setMember(member);
		rpt.setRepost_Time(repost_time);

		RepostVO repost = (RepostVO) session.get(RepostVO.class, rpt);
		session.delete(repost);
		return ;
	}

	@Override
	public RepostVO findByPrimaryKey(ArticleVO article, MemberVO member, Timestamp repost_time) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		RepostVO rpt = new RepostVO();
		rpt.setArticle(article);
		rpt.setMember(member);
		rpt.setRepost_Time(repost_time);

		RepostVO repost = (RepostVO) session.get(RepostVO.class, rpt);
 
		return repost ;
	}

	@Override
	public List<RepostVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		 
			Query query = session.createQuery("from RepostVO order by article_num ,account,repost_time");
			List<RepostVO> rpts = query.list();
			 

		return rpts;

	}

	public static void main(String[] args) {
		RepostDAO dao = new RepostDAO();
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		com.ziyyu.model._05_article.ArticleVO hvo = new com.ziyyu.model._05_article.ArticleVO();
		hvo.setArticle_Num(2);
		com.ziyyu.model._01_member.MemberVO htvo = new com.ziyyu.model._01_member.MemberVO();
		htvo.setAccount("snoopy");

		// insert
//		RepostVO vo = new RepostVO();
//
//		vo.setArticle(hvo);
//		vo.setMember(htvo);
//		vo.setRepost_Cont("Car is shit.");
//		vo.setRepost_Stat("B");

		long a = 0;
		try {
			a = new SimpleDateFormat("yyyy-MM-dd").parse("2012-12-31").getTime();
		} catch (ParseException e) {

			e.printStackTrace();
		}
//
//		vo.setRepost_Time(new Timestamp(a));
//
//		dao.insert(vo);

		// update
//		 RepostVO vo2 = new RepostVO();
//		
//		 vo2.setArticle(hvo);
//		 vo2.setMember(htvo);
//		 vo2.setRepost_Cont("Car is break.");
//		 vo2.setRepost_Stat("B");
//		
//		
//		 vo2.setRepost_Time(new Timestamp(a));
//		
//		 dao.update(vo2);

		// find by primary key
//		 RepostVO vo3 = dao.findByPrimaryKey(hvo, htvo, new Timestamp(a));
//		 System.out.println(vo3.getMember());
//		 System.out.println(vo3.getArticle());
//		 System.out.println(vo3.getRepost_Time());
//		
//		 System.out.println(vo3.getRepost_Cont());
//		 System.out.println(vo3.getRepost_Stat());

		// find all
		 List<RepostVO> hecs = dao.getAll();
		 for (RepostVO hec : hecs) {
		 System.out.print(hec.getMember() + ", ");
		 System.out.print(hec.getArticle() + ", ");
		 System.out.print(hec.getRepost_Time() + ", ");
		 System.out.print(hec.getRepost_Cont() + ", ");
		 System.out.println(hec.getRepost_Stat() + "\n");
		
		 }

		// delete
//		  dao.delete(hvo, htvo, new Timestamp(a));
		
		tx.commit();
	}
}