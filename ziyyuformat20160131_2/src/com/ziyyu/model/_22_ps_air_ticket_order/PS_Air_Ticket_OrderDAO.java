package com.ziyyu.model._22_ps_air_ticket_order;

import hibernate_configuration.HibernateUtil;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._25_airline.AirlineVO;

public class PS_Air_Ticket_OrderDAO implements PS_Air_Ticket_OrderInterfaceDAO {

	@Override
	public void insert(PS_Air_Ticket_OrderVO pato) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.save(pato);

	}

	@Override
	public void delete(String ps_Air_Order, AirlineVO airlineVO) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		// PS_Air_Ticket_OrderVO pato = (PS_Air_Ticket_OrderVO)
		// session.get(PS_Air_Ticket_OrderVO.class, airlineVO);

		PS_Air_Ticket_OrderVO pato = new PS_Air_Ticket_OrderVO();
		pato.setPs_Air_Order(ps_Air_Order);
		pato.setAirlineVO(airlineVO);
		PS_Air_Ticket_OrderVO patoVO = (PS_Air_Ticket_OrderVO) session.get(
				PS_Air_Ticket_OrderVO.class, pato);

		session.delete(patoVO);
	}

	@Override
	public void update(PS_Air_Ticket_OrderVO pato) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.update(pato);
	}

	@Override
	public PS_Air_Ticket_OrderVO findByPrimaryKey(String ps_Air_Order,
			AirlineVO airlineVO) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		PS_Air_Ticket_OrderVO pato = new PS_Air_Ticket_OrderVO();
		pato.setPs_Air_Order(ps_Air_Order);
		pato.setAirlineVO(airlineVO);
		return (PS_Air_Ticket_OrderVO) session.get(PS_Air_Ticket_OrderVO.class,
				pato);
	}

	@Override
	public List<PS_Air_Ticket_OrderVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session
				.createQuery("from PS_Air_Ticket_OrderVO order by ps_Air_Order,airlineVO");
		List<PS_Air_Ticket_OrderVO> patos = query.list();
		return patos;
	}

	public static void main(String[] args) {
		PS_Air_Ticket_OrderDAO psatodao = new PS_Air_Ticket_OrderDAO();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			// insert
//			PS_Air_Ticket_OrderVO patovo = new PS_Air_Ticket_OrderVO();
//			patovo.setPs_Air_Order("tn24680");
//
//			AirlineVO airlinevo = new AirlineVO();
//			airlinevo.setCarrier_Num("005");
//			patovo.setAirlineVO(airlinevo);
//
//			MemberVO membervo = new MemberVO();
//			membervo.setAccount("acca01");
//			patovo.setMemberVO(membervo);
//
//			patovo.setPsa_Price(10000);
//
//			patovo.setPsa_Flight("H308");
//			patovo.setPsa_Order_Stat("D");
//
//			long hms = new java.util.Date().getTime();
//			patovo.setPsa_Pay_Date(new Timestamp(hms));
//
//			patovo.setPsa_Pay_Amount(1);

//			psatodao.insert(patovo);
			
		
//		 //update
//		 PS_Air_Ticket_OrderVO patovo = new PS_Air_Ticket_OrderVO();
//		 patovo.setPs_Air_Order("tn24680");
//		
//		 AirlineVO airlinevo =new AirlineVO();
//		 airlinevo.setCarrier_Num("004");
//		 patovo.setAirlineVO(airlinevo);
//		
//		 MemberVO membervo = new MemberVO();
//		 membervo.setAccount("acca01");
//		 patovo.setMemberVO(membervo);
//		
//		 patovo.setPsa_Price(20000);
//		
//		 patovo.setPsa_Flight("H308");
//		 patovo.setPsa_Order_Stat("D");
//		
//		 long hms=new java.util.Date().getTime();
//		 patovo.setPsa_Pay_Date(new Timestamp(hms));
//		
//		 patovo.setPsa_Pay_Amount(3);
//		
//		 psatodao.update(patovo);

//		// find by primary key
//		 AirlineVO airlinevo =new AirlineVO();
//		 airlinevo.setCarrier_Num("004");
//		
//		 PS_Air_Ticket_OrderVO vo3 =
//		 psatodao.findByPrimaryKey("tn24680",airlinevo);
//		 System.out.println("ps_Air_Order:"+vo3.getPs_Air_Order());
//		 System.out.println("carrier_Num:"+vo3.getAirlineVO().getCarrier_Num());
//		 System.out.println("account:"+vo3.getMemberVO().getAccount());
//		 System.out.println("psa_Price:"+vo3.getPsa_Price());
//		 System.out.println("psa_Flight:"+vo3.getPsa_Flight());
//		 System.out.println("psa_Order_Stat:"+vo3.getPsa_Order_Stat());
//		 System.out.println("psa_Pay_Date:"+vo3.getPsa_Pay_Date());
//		 System.out.println("psa_Pay_Amount:"+vo3.getPsa_Pay_Amount());

		// find all
//		 List<PS_Air_Ticket_OrderVO> psatocolums = psatodao.getAll();
//		 for (PS_Air_Ticket_OrderVO psatocolum : psatocolums) {
//		 System.out.print(psatocolum.getPs_Air_Order() + ", ");
//		 System.out.print(psatocolum.getAirlineVO().getCarrier_Num() + ", ");
//		 System.out.print(psatocolum.getMemberVO().getAccount() + "\n");
//		 }

		// delete
//		 PS_Air_Ticket_OrderVO vo4 = new PS_Air_Ticket_OrderVO();
//		 AirlineVO airlinevo =new AirlineVO();
//		 airlinevo.setCarrier_Num("004");
//		 vo4.setAirlineVO(airlinevo);
//		
//		 psatodao.delete("tn24680",airlinevo);
//		 System.out.println("delete complete" );
			
			
			
			session.getTransaction().commit();
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateUtil.getSessionFactory().close();
		}

	}
}
