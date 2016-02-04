package com.ziyyu.model.service._03_ps_hotel;



import hibernate_configuration.HibernateUtil;

public class Air_Ticket_Service {
	private PS_Hotel_ItemInterfaceDAO hotel_ItemDAO = new PS_Hotel_ItemDAO();
	// private PS_Hotel_ItemDAO hotel_ItemDAO = new PS_Hotel_ItemVOO();

	public boolean competence(MemberVO member) {// 確認會員購買權限
		if (member.getMem_Auth() == "A" || member.getMem_Auth() == "B") {
			System.out.println(member.getMem_Auth());
			return true;
		} else {
			System.out.println(member.getMem_Auth());
			return false;
		}
	}

	public boolean stored(MemberVO member, int acc_point) { // 確認點數足夠
		if (member.getAcc_Point() >= acc_point) {
			return true;
		} else {
			return false;
		}
	}

	public void air_ticket_in_or_out(PS_Air_ItemVO pai) {// 機票上下架

		PS_Air_ItemVO ai_vo = air_ItemDAO.findByPrimaryKey(pai.getPs_Air_Item());// 該筆機票原上下架狀態
		String ori_Air_Item = ai_vo.getPs_Status();
		if (ori_Air_Item != pai.getPs_Status()) {// 比對該筆機票原狀態與修改後狀態是否不同

			ai_vo.setPs_Status(pai.getPs_Status());
			air_ItemDAO.update(ai_vo);
		}

	}

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		// 上下架測試
		Air_Ticket_Service ats = new Air_Ticket_Service();
		// PS_Air_ItemVO vo2 = new PS_Air_ItemVO();
		// vo2.setPs_Air_Item("4");
		// vo2.setPs_Status("N");
		// ats.air_ticket_in_or_out(vo2);

		// 確認點數足夠
		// MemberVO mvo = new MemberVO();
		// mvo.setAccount("cakska12");
		// mvo.setAcc_Point(200000);
		// System.out.println(ats.stored(mvo, 200000));

		// 確認會員購買權限
		// MemberVO mvo = new MemberVO();
		// mvo.setAccount("cakska12");
		// mvo.setMem_Auth("B");
		// System.out.println(ats.competence(mvo));

		tx.commit();
	}

}
