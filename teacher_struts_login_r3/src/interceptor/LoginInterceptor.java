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
			System.out.println("δ��¼��������");
			return "loginPage";
		}
		System.out.println("=====================�ѵ�¼");
		return arg0.invoke();
	}

}
