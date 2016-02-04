package com.ziyyu.model._06_article_image;

import hibernate_configuration.HibernateUtil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ziyyu.model._05_article.ArticleVO;
import com.ziyyu.model._09_hp_air_ticket.HP_Air_TicketVO;

public class Article_ImageDAO implements Article_ImageInterfaceDAO {

	@Override
	public void insert(Article_ImageVO ati) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.saveOrUpdate(ati);
		return;

	}

	@Override
	public void update(Article_ImageVO ati) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.update(ati);

		return;

	}

	@Override
	public void delete(ArticleVO articleVO, String img_Name) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
			Article_ImageVO artice_ImageVO = new Article_ImageVO();
			artice_ImageVO.setArticleVO(articleVO);
			artice_ImageVO.setImg_Name(img_Name);
			Article_ImageVO ati = (Article_ImageVO) session.get(
					Article_ImageVO.class, artice_ImageVO);
			session.delete(ati);

		
		return ;

	}

	@Override
	public Article_ImageVO findByPrimaryKey(ArticleVO articleVO, String img_Name) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

			Article_ImageVO artice_ImageVO = new Article_ImageVO();
			artice_ImageVO.setArticleVO(articleVO);
			artice_ImageVO.setImg_Name(img_Name);
			Article_ImageVO ati = (Article_ImageVO) session.get(Article_ImageVO.class,
					artice_ImageVO);
		
		return ati;
	}

	@Override
	public List<Article_ImageVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

			Query query = session
					.createQuery("from Article_ImageVO order by article_Num");
			List<Article_ImageVO> atis = query.list();

		return atis;
	}

	// public static void main(String args[]){
	// Article_ImageDAO a= new Article_ImageDAO();
	//
	// ArticleVO PK = new ArticleVO();
	// PK.setArticle_Num(1);
	//
	// Article_ImageVO avo = new Article_ImageVO();
	//
	// avo.setArticleVO(PK);
	// avo.setImg_Cont("123456".getBytes());
	// avo.setImg_Name("123.jpg");
	// avo.setImg_Stat("a");
	//
	// //System.out.println(a.insert(avo));
	//
	// // System.out.println(a.update(avo));
	//
	// //System.out.println(a.findByPrimaryKey(PK, "123.jpg").getImg_Name());
	// System.out.println(a.delete(PK, "123456.jpg"));
	//
	// }

}
