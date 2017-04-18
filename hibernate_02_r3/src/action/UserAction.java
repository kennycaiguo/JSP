package action;

import java.util.List;

import lmpl.PersonServiceImpl;

import service.PersonService;
import service.UserService;
import util.HibernateUtil;
import bean.Emp;
import bean.PageBean;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<Emp> {
	private PersonService personService = new PersonServiceImpl();
	
	private Emp Emp = new Emp();

	private PageBean pageBean;

	private int page;
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public PageBean geEmpList() {
		return pageBean;
	}

	public void seEmpList(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	UserService service = new UserService();

	public Emp getModel() {
		return Emp;
	}

	public String list() {
//		userList = service.list();
		//��ʾÿҳ��ʾ5����¼��page��ʾ��ǰ��ҳ
		pageBean = personService.getPageBean(5, page);
		System.out.println();
		ActionContext.getContext().put("pageBean", pageBean);
		return SUCCESS;
	}



	public String add() {
		service.add(Emp);
		return SUCCESS;
	}

	public String update() {
		return SUCCESS;
	}
//��һҳ
	public String up() {
		System.out.println("===========��һҳ");
		return SUCCESS;
	}
//��һҳ
	public String down() {
		System.out.println("===========��һҳ");
		return SUCCESS;
	}
}
