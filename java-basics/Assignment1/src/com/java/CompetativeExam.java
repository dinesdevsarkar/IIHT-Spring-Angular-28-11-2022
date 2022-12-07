package com.java;

public class CompetativeExam {
	
	private int courseId;
	private String courseTeacher;
	private String courseName;
	private int courseDuration;
	private int totalFees;
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseTeacher() {
		return courseTeacher;
	}
	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	public int getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(int totalFees) {
		this.totalFees = totalFees;
	}
	@Override
	public String toString() {
		return "CompetativeExam [courseId=" + courseId + ", courseTeacher=" + courseTeacher + ", courseName="
				+ courseName + ", courseDuration=" + courseDuration + ", totalFees=" + totalFees + "]";
	}
	public CompetativeExam(int courseId, String courseTeacher, String courseName, int courseDuration, int totalFees) {
		super();
		this.courseId = courseId;
		this.courseTeacher = courseTeacher;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.totalFees = totalFees;
	}
	
	
	
	

}
