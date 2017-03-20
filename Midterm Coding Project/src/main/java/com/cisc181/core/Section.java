/**
 * 
 */
package com.cisc181.core;

import java.util.UUID;

/**
 * @author paulsoper
 *
 */
public class Section {

	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	private Section() {
		this.SectionID = UUID.randomUUID();
	}
	
	/**
	 * @param courseID
	 * @param semesterID
	 */
	public Section(UUID courseID, UUID semesterID) {
		this();
		this.CourseID = courseID;
		this.SemesterID = semesterID;
	}

	/**
	 * @param courseID
	 * @param semesterID
	 * @param roomID
	 */
	public Section(UUID courseID, UUID semesterID, int roomID) {
		this();
		this.CourseID = courseID;
		this.SemesterID = semesterID;
		this.RoomID = roomID;
	}
	
	//returns course id
	public UUID getCourseID() {
		return this.CourseID;
	}

	//returns semester id
	public UUID getSemesterID() {
		return this.SemesterID;
	}

	//returns section id
	public UUID getSectionID() {
		return this.SectionID;
	}

	//returns room id
	public int getRoomID() {
		return this.RoomID;
	}

	//set room id
	public void setRoomID(int roomID) {
		this.RoomID = roomID;
	}
	
}