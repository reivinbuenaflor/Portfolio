import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main{
	public static void main(String[]args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int list[];
		try {
			System.out.println("Enter the length of array: ");
			String input = reader.readLine();
			int value = Integer.parseInt(input);
			list = new int[value];
			System.out.println("You entered: "+list.length);
			System.out.println("Enter an element: ");
			for(int i = 0; i < list.length; i++) {
				String elem = reader.readLine();
				list[i] = Integer.parseInt(elem);
			}
			for(int x = 0; x < list.length; x++) {
				System.out.println("The value of element is: "+list[x]);
			}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}