package com.ziyyu.model._08_hp;

import hibernate_configuration.HibernateUtil;

import java.util.List;

import oracle.net.aso.q;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HPDAO implements HPInterfaceDAO {

	@Override
	public void insert(HPVO hp) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.save(hp);
		return;
	}

	@Override
	public void delete(String hp_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		HPVO hp = (HPVO) session.get(HPVO.class, hp_Num);
		session.delete(hp);
		return;
	}

	@Override
	public void update(HPVO hp) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.update(hp);
		session.getTransaction().commit();

		return;
	}

	@Override
	public HPVO findByPrimaryKey(String hp_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		HPVO hp = (HPVO) session.get(HPVO.class, hp_Num);
		return hp;

	}

	@Override
	public List<HPVO> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session.createQuery("from HPVO order by deptno");
		List<HPVO> hps = query.list();
		return hps;
	}
	
	@Override
	public List<HPVO> selectHPByCondition(Integer numberOfPeople,String keyWord_En ,String keyWord_zh,String hp_Air_Num) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		String sql="select * from HP ";
		int i=0;
		if(numberOfPeople !=null && numberOfPeople.intValue()>0){
            sql=sql+"where HP_air_amount = "+ numberOfPeople.intValue();
            i++;
		}
		if (keyWord_En !=null && keyWord_En.trim().length() !=0){
			if(i==0){
			    sql=sql+"where HP_name_en = "+ keyWord_En;
			}else{
				sql=sql+" and HP_name_en like '%"+ keyWord_En+"%' ";
			}
		}
		if (keyWord_zh !=null && keyWord_zh.trim().length() !=0){
			if(i==0){
			    sql=sql+"where HP_name_zh = "+ keyWord_zh;
			}else{
				sql=sql+" and HP_name_zh like '%"+ keyWord_zh+"%' ";
			}
		}
		if (hp_Air_Num !=null && hp_Air_Num.trim().length() !=0){
			if(i==0){
			    sql=sql+"where HP_air_num = "+ hp_Air_Num;
			}else{
				sql=sql+" and HP_air_num like '%"+ hp_Air_Num+"%' ";
			}
		}
		
		return (List<HPVO>)session.createSQLQuery(sql).addEntity(HPVO.class).list();

	}
	
	
//	public static void main(String args[]){
//		HPDAO d=new HPDAO();
//		
//		try {
//			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
//			for(HPVO hp:d.selectHPByCondition(5, "" ,"台北","A001")){
//            System.out.println(hp.getHp_Name_Zh());
//			}
//			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
//		} catch (HibernateException e) {
//			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().rollback();
//			e.printStackTrace();
//		}
//		
//	}
	
	
}


