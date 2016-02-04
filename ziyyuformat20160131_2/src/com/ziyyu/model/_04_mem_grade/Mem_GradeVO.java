package com.ziyyu.model._04_mem_grade;

import java.util.HashSet;
import java.util.Set;

import com.ziyyu.model._01_member.MemberVO;

public class Mem_GradeVO implements java.io.Serializable{
    private String mem_Grade_Id;
	private String mem_Grade_Name; 	
	private Set<MemberVO> members=new HashSet<MemberVO>();
	
	public String getMem_Grade_Id() {
		return mem_Grade_Id;
	}
	public void setMem_Grade_Id(String mem_Grade_Id) {
		this.mem_Grade_Id = mem_Grade_Id;
	}
	public String getMem_Grade_Name() {
		return mem_Grade_Name;
	}
	public void setMem_Grade_Name(String mem_Grade_Name) {
		this.mem_Grade_Name = mem_Grade_Name;
	}
	public Set<MemberVO> getMembers() {
		return members;
	}
	public void setMembers(Set<MemberVO> members) {
		this.members = members;
	}	
	
	
}
