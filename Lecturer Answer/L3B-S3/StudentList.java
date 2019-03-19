import java.util.*;

public class StudentList{

	private ArrayList<Student> stdList;


	public StudentList(){
		//create a list
		stdList = new ArrayList<Student>();

	}

	public ArrayList<Student> getStudentList(){

		return stdList;

	}

	public boolean addStudent (Student m){

		boolean alreadyAdded=false;

		//element is an oject of class Member
		//check if m already in the list
		for (Student element: stdList){

			if (element.getMatrix().equals(m.getMatrix())){
				alreadyAdded = true;
				break;
			}

		}
		if(alreadyAdded == true)
			return false;
		else {
			stdList.add(m);
			return true;
		}

	}


}
