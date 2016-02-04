package com.ziyyu.model.service._06_admin;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ziyyu.model._01_member.MemberDAO;
import com.ziyyu.model._01_member.MemberDAO_Interface;
import com.ziyyu.model._01_member.MemberVO;

import hibernate_configuration.HibernateUtil;

public class AdminService {
	private static MemberDAO_Interface memberDAO = new MemberDAO();

	public List<MemberVO> memberAll() {// 查詢全部會員

		List<MemberVO> mems = memberDAO.getAll();
		if (mems == null || mems.isEmpty()) {
			return null;
		}
		return mems;
	}

	public MemberVO memberSelect(String member) {// 查詢單個會員

		MemberVO mems = memberDAO.findByPrimaryKey(member);

		if (mems != null) {
			return mems;
		} else {
			return null;
		}
	}

	public void member_auth_change(MemberVO mvo) {// 會員權限更新
		memberDAO.update(mvo);
	}

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		// 會員權限更新
//		AdminService adminService = new AdminService();
//		MemberVO mvo = new MemberVO();
//		mvo = memberDAO.findByPrimaryKey("snoopy");
//		mvo.setMem_Auth("A");
//
//		adminService.member_auth_change(mvo);
		tx.commit();

	}
}
