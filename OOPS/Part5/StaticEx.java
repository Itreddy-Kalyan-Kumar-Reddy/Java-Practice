package OOPS.Part5;

class Person{
    static String cityName;
    String name;
}

public class StaticEx {
    public static void main(String[] args) {
        Person.cityName = "Pattikonda";
        Person p1 = new Person();
        p1.name = "Kalyan";
        System.out.println(p1.name);
        Person p2 = new Person();
        p2.name = "Kumar";
        System.out.println(p2.cityName);
        System.out.println(p1.name+" Lives in "+p1.cityName);
        System.out.println(p2.name+" Lives in "+p2.cityName);
    }
}
