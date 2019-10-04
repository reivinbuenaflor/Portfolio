import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int[] A;
        int[] B;
        int[][] C;
        String setRow;
        String setCol;
        Integer getRow;
        Integer getCol;
        Integer finalResA;
        Integer finalResB;
        Integer finalres;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of row: ");
        setRow = sc.next();
        getRow = Integer.parseInt(setRow);

        System.out.println("Enter the length of column: ");
        setCol = sc.next();
        getCol = Integer.parseInt(setCol);

        A = new int[getRow];
        B = new int[getCol];

        System.out.println("*");
        for(int i  = 1; i < A.length; i++){
            System.out.println("*");
            System.out.print(i+"*");
            for(int j = 1; j < B.length; j++){
                A[i] = i;
                B[j] = j;
                finalResA = A[i];
                finalResB = B[j];
                finalres = finalResA*finalResB;
                if(finalres < 10) {
                    System.out.print(finalres+"    ");
                }
                else if(finalres< 100) {
                    System.out.print(finalres+"   ");
                }else if(finalres< 1000) {
                    System.out.print(finalres+"  ");
                }
                else {
                    System.out.print(finalres+" ");
                }
            }
            System.out.println(" ");
        }
    }
}
