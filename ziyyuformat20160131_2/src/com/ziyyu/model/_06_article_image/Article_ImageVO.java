package com.ziyyu.model._06_article_image;

import com.ziyyu.model._05_article.ArticleVO;

public class Article_ImageVO  implements java.io.Serializable{
	private ArticleVO articleVO;
	private String img_Name;
	private byte[] img_Cont;
	private String img_Stat;
	
	public ArticleVO getArticleVO() {
		return articleVO;
	}
	public void setArticleVO(ArticleVO articleVO) {
		this.articleVO = articleVO;
	}
	public String getImg_Name() {
		return img_Name;
	}
	public void setImg_Name(String img_Name) {
		this.img_Name = img_Name;
	}
	public byte[] getImg_Cont() {
		return img_Cont;
	}
	public void setImg_Cont(byte[] img_Cont) {
		this.img_Cont = img_Cont;
	}
	public String getImg_Stat() {
		return img_Stat;
	}
	public void setImg_Stat(String img_Stat) {
		this.img_Stat = img_Stat;
	}
	
	
	
}