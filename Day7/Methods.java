package Day7;

public class Methods {
    public static void/*return type*/ main/*main method*/(String[] args) {
        Methods m = new Methods();
        m.Hello();
        m.add(2, 5);
        m.add(3, 5);
        m.add(7, 9);
        int k = m.mul(2, 3);
        System.err.println(k);
    }
    void/*return type(void won't give any return type)*/ Hello/*new method*/(){
        System.out.println("Hello this is Method Calling");
    }
    void add(int a,int b) {
        System.out.println(a+b);
    }
    int mul(int a, int b){
        int x = a*b;
        return x;
    }
}