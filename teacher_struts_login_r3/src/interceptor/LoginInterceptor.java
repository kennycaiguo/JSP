package interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor{

	@Override
	public String doIntercept(ActionInvocation arg0) throws Exception {
		System.out.println("+++++++++++++++++++++++++++++++++");

		if(ActionContext.getContext().getSession().get("username") == null){
			System.out.println("Î´µÇÂ¼£¬±»À¹ÁË");
			return "loginPage";
		}
		System.out.println("=====================ÒÑµÇÂ¼");
		return arg0.invoke();
	}

}
