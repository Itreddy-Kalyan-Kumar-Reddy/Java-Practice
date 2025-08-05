package Day14;

public class Constructors {
    int i;
    char j;

    Constructors(){ //This is default constructor
        System.out.println("This is creating new object");//Thsi calls on everytime when we create objects
    }

    Constructors(int i){//This is calling int parameters i na constructor
        System.out.println("This is parameterised constructor");
        this.i = i;
    }
    Constructors(char k){//This is calling char parameters i na constructor
        System.out.println("This is parameterised constructor");
        j=k;
    }
    Constructors(int i, char k){//This is calling int,char parameters i na constructor
        System.out.println("This is parameterised constructor");
        this.i=i;
        j=k;
    }

    public static void main(String[] args) {
        Constructors t = new Constructors();// This is object creating 1
        Constructors u = new Constructors();// This is object creating 2
        Constructors v = new Constructors();// This is object creating 3
        Constructors x = new Constructors();// This is object creating 4
        Constructors a = new Constructors(25);// This is object creating 5
        System.out.println(a.i);
        Constructors l = new Constructors('k');
        System.out.println(l.j);
        Constructors m = new Constructors(25,'s');
        System.out.println(m.i);
        System.out.println(m.j);
    }
}
