package com.ziyyu.model.service._04_hp;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ziyyu.model._01_member.MemberDAO;
import com.ziyyu.model._01_member.MemberDAO_Interface;
import com.ziyyu.model._01_member.MemberVO;
import com.ziyyu.model._08_hp.HPDAO;
import com.ziyyu.model._08_hp.HPInterfaceDAO;
import com.ziyyu.model._08_hp.HPVO;
import com.ziyyu.model._09_hp_air_ticket.HP_Air_TicketDAO;
import com.ziyyu.model._09_hp_air_ticket.HP_Air_TicketInterfaceDAO;
import com.ziyyu.model._09_hp_air_ticket.HP_Air_TicketVO;
import com.ziyyu.model._10_hp_hotelri.HP_HotelRIDAO;
import com.ziyyu.model._10_hp_hotelri.HP_HotelRIInterfaceDAO;
import com.ziyyu.model._10_hp_hotelri.HP_HotelRIVO;
import com.ziyyu.model._11_scard.ScardDAO;
import com.ziyyu.model._11_scard.ScardInterfaceDAO;
import com.ziyyu.model._11_scard.ScardVO;
import com.ziyyu.model._12_taxi.TaxiDAO;
import com.ziyyu.model._12_taxi.TaxiInterfaceDAO;
import com.ziyyu.model._13_trans.TransDAO;
import com.ziyyu.model._13_trans.TransInterfaceDAO;
import com.ziyyu.model._13_trans.TransVO;
import com.ziyyu.model._14_ticket.TicketDAO;
import com.ziyyu.model._14_ticket.TicketInterfaceDAO;
import com.ziyyu.model._14_ticket.TicketVO;
import com.ziyyu.model._15_ecard.EcardDAO;
import com.ziyyu.model._15_ecard.EcardInterfaceDAO;
import com.ziyyu.model._15_ecard.EcardVO;
import com.ziyyu.model._16_hp_trans_ct.HP_Trans_CTDAO;
import com.ziyyu.model._16_hp_trans_ct.HP_Trans_CTInterfaceDAO;
import com.ziyyu.model._16_hp_trans_ct.HP_Trans_CTVO;
import com.ziyyu.model._17_hp_ticket_ct.HP_Ticket_CTDAO;
import com.ziyyu.model._17_hp_ticket_ct.HP_Ticket_CTInterfaceDAO;
import com.ziyyu.model._17_hp_ticket_ct.HP_Ticket_CTVO;
import com.ziyyu.model._18_hp_easy_ct.HP_Easy_CTDAO;
import com.ziyyu.model._18_hp_easy_ct.HP_Easy_CTInterfaceDAO;
import com.ziyyu.model._18_hp_easy_ct.HP_Easy_CTVO;
import com.ziyyu.model._19_hp_hotelri_ct.HP_HotelRI_CTDAO;
import com.ziyyu.model._19_hp_hotelri_ct.HP_HotelRI_CTInterfaceDAO;
import com.ziyyu.model._19_hp_hotelri_ct.HP_HotelRI_CTVO;
import com.ziyyu.model._20_hp_pur_order.HP_Pur_OrderDAO;
import com.ziyyu.model._20_hp_pur_order.HP_Pur_OrderInterfaceDAO;
import com.ziyyu.model._20_hp_pur_order.HP_Pur_OrderVO;
import com.ziyyu.model._21_hp_trav_info.HP_Trav_InfoDAO;
import com.ziyyu.model._21_hp_trav_info.HP_Trav_InfoInterfaceDAO;
import com.ziyyu.model._21_hp_trav_info.HP_Trav_InfoVO;

