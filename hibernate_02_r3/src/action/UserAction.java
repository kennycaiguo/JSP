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
		//表示每页显示5条记录，page表示当前网页
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
//上一页
	public String up() {
		System.out.println("===========上一页");
		return SUCCESS;
	}
//下一页
	public String down() {
		System.out.println("===========下一页");
		return SUCCESS;
	}
}
