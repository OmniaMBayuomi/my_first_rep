package com.omnia.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activities_types")
public class ActivityType implements Serializable{

    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "NAME_AR")
	private String nameAr;
	
	@Column(name = "NAME_EN")
	private String nameEn;
	
	@Column(name = "TYPE_DESCRIPTION")
	private String typeDescription;
	
	@Column(name = "TYPE_PROFIT")
	private String typeProfit;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameAr() {
		return nameAr;
	}

	public void setNameAr(String nameAr) {
		this.nameAr = nameAr;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getTypeDescription() {
		return typeDescription;
	}

	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}

	public String getTypeProfit() {
		return typeProfit;
	}

	public void setTypeProfit(String typeProfit) {
		this.typeProfit = typeProfit;
	}

	@Override
	public String toString() {
		return "ActivityType [id=" + id + ", nameAr=" + nameAr + ", nameEn=" + nameEn + ", typeDescription="
				+ typeDescription + ", typeProfit=" + typeProfit + "]";
	}
	
	

}
