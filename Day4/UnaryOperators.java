package Day4;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        // a++; //post-incriment
        // System.out.println(a);//2
        // ++a; //pre-incriment
        // System.out.println(3);//3
        // a--; //post-decriment
        // System.out.println(a);//2
        // --a; //pre-decriment
        // System.out.println(a);//1
        System.out.println(--a+b);//5
        System.out.println((a--)+b);//5
    }   
}