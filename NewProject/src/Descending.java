public class Descending{
	public static void main(String[] args) {
		String[] animals = {"Dog", "Cat", "Sheep", "Chicken","Fish"};
		int[] numarrays = {-1,-2,3,0,5,6,7,9,10,11,13,15,-10,-14,4};
		int store;
		int n = numarrays.length;
		int x = animals.length;
		for(int i = 0; i <= x-1; i++) {
			System.out.println(animals[x-i-1]);
		}
		System.out.println();
        for(int a = 0; a < n-1 ; a++){
            for(int i = 0; i < n-a-1; i++){
                if(numarrays[i] > numarrays[i+1]){
                    store = numarrays[i];
                    numarrays[i] = numarrays[i+1];
                    numarrays[i+1] = store;
                }
            }   
        }
        for(int i = 0; i < n; i++){
            System.out.println(numarrays[i]);
        }
	}
}