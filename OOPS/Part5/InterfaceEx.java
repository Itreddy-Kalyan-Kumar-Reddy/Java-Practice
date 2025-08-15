package OOPS.Part5;

interface Person{
    void talk();
}

class Student implements Person{
    public void talk(){
        System.out.println("Person is talking");
    }
}

public class InterfaceEx{

    public static void main(String[] args) {
        Student s = new Student();
        s.talk();
    }
}
