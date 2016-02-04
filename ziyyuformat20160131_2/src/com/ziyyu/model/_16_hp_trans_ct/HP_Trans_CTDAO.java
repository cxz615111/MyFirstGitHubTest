package com.ziyyu.model._16_hp_trans_ct;

import hibernate_configuration.HibernateUtil;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._10_hp_hotelri.HP_HotelRIVO;
import com.ziyyu.model._13_trans.TransVO;
import com.ziyyu.model._17_hp_ticket_ct.HP_Ticket_CTVO;
import com.ziyyu.model._19_hp_hotelri_ct.HP_HotelRI_CTVO;

public class HP_Trans_CTDAO implements HP_Trans_CTInterfaceDAO {
	private static Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	public static void main(String arg[]) {
		session.beginTransaction();

//		HP_Trans_CTInterfaceDAO a = new HP_Trans_CTDAO();
//
//		HPVO b = new HPVO();
//		b.setHp_Num("KAO5D");
//
//		TransVO c = new TransVO();
//		c.setTrans_Ticket_Num("1");
//
//		HP_Trans_CTVO d = new HP_Trans_CTVO();
//		d.setAmount(2);
//		d.setHpVO(b);
//		d.setTransVO(c);
//
//		a.insert(d);
		// --------------------------------------------------------------------------------------
//		 HP_Trans_CTInterfaceDAO a=new HP_Trans_CTDAO();
//		
//		 HPVO b=new HPVO();
//		 b.setHp_Num("KAO5D");
//		
//		 TransVO c=new TransVO();
//		 c.setTrans_Ticket_Num("1");
//		
//		
//		 HP_Trans_CTVO d=new HP_Trans_CTVO();
//		 d.setHpVO(b);
//		 d.setAmount(23);
//		 d.setTransVO(c);
//		
//		 a.update(d);
//		
//		

		// --------------------------------------------------------------------------------------
//		 HP_Trans_CTInterfaceDAO a=new HP_Trans_CTDAO();
//		
//		
//		 HPVO b=new HPVO();
//		 b.setHp_Num("TAI3D");
//		
//		 TransVO c =new TransVO();
//		 c.setTrans_Ticket_Num("3");
//		
//		 a.findByPrimaryKey(b,c);
		

		// ----------------------------------------------------------------------------------
//		 HP_Trans_CTInterfaceDAO a=new HP_Trans_CTDAO();
//		
//		 HPVO b =new HPVO();
//		 b.setHp_Num("KAO5D");
//		 TransVO c=new TransVO();
//		 c.setTrans_Ticket_Num("1");
//		 a.delete(b, c);

		//// ------------------------------------------------------------------------------------
//		 HP_Trans_CTInterfaceDAO a=new HP_Trans_CTDAO();
//		 List<HP_Trans_CTVO> cc=a.getAll();
//		 for(HP_Trans_CTVO b : cc){
//		 System.out.println(b.getHpVO().getHp_Num());
//		 System.out.println(b.getTransVO().getTrans_Ticket_Num());
//		 System.out.println(b.getAmount());
//		 System.out.println(b);
//		 }
		HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
	}

	@Override
	public void insert(HP_Trans_CTVO htc) {
		session.save(htc);
		return;

	}

	@Override
	public void update(HP_Trans_CTVO htc) {
		

		session.update(htc);
		return;
	}

	@Override
	public void delete(HPVO hpVO, TransVO transVO) {
		

		HP_Trans_CTVO d = new HP_Trans_CTVO();

		d.setHpVO(hpVO);
		d.setTransVO(transVO);
		HP_Trans_CTVO a = (HP_Trans_CTVO) session.get(HP_Trans_CTVO.class, d);
		session.delete(a);

		return;

	}

	@Override
	public HP_Trans_CTVO findByPrimaryKey(HPVO hpVO, TransVO transVO) {
		

		HP_Trans_CTVO a = new HP_Trans_CTVO();
		a.setHpVO(hpVO);
		a.setTransVO(transVO);

		HP_Trans_CTVO htc = (HP_Trans_CTVO) session.get(HP_Trans_CTVO.class, a);
		

		return htc;
	}

	@Override
	public List<HP_Trans_CTVO> getAll() {
		
		Query query = session.createQuery("from HP_Trans_CTVO order by HP_num");
		List<HP_Trans_CTVO> htcs = query.list();

		return htcs;
	}
	
	@Override
	public List<HP_Trans_CTVO> selectByHP_Num(String hp_Num) {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Query query=session.createQuery("from HP_Trans_CTVO where HP_num = ?");
		query.setParameter(0, hp_Num);	
		return (List<HP_Trans_CTVO>)query.list();
	}

}
