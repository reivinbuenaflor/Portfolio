public class Arrays{
	public static void main(String[] args) {
		int[] numarray = {5,10,-2,4,-1,3,9,6,7,8};
		int n = numarray.length;
		int store;
		System.out.print("Output#1: ");
		for(int i = 0; i <= n-1; i++) {
			System.out.print(numarray[i]+",");
		}
		System.out.println();
		System.out.print("Output#2: ");
		for(int i = 0; i <= n-1; i++) {
			System.out.print(numarray[n-i-1]+",");
		}
		System.out.println();
		System.out.print("Output#3: ");
		for(int i = 0; i < n-1; i++) {
			for(int x = 0; x < n-i-1; x++ ) {
				if(numarray[x] > numarray[x+1]) {
					store = numarray[x];
					numarray[x] = numarray[x+1];
					numarray[x+1] = store;
				}
			}
		}
		for(int y = 0; y <= n-1; y++) {
			System.out.print(numarray[y]+",");
		}
	}
}