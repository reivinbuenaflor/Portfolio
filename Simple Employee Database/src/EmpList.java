import java.util.ArrayList;

public class EmpList{
	
	private Employee fname;
	private Employee mname;
	private Employee lname;
	private Employee age;
	private Employee gender;
	private Employee position;
	
	ArrayList<String> empList = new ArrayList<>();
	
	EmpList(Employee fname, Employee mname, Employee lname, Employee age, Employee gender, Employee position){
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.age = age;
		this.gender = gender;
		this.position = position;
	}
	
	public void addtoList(String fname, String mname, String lname, String age, String gender, String position) {
		String[] nameList = {fname,mname,lname,age,gender,position};
		for(String extrct:nameList) {
			empList.add(extrct);
		}
	}
	
	public void viewList() {
		System.out.println(empList);
	}
}