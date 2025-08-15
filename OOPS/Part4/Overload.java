package OOPS.Part4;

class shape{
    void findArea(double r){
        double a = 3.14*r*r;
        System.out.println(a);
    }

    void findArea(int l,int b){
        double a  = l*b;
        System.out.println(a);
    }
}

public class Overload {
    public static void main(String[] args) {
        shape s = new shape();
        s.findArea(3);
        s.findArea(3, 4);
    }
}
