package com.cisc181.core;

import java.util.Date;
import java.util.UUID;


public class Semester {

	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	/**
	 * @param startDate
	 * @param endDate
	 */
	public Semester(UUID ID, Date startDate, Date endDate) {
		super();
		this.SemesterID = UUID.randomUUID();
		this.StartDate = startDate;
		this.EndDate = endDate;
	}

	// returns semester id
	public UUID getSemesterID() {
		return this.SemesterID;
	}

	//returns start date
	public Date getStartDate() {
		return this.StartDate;
	}

	//returns end date
	public Date getEndDate() {
		return this.EndDate;
	}
	
}