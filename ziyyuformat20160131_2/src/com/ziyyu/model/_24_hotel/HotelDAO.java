package com.ziyyu.model._24_hotel;

import hibernate_configuration.HibernateUtil;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.ziyyu.model._22_ps_air_ticket_order.PS_Air_Ticket_OrderVO;

public class HotelDAO implements HotelInterfaceDAO {

	@Override
	public void insert(HotelVO hotel) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();	
			session.save(hotel);
	}

	@Override
	public void delete(String hotel_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
			HotelVO hotel = (HotelVO) session.get(HotelVO.class, hotel_Num);
			
			session.delete(hotel);
	
	}

	@Override
	public void update(HotelVO hotel) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
			session.update(hotel);
	}

	@Override
	public HotelVO findByPrimaryKey(String hotel_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		HotelVO hotel = new HotelVO();
		return (HotelVO) session.get(HotelVO.class,
				hotel_Num);
	}

	@Override
	public List<HotelVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session.createQuery("from HotelVO order by hotel_Num");
		List<HotelVO> hotels = query.list();
		return hotels;
	}
		
	public static void main(String[] args) {
	HotelDAO dao = new HotelDAO();
	
	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	try {
		session.beginTransaction();
//	// insert
//	HotelVO hotelvo = new HotelVO();
//	hotelvo.setHotel_Num("4");
//	hotelvo.setHotel_Loc("台灣新北市做好做滿1號");
//	hotelvo.setHotel_Name_Zh("國民黨黨部酒店");
//	hotelvo.setHotel_Name_En("KMThotel");
//	hotelvo.setHotel_Type("");
//	hotelvo.setHotel_Tel("08006666");
//	hotelvo.setHotel_Star("5");
//	hotelvo.setHotel_Fax("135679");
//	hotelvo.setChecktime("入住：下午2點後，退房：早上11點前");
//	hotelvo.setHotel_Info("");
//	hotelvo.setRoom_Pref("免費停車、門房服務、精通多國語言服務人員、自助式洗衣服務");
//
//	dao.insert(hotelvo);
	
//  //update
//	HotelVO hotelvo = new HotelVO();
//	hotelvo.setHotel_Num("4");
//	hotelvo.setHotel_Loc("做好做滿1號");
//	hotelvo.setHotel_Name_Zh("國民黨酒店");
//	hotelvo.setHotel_Name_En("KMT");
//	hotelvo.setHotel_Type("");
//	hotelvo.setHotel_Tel("0800");
//	hotelvo.setHotel_Star("5");
//	hotelvo.setHotel_Fax("135");
//	hotelvo.setChecktime("入住：下午2點後，退房：早上11點前");
//	hotelvo.setHotel_Info("");
//	hotelvo.setRoom_Pref("免費停車、門房服務、精通多國語言服務人員、自助式洗衣服務");
//
//	dao.update(hotelvo);        

//	//find by primary key
//	HotelVO vo3 = dao.findByPrimaryKey("4");
//	System.out.println("hotel_Num:"+vo3.getHotel_Num());
//	System.out.println("hotel_Loc:"+vo3.getHotel_Loc());
//	System.out.println("hotel_Name_Zh:"+vo3.getHotel_Name_Zh());
//	System.out.println("hotel_Name_En:"+vo3.getHotel_Name_En());
//	System.out.println("hotel_Type:"+vo3.getHotel_Type());
//	System.out.println("hotel_Tel:"+vo3.getHotel_Tel());
//	System.out.println("hotel_Star:"+vo3.getHotel_Star());
//	System.out.println("hotel_Fax:"+vo3.getHotel_Fax());
//	System.out.println("checktime:"+vo3.getChecktime());
//	System.out.println("hotel_Info:"+vo3.getHotel_Info());
//	System.out.println("room_Pref:"+vo3.getRoom_Pref());
	
//	//find all
//	List<HotelVO> hotelcolums = dao.getAll();
//	for (HotelVO hotelcolum : hotelcolums) {
//		System.out.print(hotelcolum.getHotel_Num() + ", ");
//		System.out.print(hotelcolum.getHotel_Loc() + ", ");
//		System.out.print(hotelcolum.getHotel_Name_Zh() + "\n");
//	}		
	
//	//delete
//	dao.delete("4");
//	System.out.println("delete complete" );


		session.getTransaction().commit();
	} catch (HibernateException e) {
		session.getTransaction().rollback();
		e.printStackTrace();
	} finally {
		HibernateUtil.getSessionFactory().close();
	}

}

}
