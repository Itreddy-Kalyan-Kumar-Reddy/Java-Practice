package Day5;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a) {
            case 1:
            System.out.println("hii");
            break;
            case 2:
            System.out.println("Kalyan");
            break;
            default:
            System.out.println("Not there input number");
            break;
        }
        sc.close();
    }
}