public class HPService implements HPInterfaceService {
	private HPInterfaceDAO hpDAO = new HPDAO();
	private HP_Air_TicketInterfaceDAO hatDAO = new HP_Air_TicketDAO();
	private ScardInterfaceDAO scDAO = new ScardDAO();
	private TransInterfaceDAO tDAO = new TransDAO();
	private TicketInterfaceDAO ticketDAO = new TicketDAO();
	private EcardInterfaceDAO eDAO = new EcardDAO();
	private HP_HotelRIInterfaceDAO hhDAO = new HP_HotelRIDAO();
	private MemberDAO_Interface memberDAO = new MemberDAO();
	private HP_Pur_OrderInterfaceDAO hpoDAO = new HP_Pur_OrderDAO();
	private HP_Trav_InfoInterfaceDAO htiDAO = new HP_Trav_InfoDAO();
	private HP_HotelRI_CTInterfaceDAO hhcDAO = new HP_HotelRI_CTDAO();
	private HP_Ticket_CTInterfaceDAO htcDAO=new HP_Ticket_CTDAO();
	private HP_Trans_CTInterfaceDAO hTranscDAO=new HP_Trans_CTDAO();
	private TaxiInterfaceDAO taxiDAO = new TaxiDAO();
	private HP_Easy_CTInterfaceDAO hecDAO = new HP_Easy_CTDAO();

	
	@Override
	public int insertHP(List<HPVO> hpVOs) throws Throwable {

		for (HPVO hp : hpVOs) {
			HP_Air_TicketVO hatVO = hatDAO.findByPrimaryKey(hp
					.getHp_Air_Ticket().getHp_Air_Num());
			int i = hatVO.getHp_Air_Inv() - hp.getHp_Air_Amount()
					* hp.getHp_Inv();
			if (i >= 0) {
				hatVO.setHp_Air_Inv(i);
				hatDAO.update(hatVO);
			} else {
				System.out.println(hatVO.getHp_Air_Num() + "HP_Air_TicketVO不足");
				throw new Throwable();
			}

			ScardVO scVO = scDAO.findByPrimaryKey(hp.getScard()
					.getHp_Scard_Num());
			i = scVO.getScard_Inv() - hp.getHp_Scard_Amount() * hp.getHp_Inv();
			if (i >= 0) {
				scVO.setScard_Inv(i);
				scDAO.update(scVO);
			} else {
				System.out.println(scVO.getHp_Scard_Num() + "ScardVO不足");
				throw new Throwable();
			}

			for (HP_Trans_CTVO htcVO : hp.getHp_Trans_CtVOs()) {
				TransVO tVO = tDAO.findByPrimaryKey(htcVO.getTransVO()
						.getTrans_Ticket_Num());
				i = tVO.getTrans_Inv() - htcVO.getAmount() * hp.getHp_Inv();
				if (i >= 0) {
					tVO.setTrans_Inv(i);
					tDAO.update(tVO);
				} else {
					System.out.println(tVO.getTrans_Ticket_Num() + "TransVO不足");
					throw new Throwable();
				}
			}

			for (HP_Ticket_CTVO hTicketVO : hp.getHp_Ticket_CtVOs()) {
				TicketVO ticketVO = ticketDAO.findByPrimaryKey(hTicketVO
						.getTicket().getTicket_Num());
				i = ticketVO.getTicket_Inv() - hTicketVO.getAmount()
						* hp.getHp_Inv();
				if (i >= 0) {
					ticketVO.setTicket_Inv(i);
					ticketDAO.update(ticketVO);
				} else {
					System.out.println(ticketVO.getTicket_Num() + "TicketVO不足");
					throw new Throwable();
				}
			}

			for (HP_Easy_CTVO hecVO : hp.getHp_Easy_CtVOs()) {
				EcardVO eVO = eDAO.findByPrimaryKey(hecVO.getEcard()
						.getEcard_Num());
				i = eVO.getEcard_Inv() - hecVO.getAmount() * hp.getHp_Inv();
				if (i >= 0) {
					eVO.setEcard_Inv(i);
					eDAO.update(eVO);
				} else {
					System.out.println(eVO.getEcard_Num() + "EcardVO不足");
					throw new Throwable();
				}
			}

			for (HP_HotelRI_CTVO hhcVO : hp.getHp_Hotelri_CtVOs()) {
				HP_HotelRIVO hhVO = hhDAO.findByPrimaryKey(hhcVO
						.getHp_Hotel_Ri().getRoom_Name());
				i = hhVO.getRoom_Num() - hhcVO.getAmount() * hp.getHp_Inv();
				if (i >= 0) {
					hhVO.setRoom_Num(i);
					hhDAO.update(hhVO);
				} else {
					System.out.println(hhVO.getHp_HotelRI_Num() + "房間不足");
					throw new Throwable();
				}
			}

			hpDAO.insert(hp);
		}

		return hpVOs.size();
	}

	
	@Override
	public boolean judgeMemberAuthority(String memberAccount) {
		MemberVO memberData = memberDAO.findByPrimaryKey(memberAccount);
		if (memberData != null && memberData.getMem_Auth().trim() != "A"
				&& memberData.getMem_Auth().trim() != "D") {
			return true;
		} else {
			return false;
		}
	}

	
	@Override
	public boolean judgeMemberPoint(String memberAccount, String hp_Name) {
		MemberVO memberData = memberDAO.findByPrimaryKey(memberAccount);
		HPVO hpData = hpDAO.findByPrimaryKey(hp_Name);
		if (hpData.getHp_Price() <= memberData.getAcc_Point()) {
			return true;
		}
		return false;
	}

	
	@Override
	public boolean buyHP(String hpName, MemberVO member,
			List<HP_Trav_InfoVO> htiVOs) {
		MemberVO memberData = memberDAO.findByPrimaryKey(member.getAccount());
		HPVO hpData = hpDAO.findByPrimaryKey(hpName);
		if (hpData.getHp_Inv() >= 1) {
			// 更新專案庫存
			hpData.setHp_Inv(hpData.getHp_Inv() - 1);
			hpDAO.update(hpData);

			// 儲存會員資料，並且扣除點數
			memberData.setAcc_Point(memberData.getAcc_Point()
					- hpData.getHp_Price());
			memberData.setEmail(member.getEmail());
			memberData.setPerson_Id(member.getPerson_Id());
			memberData.setMob_Phone(member.getMob_Phone());
			memberData.setOff_Phone(member.getOff_Phone());
			memberData.setExpiry_Date(member.getExpiry_Date());
			memberData.setName_En(member.getName_En());
			memberData.setNationalityVO(member.getNationalityVO());
			memberData.setBirth(member.getBirth());
			memberData.setGender(member.getGender());
			memberData.setAddress(member.getAddress());
			memberDAO.update(memberData);

			// 新增套裝明細
			HP_Pur_OrderVO hpoVO = new HP_Pur_OrderVO();
			hpoVO.setPay_Detail_Num(member.getAccount() + new java.util.Date());
			hpoVO.setHpVO(hpData);
			hpoVO.setMemberVO(memberData);
			hpoVO.setPay_Amount(1);
			hpoVO.setPay_Date(new Timestamp(new java.util.Date().getTime()));
			hpoVO.setDetail_Stat("Y");
			hpoDAO.insert(hpoVO);

			// 新增旅客資訊
			for (HP_Trav_InfoVO htiVO : htiVOs) {
				htiDAO.insert(htiVO);
			}
			return true;
		}
		return false;
	}
	
	
	
