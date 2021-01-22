package list;

import Set.StudentDetails;

public class Employee implements Comparable{
	long empId;
	String empName;
	String empMailId;
	int phoneNumber;

	Employee(long empId, String empName, String empMailId, int phoneNumber) {
		this.empId = empId;
		this.empName = empName;
		this.empMailId = empMailId;
		this.phoneNumber = phoneNumber;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMailId() {
		return empMailId;
	}

	public void setEmpMailId(String empMailId) {
		this.empMailId = empMailId;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return  empId +"\t"+ empName +"\t"+ empMailId+"\t"+ phoneNumber;
	}
	public int compareTo(Object obj) {
		Employee emp=(Employee)obj;
		if(this.getEmpId()>emp.getEmpId()) 
			return +1;
		
		else if(this.getEmpId()<emp.getEmpId()
				) 
			return -1;
		
		else 
			return 0;
		
		//return marks;
		
	}
}
