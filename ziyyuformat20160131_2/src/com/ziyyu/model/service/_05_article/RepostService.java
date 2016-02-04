package com.ziyyu.model.service._05_article;


import com.ziyyu.model._07_repost.RepostDAO;
import com.ziyyu.model._07_repost.RepostInterfaceDAO;
import com.ziyyu.model._07_repost.RepostVO;

public class RepostService {
	private static RepostInterfaceDAO repostDAO = new RepostDAO();

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
