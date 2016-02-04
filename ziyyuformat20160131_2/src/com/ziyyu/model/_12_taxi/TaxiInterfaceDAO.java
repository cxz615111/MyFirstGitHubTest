package com.ziyyu.model._12_taxi;

import java.util.List;

public interface TaxiInterfaceDAO {
	public void insert(TaxiVO taxi);
	public void update(TaxiVO taxi);
	public void delete(String Taxi_Comp_Num);
	public TaxiVO findByPrimaryKey(String Taxi_Comp_Num);
	public List<TaxiVO> getAll();
}
