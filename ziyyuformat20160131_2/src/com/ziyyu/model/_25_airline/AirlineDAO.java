package com.ziyyu.model._25_airline;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ziyyu.model._07_repost.RepostDAO;
import com.ziyyu.model._09_hp_air_ticket.HP_Air_TicketVO;
import com.ziyyu.model._12_taxi.TaxiVO;
import com.ziyyu.model._18_hp_easy_ct.HP_Easy_CTVO;

import hibernate_configuration.HibernateUtil;

public class AirlineDAO implements AirlineInterfaceDAO {

	@Override
	public void insert(AirlineVO aln) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.save(aln);
		return;
	}

	@Override
	public void update(AirlineVO aln) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.update(aln);
		return;
	}

	@Override
	public void delete(String carrier_num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		AirlineVO aln = (AirlineVO) session.get(AirlineVO.class, carrier_num);
		session.delete(aln);
		return;
	 	
	 
	}

	@Override
	public AirlineVO findByPrimaryKey(String carrier_num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		AirlineVO aln = (AirlineVO) session.get(AirlineVO.class, carrier_num);

		return aln;
	}

	@Override
	public List<AirlineVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		// session.beginTransaction();
		Query query = session.createQuery("from AirlineVO order by carrier_num");

		List<AirlineVO> alns = query.list();

		return alns;

	}

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		AirlineDAO dao = new AirlineDAO();

		// insert
//		 AirlineVO vo = new AirlineVO();
//		 vo.setCarrier_Num("006");
//		 vo.setAir_Name_Zh("猴子航空");
//		 vo.setAir_Name_En("Monkey Airlines");
//		 vo.setAir_Fax("07-2388-5266~4");
//		 vo.setAir_Tel("02-4120-9001");
//		 vo.setAir_Address("台北市忠孝東路三段2號");
//		 dao.insert(vo);

		// update
//		 AirlineVO vo2 = new AirlineVO();
//		
//		 vo2.setCarrier_Num("006");
//		 vo2.setAir_Name_Zh("猴子航空");
//		 vo2.setAir_Name_En("Monkey Airlines");
//		 vo2.setAir_Fax("07-2388-5266~5");
//		 vo2.setAir_Tel("02-4120-9002");
//		 vo2.setAir_Address("台北市忠孝東路三段2號");
//		 dao.insert(vo2);

		// find by primary key
//		AirlineVO vo3 = dao.findByPrimaryKey("006");
//		System.out.println(vo3.getCarrier_Num());
//		System.out.println(vo3.getAir_Name_Zh());

		// find all
//		 List<AirlineVO> hecs = dao.getAll();
//		 for (AirlineVO hec : hecs) {
//		 System.out.print(hec.getCarrier_Num() + ", ");
//		
//		 }

		// delete
//		 dao.delete("006");
			tx.commit();
	}
}