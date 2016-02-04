package com.ziyyu.model._25_airline;

import java.util.List;

public interface AirlineInterfaceDAO {
	
	public void insert(AirlineVO aln);
	public void update(AirlineVO aln);
	public void delete(String carrier_num);
	public AirlineVO findByPrimaryKey(String carrier_num);
	public List<AirlineVO> getAll();

}
