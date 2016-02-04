package com.ziyyu.model._16_hp_trans_ct;

import java.util.List;

import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._13_trans.TransVO;

public interface HP_Trans_CTInterfaceDAO {
	public void insert(HP_Trans_CTVO htc);
	public void update(HP_Trans_CTVO htc);	
	public void delete(HPVO hp_Num,TransVO trans_Ticket_Num);
	public HP_Trans_CTVO findByPrimaryKey(HPVO hp_Num,TransVO trans_Ticket_Num);
	public List<HP_Trans_CTVO> getAll();
    public List<HP_Trans_CTVO> selectByHP_Num(String hp_Num);
}
