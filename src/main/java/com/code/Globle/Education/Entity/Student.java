package com.code.Globle.Education.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	 private Integer studentId ;
	 private String studentName;
	 private String emailId; 
	 private String intrestedCountry;
	 private Integer intakeYear;
	 private String studyLevel;
	 private String courseIntrested;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getIntrestedCountry() {
		return intrestedCountry;
	}
	public void setIntrestedCountry(String intrestedCountry) {
		this.intrestedCountry = intrestedCountry;
	}
	public Integer getInTakeYear() {
		return intakeYear;
	}
	public void setIntakeYear(Integer intakeYear) {
		this.intakeYear = intakeYear;
	}
	public String getStudyLevel() {
		return studyLevel;
	}
	public void setStudyLevel(String studyLevel) {
		this.studyLevel = studyLevel;
	}
	public String getCourseIntrested() {
		return courseIntrested;
	}
	public void setCourseIntrested(String courseIntrested) {
		this.courseIntrested = courseIntrested;
	}
	public Student(Integer studentId, String studentName, String emailId, String intrestedCountry, Integer intakeYear,
			String studyLevel, String courseIntrested) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.emailId = emailId;
		this.intrestedCountry = intrestedCountry;
		this.intakeYear = intakeYear;
		this.studyLevel = studyLevel;
		this.courseIntrested = courseIntrested;
	}
	public Student() {
		super();
		
	}
	 
	 

}
