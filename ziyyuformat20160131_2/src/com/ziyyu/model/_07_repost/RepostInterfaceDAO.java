package com.ziyyu.model._07_repost;

import java.sql.Timestamp;
import java.util.List;

import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._05_article.ArticleVO;

public interface RepostInterfaceDAO {

	// public void insert(RepostVO rpt);
	public void insert(RepostVO rpt);

	public void update(RepostVO rpt);

	// public void delete(int article_Num, String account,java.util.Date
	// repost_time);//???
	public void delete(ArticleVO article, MemberVO member, Timestamp repost_time);// ???

	public RepostVO findByPrimaryKey(ArticleVO article, MemberVO member, Timestamp repost_time);

	public List<RepostVO> getAll();

}
