// package Day15;

// class Man{
//     int age;
//     String name;

//     public void age() {
//         System.out.println("Age of the man: "+age);
//     }

//     public void name() {
//         System.out.println("Name of the men: "+name);
//     }
// }

// class Father extends Man{
    
// }

// class Child extends Man{

// }

// class GrandChild extends Man{

// }

// public class InheritanceMultilevel {
//     public static void main(String[] args) {
//         Father f = new Father();
//         Child c = new Child();
//         GrandChild g = new GrandChild();
//         f.age();
//         f.name();
//         c.age();
//         c.name();
//         g.age();
//     }
// }

package Day15;
import java.util.Scanner;

class Man { // Class names usually start with an uppercase letter
    int age;
    String name;

    public void showAge() { // Changed method name to avoid conflict with property 'age'
        System.out.println("Age of the man: " + age);
    }

    public void showName() { // Changed method name to avoid conflict with property 'name'
        System.out.println("Name of the man: " + name);
    }

    // This method can be overridden if needed
    public void inputData(Scanner sc) {
        System.out.println("Enter age:");
        age = sc.nextInt();
        sc.nextLine(); // Clear the buffer
        System.out.println("Enter name:");
        name = sc.nextLine();
    }
}

class Father extends Man { // Class name starts with uppercase letter
    @Override
    public void inputData(Scanner sc) {
        System.out.println("Enter father's age:");
        age = sc.nextInt();
        sc.nextLine(); // Clear the buffer
        System.out.println("Enter father's name:");
        name = sc.nextLine();
    }
}

class Child extends Man { // Class name starts with uppercase letter
    @Override
    public void inputData(Scanner sc) {
        System.out.println("Enter child's age:");
        age = sc.nextInt();
        sc.nextLine(); // Clear the buffer
        System.out.println("Enter child's name:");
        name = sc.nextLine();
    }
}

class GrandChild extends Man { // Class name starts with uppercase letter
    @Override
    public void inputData(Scanner sc) {
        System.out.println("Enter grandchild's age:");
        age = sc.nextInt();
        sc.nextLine(); // Clear the buffer
        System.out.println("Enter grandchild's name:");
        name = sc.nextLine();
    }
}

public class InheritanceMultilevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Father f = new Father(); // Instantiate with the corrected class name
        f.inputData(sc);

        Child c = new Child(); // Instantiate with the corrected class name
        c.inputData(sc);

        GrandChild g = new GrandChild(); // Instantiate with the corrected class name
        g.inputData(sc);

        f.showAge(); // Call the corrected method name
        f.showName(); // Call the corrected method name
        c.showAge(); // Call the corrected method name
        c.showName(); // Call the corrected method name
        g.showAge(); // Call the corrected method name
        g.showName(); // Call the corrected method name

        sc.close();
    }
}