public class DescendingArray{
	public static void main(String[] args) {
		String[] animals = {"Cat", "Dog", "Fish", "Bird", "Sheep"};
		int n = animals.length;
		for(int i = 0; i <= n-1; i++) {
			System.out.println(animals[n-i-1]);
		}
		}
}