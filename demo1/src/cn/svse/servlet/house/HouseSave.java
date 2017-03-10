package cn.svse.servlet.house;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.svse.bean.Houseinfo;
import cn.svse.bean.Userinfo;
import cn.svse.service.HouseService;

/*
 * 房屋信息保存Servlet
 */
public class HouseSave extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 设置获取数据的编码
		request.setCharacterEncoding("UTF-8");

		// 获取表单提交的信息
		String hid = request.getParameter("hid");
		String harea = request.getParameter("harea");
		String hname = request.getParameter("hname");
		String hfx = request.getParameter("hfx");
		String hmj = request.getParameter("hmj");
		String hzx = request.getParameter("hzx");
		String hlc = request.getParameter("hlc");
		String hzj = request.getParameter("hzj");
		String hfd = request.getParameter("hfd");
		String hfdtel = request.getParameter("hfdtel");
		String hqk = request.getParameter("hqk");

		// 获取Session中保存的信息
		Userinfo userinfo = (Userinfo) request.getSession().getAttribute("userinfo");

		// 将数据封装到实体bean中
		Houseinfo houseinfo = new Houseinfo();
		if (hid != null && !hid.equals("")) {
			houseinfo.setHid(Integer.parseInt(hid));
		}
		houseinfo.setUid(userinfo.getUid());
		houseinfo.setHarea(harea);
		houseinfo.setHname(hname);
		houseinfo.setHfx(hfx);
		houseinfo.setHmj(hmj);
		houseinfo.setHzx(hzx);
		houseinfo.setHlc(hlc);
		houseinfo.setHzj(hzj);
		houseinfo.setHfd(hfd);
		houseinfo.setHfdtel(hfdtel);
		houseinfo.setHqk(hqk);

		HouseService service = new HouseService();
		try {
			service.saveHouseinfo(houseinfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//重定向到指定页面
		response.sendRedirect(request.getContextPath() + "/servlet/HouseList");
	}

}
