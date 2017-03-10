  package cn.svse.service;

import java.sql.SQLException;
import java.util.List;

import cn.svse.bean.Houseinfo;
import cn.svse.dao.HouseDao;

/*
 * 业务处理类
 */
public class HouseService {

	HouseDao dao = new HouseDao();

	/*
	 * 处理“保存房屋信息”业务
	 */
	public void saveHouseinfo(Houseinfo houseinfo) throws SQLException {
		if(houseinfo.getHid() == 0){
			dao.addHouseinfo(houseinfo);
		}else{
			dao.modHouseinfo(houseinfo);
		}
	}

	/*
	 * 处理“展示房屋信息”业务
	 */
	public List<Houseinfo> listHouseinfo(int uid) {
		return dao.listHouseinfo(uid);
	}
	
	/*
	 * 处理“查找某房屋信息”业务
	 */
	public Houseinfo findHouseinfoById(int hid){
		Houseinfo houseinfo = dao.findHouseinfoById(hid);
		return houseinfo;
	}

}
