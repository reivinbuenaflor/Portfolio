import java.util.Scanner;

public class DynamicArray{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr;
		System.out.println("Enter how many elements should the array have: ");
		int lenElem = scanner.nextInt();
		arr = new int[lenElem ];
		int len = arr.length;
		System.out.println("The length or array is: "+len);
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < len; i++) {
			int elem = scanner.nextInt();
			arr[i] = elem;
		}
		for(int i = 0; i < len; i++) {
			System.out.println("The elements are: "+arr[i]);
		}
	}
}