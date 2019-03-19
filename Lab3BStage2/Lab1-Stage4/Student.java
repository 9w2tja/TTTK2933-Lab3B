import java.util.*;
import java.util.logging.Logger;


public class Student{
	private String firstName;
	private String lastName;
	private String matrix;
	private String phone;
	private String grade;
	private double individualAssignmt;
	private double groupProject;
	private double finalExam;
	private double continuousAssessment;
	private double finalExam40percent;
	private double allMarks;

	public Student (String fname, String lname, String m, String phoneNo, double ia, double gp, double fe){

		this.firstName = fname;
		this.lastName = lname;
		this.matrix = m;
		this.phone = phoneNo;
		this.individualAssignmt = ia;
		this.groupProject = gp;
		this.finalExam = fe;

	}

	public double getIndividualAssignmt(){
		return individualAssignmt;
	}

	public double getGroupProject(){
		return groupProject;
	}

	public double getFinalExam(){
		return finalExam;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public String getMatrix(){
		return matrix;
	}

	public String getPhoneNo(){
		return phone;
	}
	
	public void calculateContinuousAssessment() {
		continuousAssessment = (individualAssignmt+groupProject)/200*60;
	}
	
	public double getContinuousAssessment() {
		return continuousAssessment;
	}
	
	public void calculateFinalExam() {
		finalExam40percent = (finalExam/100)*40;
	}
	
	public double getFinalExam40percent() {
		return finalExam40percent;
	}
	
	public void calculateAllMarks() {
		allMarks = continuousAssessment+finalExam40percent;
	}
	
	public double getAllMarks() {
		return allMarks;
	}

	public void calculateGrade() {

		if (allMarks >= 85) {
			grade = "A";
		} else if (allMarks >= 75) {
			grade = "B";
		} else if (allMarks >= 60) {
			grade = "C";
		} else if (allMarks >= 39) {
			grade = "D";
		} else if (allMarks < 39) {
			grade = "F";
		} else if (allMarks < 39) {
			grade = "F";
		} else if (allMarks >39) {
			grade = "F";
		}
	}

	public String getGrade() {
		return grade;
	}
}