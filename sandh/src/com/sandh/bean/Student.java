package com.sandh.bean;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Long SId;
	private String SName;
	private String SDormitory;
	private String SClass;
	private String SCounty;
	private String SNationality;
	private String SAddress;
	private String SUrl;
	private String new_;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(String SName, String SDormitory, String SClass,
			String SCounty, String SNationality, String SAddress, String SUrl,
			String new_) {
		this.SName = SName;
		this.SDormitory = SDormitory;
		this.SClass = SClass;
		this.SCounty = SCounty;
		this.SNationality = SNationality;
		this.SAddress = SAddress;
		this.SUrl = SUrl;
		this.new_ = new_;
	}

	// Property accessors

	public Long getSId() {
		return this.SId;
	}

	public void setSId(Long SId) {
		this.SId = SId;
	}

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	public String getSDormitory() {
		return this.SDormitory;
	}

	public void setSDormitory(String SDormitory) {
		this.SDormitory = SDormitory;
	}

	public String getSClass() {
		return this.SClass;
	}

	public void setSClass(String SClass) {
		this.SClass = SClass;
	}

	public String getSCounty() {
		return this.SCounty;
	}

	public void setSCounty(String SCounty) {
		this.SCounty = SCounty;
	}

	public String getSNationality() {
		return this.SNationality;
	}

	public void setSNationality(String SNationality) {
		this.SNationality = SNationality;
	}

	public String getSAddress() {
		return this.SAddress;
	}

	public void setSAddress(String SAddress) {
		this.SAddress = SAddress;
	}

	public String getSUrl() {
		return this.SUrl;
	}

	public void setSUrl(String SUrl) {
		this.SUrl = SUrl;
	}

	public String getNew_() {
		return this.new_;
	}

	public void setNew_(String new_) {
		this.new_ = new_;
	}

}