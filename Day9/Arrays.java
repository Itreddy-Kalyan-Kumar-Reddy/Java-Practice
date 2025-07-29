package Day9;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i=0;i<5;i++) {
            System.out.println("Please Enter your marks"+(i+1));
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<5;j++) {
            System.out.print(arr[j]+" ");
        }
        sc.close();
    }
}
