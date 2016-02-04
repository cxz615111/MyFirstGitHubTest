package com.ziyyu.model._26_ps_hotel_item;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ziyyu.model._09_hp_air_ticket.HP_Air_TicketVO;
import com.ziyyu.model._25_airline.AirlineVO;
import com.ziyyu.model._27_ps_air_item.PS_Air_ItemDAO;
import com.ziyyu.model._27_ps_air_item.PS_Air_ItemVO;

import hibernate_configuration.HibernateUtil;

public class PS_Hotel_ItemDAO implements PS_Hotel_ItemInterfaceDAO {

	@Override
	public void insert(PS_Hotel_ItemVO phi) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.save(phi);
		return;

	}

	@Override
	public void update(PS_Hotel_ItemVO phi) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.update(phi);
		return;

	}

	@Override
	public void delete(String ps_Hotel_Item) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		PS_Hotel_ItemVO phi = (PS_Hotel_ItemVO) session.get(PS_Hotel_ItemVO.class, ps_Hotel_Item);
		session.delete(phi);
		return;
	}

	@Override
	public PS_Hotel_ItemVO findByPrimaryKey(String ps_Hotel_Item) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		PS_Hotel_ItemVO phi = (PS_Hotel_ItemVO) session.get(PS_Hotel_ItemVO.class, ps_Hotel_Item);

		return phi;
	}

	@Override
	public List<PS_Hotel_ItemVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Query query = session.createQuery("from PS_Hotel_ItemVO order by ps_Hotel_Item");
		List<PS_Hotel_ItemVO> phis = query.list();

		return phis;

	}

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		PS_Hotel_ItemDAO dao = new PS_Hotel_ItemDAO();
		com.ziyyu.model._24_hotel.HotelVO hvo = new com.ziyyu.model._24_hotel.HotelVO();
		hvo.setHotel_Num("1");
		// insert
//		 PS_Hotel_ItemVO vo=new PS_Hotel_ItemVO();
//		 vo.setPs_Hotel_Item("7");
//		 vo.setHotelVO(hvo);
//		 vo.setGuest_Num(1);
//		 vo.setRoom_Name("一般套房");
//		 dao.insert(vo);

		// update
		// PS_Hotel_ItemVO vo2=new PS_Hotel_ItemVO();
		// vo2.setPs_Hotel_Item("7");
		// vo2.setHotelVO(hvo);
		// vo2.setGuest_Num(2);
		// vo2.setRoom_Name("總統套房");
		// dao.update(vo2);

		// find by primary key
//		 PS_Hotel_ItemVO vo3 = dao.findByPrimaryKey("7");
//		 System.out.println("PS_hotel_item:"+vo3.getPs_Hotel_Item());
//		 System.out.println("hotel_num:"+vo3.getHotelVO());
//		 System.out.println("guest_num:"+vo3.getGuest_Num());
//		 System.out.println("room_name:"+vo3.getRoom_Name());
//		//
		// find all
		 List<PS_Hotel_ItemVO> phis = dao.getAll();
		 for (PS_Hotel_ItemVO phi : phis) {
		 System.out.print(phi.getPs_Hotel_Item() + ", ");
		 System.out.print(phi.getHotelVO() + ", ");
		 System.out.print(phi.getGuest_Num() + ", ");
		 System.out.print(phi.getRoom_Name() + ",");
		 System.out.print(phi.getPs_Status() + "\n");
		 }

		// delete
//	 dao.delete("7");
		tx.commit();
	}
}