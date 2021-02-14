package com.omnia.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="activities_bank")
public class Activity implements Serializable{

    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "NAME_AR")
	private String nameAr;
	
	@Column(name = "NAME_EN")
	private String nameEn;
	
	@Column(name = "DESCRIPTION")
	private String decription;
	
	@Column(name = "AGE_RANGE_BEGIN")
	private float ageRangeBegin;
	
	@Column(name = "AGE_RANGE_END")
	private float ageRangeEnd;
	
	@Column(name = "DRIVE_LINK")
	private String driveLink;
	
	@ManyToOne 
	@JoinColumn(name = "ACTIVITY_TYPE_ID")
	private ActivityType activityType;

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

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public float getAgeRangeBegin() {
		return ageRangeBegin;
	}

	public void setAgeRangeBegin(float ageRangeBegin) {
		this.ageRangeBegin = ageRangeBegin;
	}

	public float getAgeRangeEnd() {
		return ageRangeEnd;
	}

	public void setAgeRangeEnd(float ageRangeEnd) {
		this.ageRangeEnd = ageRangeEnd;
	}

	public String getDriveLink() {
		return driveLink;
	}

	public void setDriveLink(String driveLink) {
		this.driveLink = driveLink;
	}

	public ActivityType getActivityType() {
		return activityType;
	}

	public void setActivityType(ActivityType activityType) {
		this.activityType = activityType;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", nameAr=" + nameAr + ", nameEn=" + nameEn + ", decription=" + decription
				+ ", ageRangeBegin=" + ageRangeBegin + ", ageRangeEnd=" + ageRangeEnd + ", driveLink=" + driveLink
				+ "]";
	}

	
	 
}
