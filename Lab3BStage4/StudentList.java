package com.company;

import java.util.ArrayList;

public class StudentList {
	public ArrayList<Student> stdlist = new ArrayList<Student>();
	
	public ArrayList<Student> getStudentList(){
		return stdlist;
	}
	
	public boolean addStudent(Student m) {

		String matrik = m.getMatrix();
	    String name = null;

		for (int i = 0; i < stdlist.size(); i++) {
			name = stdlist.get(i).getMatrix();
		}
		
		if (matrik != name) {
			stdlist.add(m);
			return true;
		} else {
			return false;
		}
	}

	public int calculateAstudents(ArrayList<Student> listOfStudentA) {

		int totalStudentA = 0;

		for (Student m : listOfStudentA) {
			if (m.getGrade().equalsIgnoreCase("A"))
				totalStudentA++;
		}

		return totalStudentA;

	}

	public int calculateFstudents(ArrayList<Student> listOfStudentF) {

		int totalStudentF = 0;

		for (Student m : listOfStudentF) {
			if (m.getGrade().equalsIgnoreCase("F"))
				totalStudentF++;
		}

		return totalStudentF;

	}
}
