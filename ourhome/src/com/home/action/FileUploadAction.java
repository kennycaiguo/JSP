package com.home.action;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ValidationAware;

public class FileUploadAction extends ActionSupport implements ValidationAware{
	
	private String picFileName;//上传文件对应的文件名 
	private File pic;//上传文件属性名称，与页面对应
	public File getPic() {
		return pic;
	}
	public void setPic(File pic) {
		this.pic = pic;
	}
	public String getPicFileName() {
		return picFileName;
	}
	public void setPicFileName(String picFileName) {
		this.picFileName = picFileName;
	}
	public String execute(){
		//得到服务器上存放上传文件的目录
		String path = ServletActionContext.getServletContext().getRealPath("/upload");
		//创建新的文件名，避免重名
		//new Date().getTime() 得到系统当前时间距离1970/1/1毫秒数	
//		String newFileName = new Date().getTime()+ this.doc.getPicFileName();
		String newFileName = new Date().getTime()+ this.getPicFileName();
		//用上传的路径和新的文件名创将目标文件对象
		File target = new File(path,newFileName);
		//将用户上传的零时文件复制到目标文件里
		try {
//			FileUtils.copyFile(doc.getPic(), target);
			FileUtils.copyFile(getPic(), target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
