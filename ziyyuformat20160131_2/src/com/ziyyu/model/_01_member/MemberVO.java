package com.ziyyu.model._01_member;

import java.util.HashSet;
import java.util.Set;

import com.ziyyu.model._02_nationality.NationalityVO;
import com.ziyyu.model._03_dep_record.Dep_RecordVO;
import com.ziyyu.model._04_mem_grade.Mem_GradeVO;
import com.ziyyu.model._05_article.ArticleVO;
import com.ziyyu.model._07_repost.RepostVO;
import com.ziyyu.model._20_hp_pur_order.HP_Pur_OrderVO;
import com.ziyyu.model._22_ps_air_ticket_order.PS_Air_Ticket_OrderVO;
import com.ziyyu.model._23_ps_hotel_order.PS_Hotel_OrderVO;

public class MemberVO implements java.io.Serializable{
	private String account;
	private String password;
	private String username; 
	private String email;
    private String person_Id;
    private String mob_Phone;
    private String passport_Num;
    private java.sql.Date expiry_Date;	
	private String 	name_En;	  	                               
	private NationalityVO  nationalityVO;                          
	private java.sql.Date birth;	  
	private String  gender;                                   
	private String 	address;                                 
	private String 	off_Phone;
	private String  home_Phone;
    private Integer income;
	private String edu_Level;
	private byte[] 	mem_Pic;
	private Mem_GradeVO   mem_GradeVO;
	private String 	mem_Auth;
	private Integer acc_Point;
	
	private Set<PS_Hotel_OrderVO> ps_Hotel_Orders=new HashSet<PS_Hotel_OrderVO>();
	private Set<HP_Pur_OrderVO> hp_Pur_Orders=new HashSet<HP_Pur_OrderVO>();
	private Set<PS_Air_Ticket_OrderVO> ps_Air_Ticket_Orders=new HashSet<PS_Air_Ticket_OrderVO>();
	private Set<Dep_RecordVO> dep_Records=new HashSet<Dep_RecordVO>();
	private Set<ArticleVO> articles=new HashSet<ArticleVO>();
	private Set<ArticleVO> reporter_Accounts=new HashSet<ArticleVO>();
	private Set<RepostVO> reposts=new HashSet<RepostVO>();
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPerson_Id() {
		return person_Id;
	}
	public void setPerson_Id(String person_Id) {
		this.person_Id = person_Id;
	}
	public String getMob_Phone() {
		return mob_Phone;
	}
	public void setMob_Phone(String mob_Phone) {
		this.mob_Phone = mob_Phone;
	}
	public String getPassport_Num() {
		return passport_Num;
	}
	public void setPassport_Num(String passport_Num) {
		this.passport_Num = passport_Num;
	}
	public java.sql.Date getExpiry_Date() {
		return expiry_Date;
	}
	public void setExpiry_Date(java.sql.Date expiry_Date) {
		this.expiry_Date = expiry_Date;
	}
	public String getName_En() {
		return name_En;
	}
	public void setName_En(String name_En) {
		this.name_En = name_En;
	}
	public NationalityVO getNationalityVO() {
		return nationalityVO;
	}
	public void setNationalityVO(NationalityVO nationalityVO) {
		this.nationalityVO = nationalityVO;
	}
	public java.sql.Date getBirth() {
		return birth;
	}
	public void setBirth(java.sql.Date birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOff_Phone() {
		return off_Phone;
	}
	public void setOff_Phone(String off_Phone) {
		this.off_Phone = off_Phone;
	}
	public String getHome_Phone() {
		return home_Phone;
	}
	public void setHome_Phone(String home_Phone) {
		this.home_Phone = home_Phone;
	}
	public Integer getIncome() {
		return income;
	}
	public void setIncome(Integer income) {
		this.income = income;
	}
	public String getEdu_Level() {
		return edu_Level;
	}
	public void setEdu_Level(String edu_Level) {
		this.edu_Level = edu_Level;
	}
	public byte[] getMem_Pic() {
		return mem_Pic;
	}
	public void setMem_Pic(byte[] mem_Pic) {
		this.mem_Pic = mem_Pic;
	}
	public Mem_GradeVO getMem_GradeVO() {
		return mem_GradeVO;
	}
	public void setMem_GradeVO(Mem_GradeVO mem_GradeVO) {
		this.mem_GradeVO = mem_GradeVO;
	}
	public String getMem_Auth() {
		return mem_Auth;
	}
	public void setMem_Auth(String mem_Auth) {
		this.mem_Auth = mem_Auth;
	}
	public Integer getAcc_Point() {
		return acc_Point;
	}
	public void setAcc_Point(Integer acc_Point) {
		this.acc_Point = acc_Point;
	}
	public Set<PS_Hotel_OrderVO> getPs_Hotel_Orders() {
		return ps_Hotel_Orders;
	}
	public void setPs_Hotel_Orders(Set<PS_Hotel_OrderVO> ps_Hotel_Orders) {
		this.ps_Hotel_Orders = ps_Hotel_Orders;
	}
	public Set<HP_Pur_OrderVO> getHp_Pur_Orders() {
		return hp_Pur_Orders;
	}
	public void setHp_Pur_Orders(Set<HP_Pur_OrderVO> hp_Pur_Orders) {
		this.hp_Pur_Orders = hp_Pur_Orders;
	}
	public Set<PS_Air_Ticket_OrderVO> getPs_Air_Ticket_Orders() {
		return ps_Air_Ticket_Orders;
	}
	public void setPs_Air_Ticket_Orders(
			Set<PS_Air_Ticket_OrderVO> ps_Air_Ticket_Orders) {
		this.ps_Air_Ticket_Orders = ps_Air_Ticket_Orders;
	}
	public Set<Dep_RecordVO> getDep_Records() {
		return dep_Records;
	}
	public void setDep_Records(Set<Dep_RecordVO> dep_Records) {
		this.dep_Records = dep_Records;
	}
	public Set<ArticleVO> getArticles() {
		return articles;
	}
	public void setArticles(Set<ArticleVO> articles) {
		this.articles = articles;
	}
	public Set<ArticleVO> getReporter_Accounts() {
		return reporter_Accounts;
	}
	public void setReporter_Accounts(Set<ArticleVO> reporter_Accounts) {
		this.reporter_Accounts = reporter_Accounts;
	}
	public Set<RepostVO> getReposts() {
		return reposts;
	}
	public void setReposts(Set<RepostVO> reposts) {
		this.reposts = reposts;
	}
	
	
	

	

	
}
