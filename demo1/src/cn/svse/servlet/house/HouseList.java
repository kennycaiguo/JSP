package cn.svse.servlet.house;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.svse.bean.Houseinfo;
import cn.svse.bean.Userinfo;
import cn.svse.service.HouseService;

/*
 * 房屋信息展示Servlet
 */
public class HouseList extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HouseService houseService = new HouseService();
		
		// 获取Session中保存的信息
		Userinfo userinfo = (Userinfo) request.getSession().getAttribute("userinfo");
		
		List<Houseinfo> list = houseService.listHouseinfo(userinfo.getUid());
		// 将数据放入request中
		request.setAttribute("houseList", list);
		
		//转发请求到指定页面
		request.getRequestDispatcher("/a.jsp").forward(request, response);
	}

}
