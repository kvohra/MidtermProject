package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Course> courseList = new ArrayList<Course>();
	static ArrayList<Semester> semesterList = new ArrayList<Semester>();
	static ArrayList<Section> sectionList = new ArrayList<Section>();
	static ArrayList<Student> studentList = new ArrayList<Student>();
	static ArrayList<Enrollment> enrollmentList = new ArrayList<Enrollment>();
	static ArrayList<Double> studentGPAList = new ArrayList<Double>();
	static ArrayList<Double> ciscGPAList = new ArrayList<Double>();
	static ArrayList<Double> pillGPAList = new ArrayList<Double>();
	static ArrayList<Double> chemGPAList = new ArrayList<Double>();
	static Semester fall, spring;
	static Course CISC, PILLS, CHEM;
	static Section f11, f22, f33, s11, s22, s33;
	static Student sa, sb, sc, sd, se, sf, sg, sh, si, sj;
	static Enrollment e1, e2, e3, e4, e5, e6;

	
	public static Date studDate(int year, int month, int day){
		Calendar CalB = Calendar.getInstance();
		CalB.set(year, month, day);
		return CalB.getTime();
	}
	@BeforeClass
	public static void setup() throws Exception{
		
		// courses
		
		CISC = (new Course(UUID.randomUUID(), "CISC181", 4, eMajor.COMPSI));
		PILLS = (new Course(UUID.randomUUID(), "PILL202", 4, eMajor.NURSING));
		CHEM = (new Course(UUID.randomUUID(), "CHEM420", 4, eMajor.CHEM));
		courseList.add(CISC);
		courseList.add(PILLS);
		courseList.add(CHEM);
		
		// semesters
		fall = new Semester(UUID.randomUUID(), studDate(2016, 8, 30), studDate(2016, 12, 20));
		spring = new Semester(UUID.randomUUID(), studDate(2017, 1, 25), studDate(2017, 5, 1));
		semesterList.add(fall);
		semesterList.add(spring);
		
		// sections
		f11 = new Section(CISC.getCourseID(), fall.getSemesterID(), 420);
		s11 = new Section(CISC.getCourseID(), spring.getSemesterID(), 017);
		f22 = new Section(PILLS.getCourseID(), fall.getSemesterID(), 420);
		s22 = new Section(PILLS.getCourseID(), spring.getSemesterID(), 017);
		f33 = new Section(CHEM.getCourseID(), fall.getSemesterID(), 420);
		s33 = new Section(CHEM.getCourseID(), spring.getSemesterID(), 017);
		sectionList.add(f11);
		sectionList.add(f22);
		sectionList.add(f33);
		sectionList.add(s11);
		sectionList.add(s22);
		sectionList.add(s33);
		
		//students
		sa = new Student("Marco", "Ponzi", "Polo", studDate(1997, 2, 20), eMajor.PHYSICS, "42 Wallaby Way", "(243)-234-5748", "biteme@aol.com");
		sb = new Student("Christopher", "James", "Colombos", studDate(1996, 4, 18), eMajor.NURSING, "95 Butt Way", "(430)-522-2222", "unseeable@gmail.com");
		sc = new Student("Maria", "Diamond", "Winter",studDate(1997, 8, 10), eMajor.CHEM, "92 Pike Circle", "(234)-321-3983", "stupidhead@gmail.com");
		sd = new Student("Jamie", "Lee", "Foxworthy", studDate(1996, 4, 9), eMajor.NURSING, "42 Meadows Rd", "(911)-911-9111", "fakeemail@gmail.com");
		se = new Student("Avery", "May", "Carter", studDate(1997, 2, 8), eMajor.NURSING, "6 Horn Rd", "(213)-234-9032", "horselover@gmail.com");
		sf = new Student("Obu", "Obu", "Obu", studDate(1996, 4, 5), eMajor.BUSINESS, "12 Obu Lane", "(111)-111-1111", "africahasnoemail@gmail.com");
		sg = new Student("Mary", "And", "Joseph", studDate(1995, 9, 11), eMajor.CHEM, "72 West Side Alley", "(690)-232-7890", "totalbutt@gmail.com");
		sh = new Student("Joey", "Marsh", "Morello", studDate(1997, 8, 12), eMajor.COMPSI, "4001 Edward Lane", "(610)-233-9877", "momojojo@gmail.com");
		si = new Student("Jeremy", "Mark", "Blackburn", studDate(1994, 6, 8), eMajor.BUSINESS, "40 Mill Road", "(230)-421-3958", "buttritual@yahoo.com");
		sj = new Student("Joe", "Kevin", "Linder", studDate(1995, 5, 22), eMajor.COMPSI, "300 Linda Lane", "(432)-853-2942", "theplug@gmail.com");
		studentList.add(sa);
		studentList.add(sb);
		studentList.add(sc);
		studentList.add(sd);
		studentList.add(se);
		studentList.add(sf);
		studentList.add(sg);
		studentList.add(sh);
		studentList.add(si);
		studentList.add(sj);
		
		// enrollment and grade sorting
		for (int i = 0; i < studentList.size(); i++){
			Student stud = studentList.get(i);
			
			for (int j = 0; j < sectionList.size(); j++){
				Section sect = sectionList.get(j);
				Enrollment k = new Enrollment(stud.getStudentID(), sect.getSectionID());
				enrollmentList.add(k);
				if (k.getSectionID() == f11.getSectionID()){
					k.setGrade(3.8);
					ciscGPAList.add(k.getGrade());
					studentGPAList.add(k.getGrade());
				}
				if (k.getSectionID() == f22.getSectionID()){
					k.setGrade(3.7);
					pillGPAList.add(k.getGrade());
					studentGPAList.add(k.getGrade());
				}
				if (k.getSectionID() == f33.getSectionID()){
					k.setGrade(3.6);
					chemGPAList.add(k.getGrade());
					studentGPAList.add(k.getGrade());
				}
				if (k.getSectionID() == s11.getSectionID()){
					k.setGrade(3.9);
					ciscGPAList.add(k.getGrade());
					studentGPAList.add(k.getGrade());
				}
				if (k.getSectionID() == s22.getSectionID()){
					k.setGrade(3.3);
					pillGPAList.add(k.getGrade());
					studentGPAList.add(k.getGrade());
				}
				if (k.getSectionID() == s33.getSectionID()){
					k.setGrade(3.9);
					chemGPAList.add(k.getGrade());
					studentGPAList.add(k.getGrade());
				}
			}
		}
		
	}
	@Test //change student major
	public void ChangeMajorTest(){
		studentList.get(4).setMajor(eMajor.COMPSI);
	}

	@Test
	public void GPATests() {
		// GPA Test for Course #1 CISC
		double cisctot = 0;
		double ciscgpa = 0;
		for (int l = 0; l < ciscGPAList.size(); l++){
			ciscgpa = ciscGPAList.get(l);
			cisctot += ciscgpa;
		
		}
		double ciscavg = cisctot / 20;
		assertEquals(3.85, ciscavg, 3.85);
		
		// GPA Test for Course #2 PILLS
		double pilltot = 0;
		double pillgpa = 0;
		for (int m = 0; m < pillGPAList.size(); m++){
			pillgpa = pillGPAList.get(m);
			pilltot += pillgpa;
		
		}
		double pillavg = pilltot / 20;
		assertEquals(3.5, pillavg, 3.5);
		
		//GPA Test for Course #3
		double chemtot = 0;
		double chemgpa =  0;
		for (int n = 0; n < chemGPAList.size(); n++){
			chemgpa = chemGPAList.get(n);
			chemtot += chemgpa;
			
		}
		double chemavg = chemtot / 20;
		assertEquals(3.75, chemavg, 0);

		// GPA Test for total student GPA
		double studtot = 0;
		double studGPA = 0;
		for (int z = 0; z < studentGPAList.size(); z++){
			studGPA = studentGPAList.get(z);
			studtot += studGPA;			
		}
		double studavg = studtot / 10;
		assertEquals(3.7, studavg, 0);
	}
}