	//用條件查詢專案(含專案+機票)
	
	@Override
	public Map<String ,Object> selectHPsByCondition(Integer numberOfPeople,String keyWord_En ,String keyWord_zh,String hp_Air_Num){
		List<HPVO> hpsList=hpDAO.selectHPByCondition(numberOfPeople, keyWord_En, keyWord_zh, hp_Air_Num);
		if(hpsList ==null || hpsList.isEmpty()){
			return null;
		}
		
		Map<String ,HP_Air_TicketVO> hatsMap = new HashMap<String, HP_Air_TicketVO>();
		Map<String ,Object> hpInformation=new HashMap<>();
        for(HPVO hp :hpsList){
        	hatsMap.put(hp.getHp_Num(),hatDAO.findByPrimaryKey(hp.getHp_Air_Ticket().getHp_Air_Num()));
		}
		hpInformation.put("hps",hpsList);
		hpInformation.put("hats", hatsMap);

		return hpInformation ;
	}
	
	
	//查詢單筆專案(全部資訊)
	
	@Override
	public Map<String ,Object> selectHPByPK(String hp_Num){
		Map<String ,Object> hpMap =null;
		List<HP_HotelRIVO> hhList = null;
		List<TicketVO> ticketList = null;
		List<TransVO> transList =null;
		List<EcardVO> eList =null;
		
		HPVO hp=hpDAO.findByPrimaryKey(hp_Num);
		if(hp == null){
			return null;
		}
		hpMap=new HashMap<>();//儲存所有有關該HP資訊
		hpMap.put("HP_Air_Ticket", hatDAO.findByPrimaryKey(hp.getHp_Air_Ticket().getHp_Air_Num()));
		
		List<HP_HotelRI_CTVO> hhcsList =hhcDAO.selectByHP_Num(hp_Num);
		hpMap.put("HP_HotelRI_CTList", hhcsList);//房型對照表
	    
		hhList=new ArrayList<>();
		for(HP_HotelRI_CTVO hhc:hhcsList){
			hhList.add(hhDAO.findByPrimaryKey((hhc.getHp_Hotel_Ri().getHp_HotelRI_Num())));
		}
		hpMap.put("HP_HotelRIList",hhList);//房型
		
		hpMap.put("Scard",scDAO.findByPrimaryKey((hp.getScard().getHp_Scard_Num())));//手機網卡
		
		hpMap.put("Taxi", taxiDAO.findByPrimaryKey((hp.getTaxi().getHp_Taxi_Guild()))); //計程車
		
		
		List<HP_Ticket_CTVO> htcList=htcDAO.selectByHP_Num(hp_Num);
		hpMap.put("HP_Ticket_CTList",htcList); //門票對照表
		
		ticketList = new ArrayList<>();
		for(HP_Ticket_CTVO htc : htcList){
			ticketList.add(ticketDAO.findByPrimaryKey(htc.getTicket().getTicket_Num()));
		}
		hpMap.put("TicketList", ticketList);//門票
		
		
		List<HP_Trans_CTVO> hTranscList=hTranscDAO.selectByHP_Num(hp_Num);
		hpMap.put("HP_Trans_CTList",hTranscList); //交通票對照表
		
		transList = new ArrayList<>();
		for(HP_Trans_CTVO hTransc : hTranscList){
			transList.add(tDAO.findByPrimaryKey(hTransc.getTransVO().getTrans_Ticket_Num()));
		}
		hpMap.put("TransList", transList);//交通票
		
		List<HP_Easy_CTVO> hecList=hecDAO.selectByHP_Num(hp_Num);
		hpMap.put("HP_Easy_CTList",hecList); //儲值卡對照表
		
		eList = new ArrayList<>();
		for(HP_Easy_CTVO hec : hecList){
			eList.add(eDAO.findByPrimaryKey(hec.getEcard().getEcard_Num()));
		}
		hpMap.put("EcardList", eList);//儲值卡
		
		return hpMap;
	}
	
	

}
