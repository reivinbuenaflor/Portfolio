public class JavaBasic{
	public static void main(String[] args) {
		int x = 5;
		int y = 1;
		if(x > 1) {
			System.out.println("Pogi ako!");
		}else {
			System.out.println("Hindi ako pogi");
		}
		System.out.println();
		for(int i = 1; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println();
		while(x <=10) {
			x++;
			System.out.println("Pogi ako");
		}
		System.out.println();
		do {
			y++;
			System.out.println("Yes");
		}while(y <=5);
		System.out.println();
		int choice = 1;
		System.out.println("Pogi ba ako?");
		switch(choice) {
		case 1: System.out.println("Oo");
		break;
		case 2: System.out.println("Syempre naman");
		break;
		}
		
	}
}