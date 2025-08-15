package Day19;

//All fields are public, static and final by default
//All methods are public and abstract by default
//Interfaces support multiple inheritance

interface Person{
    void talk();
}

class Student implements Person{
    public void talk(){
        System.out.println("Hello this is interfaces");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Student s = new Student();
        s.talk();
    }
}