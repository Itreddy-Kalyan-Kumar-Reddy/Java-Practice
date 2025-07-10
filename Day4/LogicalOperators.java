package Day4;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 22;
        int b = 11;
        System.out.println((a!=b)||(a==b));//True
        System.out.println((a>b)&&(a!=b));//True
        System.out.println((a!=b)&&(a==b));//False
    }
}