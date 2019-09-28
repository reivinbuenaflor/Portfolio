public class Report{
	private Employee emp = new Employee();
	private Salary sal = new Salary();
	private EmpList empList = new EmpList(emp, emp, emp, emp, emp, emp);
	private EmpListSalary empSalary = new EmpListSalary(sal, sal, sal);
	
	public void setFNAME(String getfname) {
		 emp.setEmpFNAME(getfname);
	}
	public void setMNAME(String getmname) {
		 emp.setEmpMNAME(getmname);
	}
	public void setLNAME(String getlname) {
		 emp.setEmpLNAME(getlname);
	}
	public void setAGE(String getage) {
		emp.setEmpAGE(getage);
	}
	public void setGENDER(String getgender) {
		 emp.setEmpGENDER(getgender);
	}
	public void setPOSITION(String getposition) {
		emp.setEmpPOSITION(getposition);
	}
	public void setTAX(double gettax) {
		sal.setEmpTAX(gettax);
	}
	public void setDEDUCTRATE(double getdeductrate) {
		sal.setEmpDEDUCTIONRATE(getdeductrate);
	}
	public void setFINALRATE(double getfinalrate) {
		sal.setEmpFINALRATE(getfinalrate);
	}
	public void addItall() {
		String addfname = emp.getEmpFNAME();
		String addmname = emp.getEmpMNAME();
		String addlname = emp.getEmpLNAME();
		String addage = emp.getEmpAGE();
		String addgender = emp.getEmpGENDER();
		String addposition = emp.getEmpPOSITION();
		double addtax = sal.getEmpTAX();
		double adddeductrate = sal.getEmpDEDUCTIONRATE();
		double addfinalrate = sal.getEmpFINALRATE();
		
		empList.addtoList(addfname,addmname, addlname, addage, addgender, addposition);
		empSalary.addtoList(addtax, adddeductrate, addfinalrate);
	}
	public void retList() {
		System.out.println("First Name -> Middle Name -> Last Name -> Age -> Gender -> Position");
		empList.viewList();
		System.out.println("Tax -> Deduction Rate -> Final Rate");
		empSalary.viewSalList();
	}
	
}