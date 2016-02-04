package com.ziyyu.model._07_repost;

import java.sql.Timestamp;

import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._05_article.ArticleVO;

public class RepostVO implements java.io.Serializable{
	private ArticleVO article;
	private MemberVO member;
	private Timestamp repost_Time;
	private String repost_Cont;
	private String repost_Stat;
	public ArticleVO getArticle() {
		return article;
	}
	public void setArticle(ArticleVO article) {
		this.article = article;
	}
	public MemberVO getMember() {
		return member;
	}
	public void setMember(MemberVO member) {
		this.member = member;
	}
	public Timestamp getRepost_Time() {
		return repost_Time;
	}
	public void setRepost_Time(Timestamp repost_Time) {
		this.repost_Time = repost_Time;
	}
	public String getRepost_Cont() {
		return repost_Cont;
	}
	public void setRepost_Cont(String repost_Cont) {
		this.repost_Cont = repost_Cont;
	}
	public String getRepost_Stat() {
		return repost_Stat;
	}
	public void setRepost_Stat(String repost_Stat) {
		this.repost_Stat = repost_Stat;
	}
	
	
	
	
	

}
