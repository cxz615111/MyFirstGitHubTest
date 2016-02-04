package com.ziyyu.model._02_nationality;

import java.util.List;
import java.util.Set;

import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._21_hp_trav_info.HP_Trav_InfoVO;

public interface NationalityInterfaceDAO {
   
    public void insert(NationalityVO nationalityVO);
    public void update(NationalityVO nationalityVO);
    public void delete(String code);
    public NationalityVO findByPrimaryKey(String code);
    public List<NationalityVO> getAll();
	public Set<HP_Trav_InfoVO>  getHP_Trav_InfosByCode(String code);
	public Set<MemberVO>  getMembersByCode(String code);
	
}
