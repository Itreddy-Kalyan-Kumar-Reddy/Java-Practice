package Day4;

public class BitWiseOperators {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        System.out.println(a&b);//and in bitwise
        System.out.println(a|b);//or in bitwise
        System.out.println(a>>b);//right shift(the a value modves to right{4->0100 --> shifts to 0001 after two times})
        System.out.println(a<<b);//left shift(the a value modves to left{4->00100 --> shifts to 10000 after two times})
    }
}