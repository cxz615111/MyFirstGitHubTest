package com.ziyyu.model.service._04_hp;

import java.util.List;
import java.util.Map;

import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._21_hp_trav_info.HP_Trav_InfoVO;

public interface HPInterfaceService {

	public abstract int insertHP(List<HPVO> hpVOs) throws Throwable;

	public abstract boolean judgeMemberAuthority(String memberAccount);

	public abstract boolean judgeMemberPoint(String memberAccount,
			String hp_Name);

	public abstract boolean buyHP(String hpName, MemberVO member,
			List<HP_Trav_InfoVO> htiVOs);

	public abstract Map<String, Object> selectHPsByCondition(
			Integer numberOfPeople, String keyWord_En, String keyWord_zh,
			String hp_Air_Num);

	public abstract Map<String, Object> selectHPByPK(String hp_Num);

}