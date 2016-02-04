package com.ziyyu.model._02_nationality;

import java.util.HashSet;
import java.util.Set;

import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._21_hp_trav_info.HP_Trav_InfoVO;

public class NationalityVO implements java.io.Serializable{
    private String code;
	private String country;	
	private String state;
	
	private Set<HP_Trav_InfoVO> hp_Trav_Infos=new  HashSet<HP_Trav_InfoVO>();
	private Set<MemberVO> members=new  HashSet<MemberVO>();
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Set<HP_Trav_InfoVO> getHp_Trav_Infos() {
		return hp_Trav_Infos;
	}
	public void setHp_Trav_Infos(Set<HP_Trav_InfoVO> hp_Trav_Infos) {
		this.hp_Trav_Infos = hp_Trav_Infos;
	}
	public Set<MemberVO> getMembers() {
		return members;
	}
	public void setMembers(Set<MemberVO> members) {
		this.members = members;
	}

	
	
}
