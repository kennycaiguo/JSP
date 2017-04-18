package lmpl;

import java.util.List;

import service.PersonService;
import util.HibernateUtil;

import bean.Emp;
import bean.PageBean;

public class PersonServiceImpl implements PersonService
{
	HibernateUtil util = new HibernateUtil();
    /**
     * pageSize为每页显示的记录数
     * page为当前显示的网页
     */
    public PageBean getPageBean(int pageSize, int page)
    {
        PageBean pageBean = new PageBean();
        
        String hql = "from Emp";
        
        int allRows = util.getAllRowCount(hql);
        System.out.println("getAllRowCount======================="+allRows);
        int totalPage = pageBean.getTotalPages(pageSize, allRows);
        
        int currentPage = pageBean.getCurPage(page);
        
        int offset = pageBean.getCurrentPageOffset(pageSize, currentPage);
        
        List<Emp> list = util.queryByPage(hql, offset, pageSize);
        
        pageBean.setList(list);
        pageBean.setAllRows(allRows);
        pageBean.setCurrentPage(currentPage);
        pageBean.setTotalPage(totalPage);
        
        return pageBean;
    }
}