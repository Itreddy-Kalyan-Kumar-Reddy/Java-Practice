package Day15;

import java.util.Scanner;

class Human{
    int age;
    String gender;
    String name;

    public void age(){
        System.out.println("The age is: "+age);
    }
    public void gender(){
        System.out.println("The gender is: "+gender);
    }
    public void name() {
        System.out.println("The name is: "+name);
    }

    public void inputData(Scanner sc) {
        System.out.println("Enter your age:");
        sc.nextInt();
        System.out.println("Enter your gender");
        sc.nextLine();
        System.out.println("Enter your name:");
        sc.nextLine();
    }
}

class Male extends Human{
    public void inputData(Scanner sc){
        System.out.println("Enter your age:");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Gender:");
        gender = sc.nextLine();
        System.out.println("Enter your name:");
        name = sc.nextLine();
    }
}

class Women extends Human{
    public void inputData(Scanner sc) {
        System.out.println("Enter your age:");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Gender:");
        gender = sc.nextLine();
        System.out.println("Enter your name:");
        name = sc.nextLine();
    }
}

public class InheritanceHierarchical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Male m = new Male();
        m.inputData(sc);
        Women w = new Women();
        w.inputData(sc);

        m.age();
        m.gender();
        m.name();
        w.age();
        w.gender();
        w.name();

        sc.close();
    }
}