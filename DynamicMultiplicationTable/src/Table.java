import java.util.Scanner;

public class Table{
	public static void main(String[] args) {
		int nStart, nEnd;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert Starting point: ");
		nStart = scanner.nextInt();
		System.out.println("Insert End point: ");
		nEnd = scanner.nextInt();
		
		for(int x = nStart; x <=nEnd; x++) {
			for(int y = 1; y<=nEnd; y++ ) {
				int res = x*y;
				if(res < 10) {
					System.out.print(res+"    ");
				}
				else if(res < 100) {
					System.out.print(res+"   ");
				}else if(res < 1000) {
					System.out.print(res+"  ");
				}
				else {
					System.out.print(res+" ");
				}
			}
			System.out.println("");
		}	
		
	}	
}