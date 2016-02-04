package com.ziyyu.model._01_member;

import java.util.List;
import java.util.Set;

import com.ziyyu.model._03_dep_record.Dep_RecordVO;
import com.ziyyu.model._05_article.ArticleVO;
import com.ziyyu.model._07_repost.RepostVO;
import com.ziyyu.model._20_hp_pur_order.HP_Pur_OrderVO;
import com.ziyyu.model._22_ps_air_ticket_order.PS_Air_Ticket_OrderVO;
import com.ziyyu.model._23_ps_hotel_order.PS_Hotel_OrderVO;



public interface MemberDAO_Interface {

    public void insert(MemberVO memberVO);
    public void update(MemberVO memberVO);
    public void delete(String account);
    public MemberVO findByPrimaryKey(String account);
    public List<MemberVO> getAll();
	public Set<PS_Hotel_OrderVO>  getPS_Hotel_OrdersByAccount(String account);
	public Set<HP_Pur_OrderVO>    getHP_Pur_OrdersBYAccount(String account);
	public Set<PS_Air_Ticket_OrderVO> getPS_Air_Ticket_OrdersByAccount(String account);
	public Set<Dep_RecordVO> getDep_RecordsByAccount(String account);
	public Set<ArticleVO> getArticlesByAccount(String account);
	public Set<RepostVO> getRepostsByAccount(String account);
}
