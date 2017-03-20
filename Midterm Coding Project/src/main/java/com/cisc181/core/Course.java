package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;


public class Course {
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	/**
	 * 
	 * @param name
	 * @param gradePoints
	 * @param major
	 */
	public Course(UUID CourseID, String name, int gradePoints, eMajor major) {
		this.CourseID = CourseID;
		this.CourseName = name;
		this.GradePoints = gradePoints;
		this.Major = major;
	}

	// returns course id
	public UUID getCourseID() {
		return this.CourseID;
	}

	//returns course name
	public String getCourseName() {
		return this.CourseName;
	}

	//returns grade-points
	public int getGradePoints() {
		return this.GradePoints;
	}

	//returns major
	public eMajor getMajor() {
		return this.Major;
	}
	
}