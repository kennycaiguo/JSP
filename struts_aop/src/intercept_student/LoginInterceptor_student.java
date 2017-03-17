package intercept_student;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor_student extends MethodFilterInterceptor{
	@Override
	protected String doIntercept(ActionInvocation arg) throws Exception {
		if(ActionContext.getContext().getSession().get("username") == null){
			System.out.println("�Ƿ���¼��ϵͳ����");
			return "loginPage";
		}		
		System.out.println("�Ϸ���½");

		return arg.invoke();
	}

}
