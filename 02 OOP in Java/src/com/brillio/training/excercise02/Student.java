package com.brillio.training.excercise02;

public class Student {

	private int rollNumber;
	private String name;
	private final int N=3;
	MarksData[] marksData = new MarksData[N];
	
	public Student() {
	}

	public Student(int rollNumber, String name, MarksData[] marksData) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MarksData[] getMarksData() {
		return marksData;
	}

	public void setMarksData(MarksData[] marksData) {
		this.marksData = marksData;
	}
	
	public String getGrade(){
		int avg = (this.marksData[0].getMarks()+this.marksData[1].getMarks()+this.marksData[2].getMarks())/3;
		if(avg>0 && avg<=40){
			return "D";
		}else if(avg>40 && avg<=50){
			return "c";
		}else if(avg>50 && avg<=60){
			return "B";
		}else if(avg>60 && avg<=70){
			return "B+";
		}else if(avg>70 && avg<=80){
			return "A";
		}else if(avg>80 && avg<=100){
			return "A+";
		}
		return null;
	}
	
}
