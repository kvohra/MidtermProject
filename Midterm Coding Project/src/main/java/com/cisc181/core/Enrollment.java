package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {
	}
	

	public Enrollment(UUID StudentID, UUID SectionID)
	{
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollmentID = UUID.randomUUID();
	
}
	//return section id
	public UUID getSectionID() {
		return this.SectionID;
	}

	//return student id 
	public UUID getStudentID() {
		return this.StudentID;
	}

	//return enrollment id
	public UUID getEnrollmentID() {
		return this.EnrollmentID;
	}

	//return grade
	public double getGrade() {
		return this.Grade;
	}

	//set grade
	public void setGrade(double grade) {
		this.Grade = grade;
	}
	
	

}