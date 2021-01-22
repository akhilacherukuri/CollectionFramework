package Set;

public class StudentDetails {
	String studentname;
	int rollnumber;
	int marks;
	StudentDetails(String name,int Rollnumber,int studentmarks){
		this.studentname=name;
		this.rollnumber=Rollnumber;
		this.marks=studentmarks;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return  studentname +"\t"+ rollnumber +"\t"+ marks ;
	}

}
