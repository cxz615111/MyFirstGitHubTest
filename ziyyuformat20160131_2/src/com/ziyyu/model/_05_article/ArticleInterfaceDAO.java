package com.ziyyu.model._05_article;

import java.util.List;

public interface ArticleInterfaceDAO {
	
		public void insert(ArticleVO atc);
		public void update(ArticleVO atc);
		public void delete(int article_Num);
		public ArticleVO findByPrimaryKey(int article_Num);
		public List<ArticleVO> getAll();
}

