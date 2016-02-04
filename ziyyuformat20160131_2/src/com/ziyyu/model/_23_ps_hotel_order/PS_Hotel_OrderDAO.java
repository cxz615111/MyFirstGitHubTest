package com.ziyyu.model._23_ps_hotel_order;

import hibernate_configuration.HibernateUtil;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._19_hp_hotelri_ct.HP_HotelRI_CTVO;
import com.ziyyu.model._22_ps_air_ticket_order.PS_Air_Ticket_OrderVO;
import com.ziyyu.model._24_hotel.HotelVO;


public class PS_Hotel_OrderDAO implements PS_Hotel_OrderInterfaceDAO{

	@Override
	public void insert(PS_Hotel_OrderVO pho) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

			session.save(pho);
		
		
		}
	


	@Override
	public void delete(String ps_Hotel_Order, HotelVO hotelVO) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();


			PS_Hotel_OrderVO pho =new PS_Hotel_OrderVO();
			pho.setPs_Hotel_Order(ps_Hotel_Order);
			pho.setHotelVO(hotelVO);
			
			PS_Hotel_OrderVO phoVO = (PS_Hotel_OrderVO) session.get(
					PS_Hotel_OrderVO.class, pho);
			
			session.delete(pho);
		
	}

	@Override
	public void update(PS_Hotel_OrderVO pho) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
			session.update(pho);
			
		
	}

	@Override
	public PS_Hotel_OrderVO findByPrimaryKey(String ps_Hotel_Order, //�g�k�]�����D
			HotelVO hotelVO) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
			PS_Hotel_OrderVO hhc = new PS_Hotel_OrderVO();
			hhc.setPs_Hotel_Order(ps_Hotel_Order);
			hhc.setHotelVO(hotelVO);
			return (PS_Hotel_OrderVO) session.get(PS_Hotel_OrderVO.class,
					hhc);

	}

	@Override
	public List<PS_Hotel_OrderVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

			Query query = session.createQuery("from PS_Hotel_OrderVO order by ps_Hotel_Order,hotelVO");
			List<PS_Hotel_OrderVO> phos = query.list();
			return phos; 
		
	}
	
	public static void main(String[] args) {
	PS_Hotel_OrderDAO pshodao = new PS_Hotel_OrderDAO();
	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	try {
		session.beginTransaction();
 //insert
//PS_Hotel_OrderVO pshotelvo = new PS_Hotel_OrderVO();
//pshotelvo.setPs_Hotel_Order("H0078");
//
//HotelVO hotelvo =new HotelVO();
//hotelvo.setHotel_Num("3");
//pshotelvo.setHotelVO(hotelvo);
//
//MemberVO membervo = new MemberVO();
//membervo.setAccount("acca01");
//pshotelvo.setMemberVO(membervo);
//
//long hms=new java.util.Date().getTime();
//pshotelvo.setPsh_Pay_Date(new Timestamp(hms));
//pshotelvo.setPsh_Pay_Amount(4);
//
//long ymd=new java.util.Date().getTime();
//pshotelvo.setPsh_Checkin(new Date(ymd));
//pshotelvo.setPsh_Pay(20000);
//pshotelvo.setPsh_Order_Stat("s");
//
//pshodao.insert(pshotelvo);
//
//	// update
//	PS_Hotel_OrderVO pshotelvo = new PS_Hotel_OrderVO();
//	pshotelvo.setPs_Hotel_Order("H0078");
//	
//	HotelVO hotelvo =new HotelVO();
//	hotelvo.setHotel_Num("3");
//	pshotelvo.setHotelVO(hotelvo);
//	
//	MemberVO membervo = new MemberVO();
//	membervo.setAccount("acca01");
//	pshotelvo.setMemberVO(membervo);
//	
//	long hms=new java.util.Date().getTime();
//	pshotelvo.setPsh_Pay_Date(new Timestamp(hms));
//	pshotelvo.setPsh_Pay_Amount(4);
//	
//	long ymd=new java.util.Date().getTime();
//	pshotelvo.setPsh_Checkin(new Date(ymd));
//	pshotelvo.setPsh_Pay(99999);
//	pshotelvo.setPsh_Order_Stat("s");
//
//	pshodao.update(pshotelvo); 
//	
//find by primary key
//HotelVO hotelvo =new HotelVO();
//hotelvo.setHotel_Num("3");
//
//PS_Hotel_OrderVO vo3 = pshodao.findByPrimaryKey("H0078",hotelvo);
//System.out.println("ps_Hotel_Order:"+vo3.getPs_Hotel_Order());
//System.out.println("hotel_num:"+vo3.getHotelVO().getHotel_Num());
//System.out.println("account:"+vo3.getMemberVO().getAccount());
//System.out.println("PSH_pay_date:"+vo3.getPsh_Pay_Date());
//System.out.println("PSH_pay_amount:"+vo3.getPsh_Pay_Amount());
//System.out.println("PSH_checkin:"+vo3.getPsh_Checkin());
//System.out.println("PSH_pay:"+vo3.getPsh_Pay());
//System.out.println("PSH_order_stat:"+vo3.getPsh_Order_Stat());

	//find all
//	List<PS_Hotel_OrderVO> pshotelcolums = pshodao.getAll();
//	for (PS_Hotel_OrderVO pshotelcolum : pshotelcolums) {
//		System.out.print(pshotelcolum.getPs_Hotel_Order() + ", ");
//		System.out.print(pshotelcolum.getHotelVO().getHotel_Num() + ", ");
//		System.out.print(pshotelcolum.getMemberVO().getAccount() + "\n");
//	}
	
//delete
//PS_Hotel_OrderVO pshotelvo = new PS_Hotel_OrderVO();
//HotelVO hotelvo =new HotelVO();
//hotelvo.setHotel_Num("3");
////pshotelvo.setHotelVO(hotelvo);
//
//	pshodao.delete("H0078",hotelvo);
//	System.out.println("delete complete");
//	
		session.getTransaction().commit();
	} catch (HibernateException e) {
		session.getTransaction().rollback();
		e.printStackTrace();
	} finally {
		HibernateUtil.getSessionFactory().close();
	}
		
  }
}
