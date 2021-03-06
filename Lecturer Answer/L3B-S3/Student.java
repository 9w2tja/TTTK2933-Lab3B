import java.util.*;


public class Student{
	private String firstName;
	private String lastName;
	private String matrix;
	private String phone;
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

	public void calculateContinuousAssessment(){

		continuousAssessment = (getIndividualAssignmt()+ getGroupProject())/200*60;

	}

	public void calculateFinalExam(){

		finalExam40percent = (getFinalExam()/100)*40;
	}


	public double getContinuousAssessment(){
		return continuousAssessment;
	}

	public double getFinalExam40percent(){
		return finalExam40percent;
	}


	public void calculateAllMarks(){
			allMarks =  continuousAssessment + finalExam40percent;

	}

	public double getAllMarks(){
		return allMarks;
	}




}