import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		ArrayList list = new ArrayList();
		
		String option;
		String addtoRecord, removetoRecord;
		
		boolean loop = true;
		
		while(loop != false) {
			System.out.println("\t Selection Option: \n"+
					"---------------------------------\n"+
					"[1] - Add Record\n"+
					"[2] - Remove Record\n"+
					"[3] - View Records\n"+
					"[4] - Exit\n"+
					"---------------------------------");
			System.out.println("Choice: ");
			
			try {
				option = read.readLine();
				int choice = Integer.parseInt(option);
				
				switch(choice) {
				
				case 1: 
					System.out.println("Insert a name to be added: ");
					addtoRecord = read.readLine();
					list.add(addtoRecord);
					
					System.out.println("You added: "+addtoRecord);
					System.out.println();
					break;
				
				case 2:
					System.out.println("Record List");
					
					Iterator previewList = list.iterator();
					while(previewList.hasNext()) {
						System.out.println(previewList.next());
						
					}
					
					System.out.println("------------------------");
					System.out.println("Insert a name that you want to remove: ");
					removetoRecord = read.readLine();
					list.remove(removetoRecord);
					
					System.out.println("You removed: "+removetoRecord);
					System.out.println();
					break;
					
				case 3:
					System.out.println("Record List");
					Iterator viewList = list.iterator();
					while(viewList.hasNext()) {
						System.out.println(viewList.next());
					}
					System.out.println();
					break;
				}
					
				if(choice == 4) {
					loop = false;
				}
				
			}catch(NumberFormatException e) {
				System.out.println("Error! Input a valid option: ");
			}
		}
	}
}