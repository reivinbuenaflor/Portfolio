import java.util.Arrays;
public class ArraySorted{
	public static void main(String[] args) {
		Integer[] numarray = {5,10,-2,4,-1,3,9,6,7,8};
		Arrays.sort(numarray);
		for(int i = 0; i <= numarray.length-1; i++) {
			System.out.println(numarray[i]);
		}
	}
}