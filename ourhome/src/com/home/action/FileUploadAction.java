package com.home.action;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ValidationAware;

public class FileUploadAction extends ActionSupport implements ValidationAware{
	
	private String picFileName;//�ϴ��ļ���Ӧ���ļ��� 
	private File pic;//�ϴ��ļ��������ƣ���ҳ���Ӧ
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
		//�õ��������ϴ���ϴ��ļ���Ŀ¼
		String path = ServletActionContext.getServletContext().getRealPath("/upload");
		//�����µ��ļ�������������
		//new Date().getTime() �õ�ϵͳ��ǰʱ�����1970/1/1������	
//		String newFileName = new Date().getTime()+ this.doc.getPicFileName();
		String newFileName = new Date().getTime()+ this.getPicFileName();
		//���ϴ���·�����µ��ļ�������Ŀ���ļ�����
		File target = new File(path,newFileName);
		//���û��ϴ�����ʱ�ļ����Ƶ�Ŀ���ļ���
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
