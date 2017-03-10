package cn.svse.servlet.user;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.svse.bean.Userinfo;
import cn.svse.service.UserService;

public class UserLogin extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 设置获取数据的编码
		request.setCharacterEncoding("UTF-8");

		// 获取表单提交的信息
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// 用户登陆验证
		UserService service = new UserService();
		Userinfo userinfo = null;
		try {
			userinfo = service.login(username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 登陆成功后将用户的所有信息（存放在Userinfo类型的用户对象中）保存在Session中
		request.getSession().setAttribute("userinfo", userinfo);

		response.sendRedirect(request.getContextPath() + "/servlet/HouseList");
	}

}
