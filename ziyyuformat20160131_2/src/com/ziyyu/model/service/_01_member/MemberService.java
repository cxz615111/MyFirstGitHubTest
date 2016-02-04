package com.ziyyu.model.service._01_member;

import hibernate_configuration.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

import com.ziyyu.model._01_member.MemberDAO;
import com.ziyyu.model._01_member.MemberDAO_Interface;
import com.ziyyu.model._01_member.MemberInterfaceDAO;
import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._03_dep_record.Dep_RecordDAO;
import com.ziyyu.model._03_dep_record.Dep_RecordInterfaceDAO;
import com.ziyyu.model._03_dep_record.Dep_RecordVO;
import com.ziyyu.model._04_mem_grade.Mem_GradeVO;
import com.ziyyu.model._20_hp_pur_order.HP_Pur_OrderDAO;
import com.ziyyu.model._20_hp_pur_order.HP_Pur_OrderInterfaceDAO;
import com.ziyyu.model._20_hp_pur_order.HP_Pur_OrderVO;
import com.ziyyu.model._22_ps_air_ticket_order.PS_Air_Ticket_OrderDAO;
import com.ziyyu.model._22_ps_air_ticket_order.PS_Air_Ticket_OrderInterfaceDAO;
import com.ziyyu.model._22_ps_air_ticket_order.PS_Air_Ticket_OrderVO;
import com.ziyyu.model._23_ps_hotel_order.PS_Hotel_OrderDAO;
import com.ziyyu.model._23_ps_hotel_order.PS_Hotel_OrderInterfaceDAO;
import com.ziyyu.model._23_ps_hotel_order.PS_Hotel_OrderVO;

public class MemberService {
	private MemberDAO_Interface memberDAO = new MemberDAO();
	private List<MemberVO> list;

	
	public static void main(String[] args) {
		HibernateUtil.getSessionFactory().getCurrentSession()
				.beginTransaction();
		MemberService memberService = new MemberService();


		// 會員登入驗證
		 MemberVO memberVO = memberService.checkLogIn("acca01", "654123456");
		 System.out.println(memberVO);

	}

	

	// 會員登入驗證
	public MemberVO checkLogIn(String account, String password) {
		MemberVO memberVO = memberDAO.findByPrimaryKey(account);
		if (memberVO != null) {
			if (password != null && password.trim().length() != 0) {
				String pwd = memberVO.getPassword();
				if (pwd.equals(password)) {
					return memberVO;
				}
			}
		}
		return null;
	}

}