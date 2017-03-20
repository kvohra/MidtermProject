package com.cisc181.core;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.*;
import java.util.Date;

public class Staff_Test {
	static ArrayList<Staff> stafflist = new ArrayList<Staff>();
	

	public static Date staffDate(int year, int month, int day){
		Calendar CalB = Calendar.getInstance();
		CalB.set(year, month, day);
		return CalB.getTime();}
	@BeforeClass
	public static void setup() throws Exception {
		
		stafflist.add(new Staff("Snoop","Diggy","Dogg", staffDate(1969, 4, 20), "420 High St", "(420)-017-5050", "DaOG@gmail.com", "Monday & Tuesday 4:20 PM - whenever dogg", 1, 420000, new Date(2010, 4, 20), com.cisc181.eNums.eTitle.MR));
		stafflist.add(new Staff("Oprah", "Winnipeg", "Whinfrey", staffDate(1950, 5, 11), "33 Yougeta Lane","(892)-242-0284","oprah@gmail.com","Thursday 3 PM - 4 PM", 2, 400000, new Date(2004, 9, 12),com.cisc181.eNums.eTitle.MRS));
		stafflist.add(new Staff("Kobe", "Walter", "Bryant", staffDate(1970, 1,1), "1 Legends Lane", "(134)-492-2489", "nothingbutnet@yahoo.com","Monday 11 AM - 12 PM", 3, 500000, new Date(2000, 3, 20), com.cisc181.eNums.eTitle.DR));
		stafflist.add(new Staff("Barrack", "hussein", "Obama", staffDate(1964, 10, 30), "500 Retirement Way", "(684)-324-2345", "firstblackprez@secrtgovtemail.com", "Monday 12 PM - 12:01 PM", 4, 450000, new Date(1999, 2, 9), com.cisc181.eNums.eTitle.DEAN));
		stafflist.add(new Staff("Jimi", "Elvis", "Hendrxx", staffDate(1949, 7, 27), "12 RocknRoll Boulevard", "(295)-975-2859", "whatsemail@aol.com", "I aint got time for your shit", 5, 1000000, new Date(1980, 4, 10), com.cisc181.eNums.eTitle.PROF));
		
	}
	

	@Test
	public void avgSlry() {
		double sum = 0;
		for (Staff i : stafflist){
			sum += i.getSalary();
		}
		double avg = sum / 5;
		assertEquals(554000.0, avg, 1);}
		
	@Test(expected = PersonException.class)
	public void testDOB() throws PersonException{
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 120);
		Staff staff = new Staff(eTitle.MR);
		staff.setDOB(calendar.getTime());
	}	
	
	@Test(expected = PersonException.class)
	public void TestPhone() throws PersonException{
		Staff staff = new Staff(eTitle.MR);
		staff.setPhone("(456-7890");
	}

}
