package com.ziyyu.model._05_article;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._06_article_image.Article_ImageVO;
import com.ziyyu.model._07_repost.RepostVO;

public class ArticleVO implements java.io.Serializable {
	private int article_Num;
	private Timestamp post_Time;
	private MemberVO memberVO;
	private MemberVO reporter_memVO;
	private String article_Cont;
	private Integer gp;
	private Integer bp;
	private Timestamp edit_Time;
	private String user_Stat;
	private String article_Type;
	private Integer repost_Num;
	private Set<Article_ImageVO> article_Images = new HashSet<Article_ImageVO>();
	private Set<RepostVO> reposts = new HashSet<RepostVO>();
	public int getArticle_Num() {
		return article_Num;
	}
	public void setArticle_Num(int article_Num) {
		this.article_Num = article_Num;
	}
	public Timestamp getPost_Time() {
		return post_Time;
	}
	public void setPost_Time(Timestamp post_Time) {
		this.post_Time = post_Time;
	}
	public MemberVO getMemberVO() {
		return memberVO;
	}
	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	public MemberVO getReporter_memVO() {
		return reporter_memVO;
	}
	public void setReporter_memVO(MemberVO reporter_memVO) {
		this.reporter_memVO = reporter_memVO;
	}
	public String getArticle_Cont() {
		return article_Cont;
	}
	public void setArticle_Cont(String article_Cont) {
		this.article_Cont = article_Cont;
	}
	public Integer getGp() {
		return gp;
	}
	public void setGp(Integer gp) {
		this.gp = gp;
	}
	public Integer getBp() {
		return bp;
	}
	public void setBp(Integer bp) {
		this.bp = bp;
	}
	public Timestamp getEdit_Time() {
		return edit_Time;
	}
	public void setEdit_Time(Timestamp edit_Time) {
		this.edit_Time = edit_Time;
	}
	public String getUser_Stat() {
		return user_Stat;
	}
	public void setUser_Stat(String user_Stat) {
		this.user_Stat = user_Stat;
	}
	public String getArticle_Type() {
		return article_Type;
	}
	public void setArticle_Type(String article_Type) {
		this.article_Type = article_Type;
	}
	public Integer getRepost_Num() {
		return repost_Num;
	}
	public void setRepost_Num(Integer repost_Num) {
		this.repost_Num = repost_Num;
	}
	public Set<Article_ImageVO> getArticle_Images() {
		return article_Images;
	}
	public void setArticle_Images(Set<Article_ImageVO> article_Images) {
		this.article_Images = article_Images;
	}
	public Set<RepostVO> getReposts() {
		return reposts;
	}
	public void setReposts(Set<RepostVO> reposts) {
		this.reposts = reposts;
	}
	
	
	
	
}