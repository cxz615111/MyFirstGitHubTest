package com.ziyyu.model.service._05_article;




public class ArticleService {
	private static ArticleInterfaceDAO  articleDAO = new articleDAO();
//ArticleDAO  ArticleInterfaceDAO   ArticleVO
	public boolean repost_stat_change(RepostVO rpt) {// 修改回言狀態

		RepostVO rptvo = repostDAO.findByPrimaryKey(rpt.getArticle(), rpt.getMember(), rpt.getRepost_Time());

		if (rptvo.getRepost_Stat() != rpt.getRepost_Stat()) {
			rptvo.setRepost_Stat(rpt.getRepost_Stat());
			return true;
		} else {
			return false;
		}
	}
}
