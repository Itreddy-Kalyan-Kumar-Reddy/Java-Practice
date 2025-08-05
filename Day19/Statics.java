package Day19;

//Static Variable - class Variable
//Static Method - class method
//A block of code can be static
//nested classes can be static

class Person{
    static String cityName;
    String name;
}

public class Statics {
    public static void main(String[] args) {
        Person.cityName = "Bengaluru";
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Kalyan";
        p2.name = "Kumar";
        System.out.println(p1.name+" lives in  "+ Person.cityName);
        System.out.println(p2.name+" lives in "+Person.cityName);
    }   
}