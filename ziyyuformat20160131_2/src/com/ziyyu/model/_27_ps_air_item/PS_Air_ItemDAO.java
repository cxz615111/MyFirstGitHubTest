package com.ziyyu.model._27_ps_air_item;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ziyyu.model._09_hp_air_ticket.HP_Air_TicketVO;
import com.ziyyu.model._26_ps_hotel_item.PS_Hotel_ItemVO;

import hibernate_configuration.HibernateUtil;

public class PS_Air_ItemDAO implements PS_Air_ItemInterfaceDAO {

	@Override
	public void insert(PS_Air_ItemVO pai) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.save(pai);
		return;
	}

	@Override
	public void update(PS_Air_ItemVO pai) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.update(pai);
		return;
	}

	@Override
	public void delete(String ps_Air_Item) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		PS_Air_ItemVO pai = (PS_Air_ItemVO) session.get(PS_Air_ItemVO.class, ps_Air_Item);
		session.delete(pai);
		return;
	}

	@Override
	public PS_Air_ItemVO findByPrimaryKey(String ps_Air_Item) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		PS_Air_ItemVO pai = (PS_Air_ItemVO) session.get(PS_Air_ItemVO.class, ps_Air_Item);

		return pai;
	}

	@Override
	public List<PS_Air_ItemVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Query query = session.createQuery("from PS_Air_ItemVO order by ps_Air_Item");
		List<PS_Air_ItemVO> pais = query.list();

		return pais;

	}

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		PS_Air_ItemDAO dao = new PS_Air_ItemDAO();
		com.ziyyu.model._25_airline.AirlineVO avo = new com.ziyyu.model._25_airline.AirlineVO();
		avo.setCarrier_Num("004");
		// insert
		// PS_Air_ItemVO vo=new PS_Air_ItemVO();
		// vo.setPs_Air_Item("5");
		// vo.setAirlineVO(avo);
		// vo.setPs_Air_Class("貨艙");
		// dao.insert(vo);

		// update
		// PS_Air_ItemVO vo2 = new PS_Air_ItemVO();
		// vo2.setPs_Air_Item("5");
		// vo2.setAirlineVO(avo);
		// vo2.setPs_Air_Class("機艙");
		// dao.update(vo2);
		//
		// //find by primary key
		// PS_Air_ItemVO vo3 = dao.findByPrimaryKey("5");
		// System.out.println("PS_air_item:"+vo3.getPs_Air_Item());
		// System.out.println("carrier_num:"+vo3.getAirlineVO());
		// System.out.println("PS_air_class:"+vo3.getPs_Air_Class());

		// //find all
		 List<PS_Air_ItemVO> pais = dao.getAll();
		 for (PS_Air_ItemVO pai : pais) {
		 System.out.print(pai.getPs_Air_Item() + ", ");
		 System.out.print(pai.getAirlineVO() + ", ");
		 System.out.print(pai.getPs_Air_Class() + "\n");
		 }
		//
		// //delete
//		dao.delete("5");
		tx.commit();
	}
}