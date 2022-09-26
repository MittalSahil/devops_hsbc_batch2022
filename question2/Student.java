package com.question2;

public class Student {
	private int studentId;
	private String studentName;
	private String city;
	private int marks1;
	private int marks2;
	private int marks3;
	private float feePerMonth;
	private boolean isEligibleForScholorship;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public float getFeePerMonth() {
		return feePerMonth;
	}
	public void setFeePerMonth(float feePerMonth) {
		this.feePerMonth = feePerMonth;
	}
	public boolean getIsEligibleForScholorship() {
		return isEligibleForScholorship;
	}
	public void setIsEligibleForScholorship(boolean isEligibleForScholorship) {
		this.isEligibleForScholorship = isEligibleForScholorship;
	}
	
	public double getAnnualFee()
	{
		return feePerMonth*12;
	}
	
	public int getTotalMarks()
	{
		return marks1+marks2+marks3;
	}
	
	public float getAverage()
	{
		return (marks1+marks2+marks3)/3;
	}
	
	public String getResult()
	{
		if(marks1>70 && marks2>70 && marks3>70)
		{
			return "pass";
		}
		else
		{
			return "fail";
		}
	}
}
