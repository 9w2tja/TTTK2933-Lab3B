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
}
