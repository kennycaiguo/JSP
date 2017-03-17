package intercept_student;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor_student extends MethodFilterInterceptor{
	@Override
	protected String doIntercept(ActionInvocation arg) throws Exception {
		if(ActionContext.getContext().getSession().get("username") == null){
			System.out.println("非法登录，系统拦截");
			return "loginPage";
		}		
		System.out.println("合法登陆");

		return arg.invoke();
	}

}
