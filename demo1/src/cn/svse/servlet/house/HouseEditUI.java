package cn.svse.servlet.house;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.svse.bean.Houseinfo;
import cn.svse.service.HouseService;

/*
 * 房屋信息维护Servlet，负责跳转到发布或修改页面
 */
public class HouseEditUI extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HouseService houseService = new HouseService();

		// 设置获取数据的编码
		request.setCharacterEncoding("UTF-8");

		// 获取表单提交的信息
		String hid = request.getParameter("hid");

		if (hid != null && !hid.equals("")) {
			Houseinfo houseinfo = houseService.findHouseinfoById(Integer.parseInt(hid));
			// 将数据放入request中
			request.setAttribute("houseinfo", houseinfo);
		}
		
		//转发请求到指定页面
		request.getRequestDispatcher("/b.jsp").forward(request, response);
	}

}
