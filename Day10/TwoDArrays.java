package Day10;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int arr[][] = new int[k][l];
        for(int i=0;i<k;i++) {
            for(int j=0;j<l;j++) {
                System.out.println("Enter element at row "+(i+1)+" and column " + (j+1));
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<k;i++) {
            for(int j=0;j<l;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
        }
        sc.close();;
    }   
}