package com.ziyyu.model._03_dep_record;

import java.util.List;

public interface Dep_RecordInterfaceDAO {
	   public void insert(Dep_RecordVO dep_RecordVO);
	   public void update(Dep_RecordVO dep_RecordVO);
	   public void delete(String trans_Num);
	   public Dep_RecordVO findByPrimaryKey(String trans_Num);
	   public List<Dep_RecordVO> getAll();
	
}
