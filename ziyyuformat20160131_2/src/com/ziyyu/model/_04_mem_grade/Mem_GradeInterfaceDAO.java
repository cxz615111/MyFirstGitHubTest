package com.ziyyu.model._04_mem_grade;

import java.util.List;
import java.util.Set;

import com.ziyyu.model._01_member.MemberVO;

public interface Mem_GradeInterfaceDAO {
	
   public void insert(Mem_GradeVO mem_GradeVO);
   public void update(Mem_GradeVO mem_GradeVO);
   public void delete(String mem_Grade_Id);
   public Mem_GradeVO findByPrimaryKey(String mem_Grade_Id);
   public List<Mem_GradeVO> getAll();
   public Set<MemberVO> getMembersByMem_Grade_Id(String mem_Grade_Id);
}
