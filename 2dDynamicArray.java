import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int[] A;
        int[] B;
        int[][]C;
        String setRow;
        String setCol;
        Integer getRow;
        Integer getCol;
        Integer finalres = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of First Array: ");
        setRow = sc.next();
        getRow = Integer.parseInt(setRow);

        System.out.println("Enter the length of Second Array: ");
        setCol = sc.next();
        getCol = Integer.parseInt(setCol);

        A = new int[getRow];
        B = new int[getCol];
        C = new int[getRow][getCol];
        
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
