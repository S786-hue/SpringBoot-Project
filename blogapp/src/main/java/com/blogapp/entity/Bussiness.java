package com.blogapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;

@Entity
public class Bussiness {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String BussinessName;
	private String Adddress;
	private String Mobile;
	private int AnnualEncome;
	
	@OneToOne(mappedBy = "bussiness")
	private Father father;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBussinessName() {
		return BussinessName;
	}

	public void setBussinessName(String bussinessName) {
		BussinessName = bussinessName;
	}

	public String getAdddress() {
		return Adddress;
	}

	public void setAdddress(String adddress) {
		Adddress = adddress;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public int getAnnualEncome() {
		return AnnualEncome;
	}

	public void setAnnualEncome(int annualEncome) {
		AnnualEncome = annualEncome;
	}

	public Father getFather() {
		return father;
	}

	public void setFather(Father father) {
		this.father = father;
	}
	
	
	
}