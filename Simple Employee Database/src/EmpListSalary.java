import java.util.ArrayList;

public class EmpListSalary{
	private Salary tax;
	private Salary deductrate;
	private Salary finalrate;
	ArrayList<Double> salList = new ArrayList<>();
	
	EmpListSalary(Salary tax, Salary deductrate, Salary finalrate){
		this.tax = tax;
		this.deductrate = deductrate;
		this.finalrate = finalrate;
	}
	
	public void addtoList(double tax, double deductrate, double finalrate) {
		double[] salaryList = {tax,deductrate,finalrate};
		for(double extrct : salaryList) {
			salList.add(extrct);
		}
	}
	
	public void viewSalList() {
		System.out.println(salList);
	}
}