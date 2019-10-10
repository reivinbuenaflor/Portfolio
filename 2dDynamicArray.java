import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] A;
        int[] B;
        int[][]C;
        
        Integer getfArray;
        Integer getsArray;
        Integer finalres = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of First Array: ");
        getfArray = sc.nextInt();
        
        System.out.println("Enter the length of Second Array: ");
        getsArray = sc.nextInt();
        
        A = new int[getfArray];
        B = new int[getsArray];
        C = new int[getfArray][getsArray];
        
        System.out.println("");
        System.out.print("  ");
        for(int i = 1; i < B.length; i++) {
            System.out.print(i+"\t\t");
        }

        System.out.println("");
        System.out.print("* ");

        for(int i = 1; i < B.length; i++) {
            System.out.print("*\t\t");
        }

        System.out.println(" ");

        for(int i  = 1; i < A.length; i++){

            System.out.print(i+"*");
            for(int j = 1; j < B.length; j++){
                A[i] = i;
                B[j] = j;
                C[i][j] = A[i]*B[j];

                System.out.print(C[i][j]+"\t\t");
            }
            System.out.println("");
        }
    }
}
