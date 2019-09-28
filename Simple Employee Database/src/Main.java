import java.util.Iterator;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	public static void main(String[] args)throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Report output = new Report();
		String fname,mname,lname,age,gender,position;
		String tax,deductrate,finalrate;
		boolean loop = true;
		String option;
		
		while(loop != false) {
			System.out.println("\t Selection Option: \n"+
					"---------------------------------\n"+
					"[1] - Add Record\n"+
					"[2] - Remove Record\n"+
					"[3] - View Records\n"+
					"[4] - Exit\n"+
					"---------------------------------");
			System.out.println("Choice: ");
			option = br.readLine();
			int choice = Integer.parseInt(option);
			
			try {

				switch(choice) {
				case 1:
						System.out.println("EMPLOYEE INFO: ");
						System.out.println("---------------------------------");
						System.out.println("Enter First Name: ");
						fname = br.readLine();
						output.setFNAME(fname);
						System.out.println("Enter Middle Name: ");
						mname = br.readLine();
						output.setMNAME(mname);
						System.out.println("Enter Last Name: ");
						lname = br.readLine();
						output.setLNAME(lname);
						System.out.println("Enter Age: ");
						age = br.readLine();
						output.setAGE(age);
						System.out.println("Enter Gender: ");
						gender = br.readLine();
						output.setGENDER(gender);
						System.out.println("Enter Position: ");
						position = br.readLine();
						output.setPOSITION(position);
						System.out.println("EMPLOYEE SALARY INFO: ");
						System.out.println("---------------------------------");
						System.out.println("Enter Tax: ");
						tax = br.readLine();
						double finaltax = Double.parseDouble(tax);
						output.setTAX(finaltax);
						System.out.println("Enter Deduction Rate: ");
						deductrate = br.readLine();
						double finaldr = Double.parseDouble(deductrate);
						output.setDEDUCTRATE(finaldr);
						System.out.println("Enter Final Rate: ");
						finalrate = br.readLine();
						double finalfr = Double.parseDouble(finalrate);
						output.setFINALRATE(finalfr);
						output.addItall();
						break;
				case 2:
						break;
				case 3:
						System.out.println("EMPLOYEE INFO: ");
						System.out.println("---------------------------------");
						output.retList();
						System.out.println("---------------------------------");
						break;
				case 4:
						loop = false;
				}
				
			}catch(NumberFormatException e) {
			System.out.println("Error! Input a valid option: ");
			}
		}
		
	}
}