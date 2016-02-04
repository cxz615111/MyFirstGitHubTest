package com.ziyyu.model._06_article_image;

import java.util.List;

import com.ziyyu.model._05_article.ArticleVO;

public interface Article_ImageInterfaceDAO {
	public void insert(Article_ImageVO ati);
	public void update(Article_ImageVO ati);
	public void delete(ArticleVO articleVO,String img_Name);
	public Article_ImageVO findByPrimaryKey(ArticleVO articleVO,String img_Name);	
	public List<Article_ImageVO> getAll();
}
