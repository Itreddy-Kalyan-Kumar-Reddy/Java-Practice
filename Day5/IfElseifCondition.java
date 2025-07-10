package Day5;

import java.util.Scanner;

public class IfElseifCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b) {
            System.out.println(a+" > "+b);
            System.out.println("a is Grater than b");
        } else if(a<b) {
            System.out.println(a+" < "+b);
            System.out.println("a is less than b");
        } else {
            System.out.println(a+" == "+b);
            System.out.println("a is equal to b");
        }
        sc.close();
    }   
}