// Test.java
package OOPS.Part3.Packages;

import OOPS.Part3.Packages.myPrint.Print;

public class Test {
    public static void main(String[] args) {
        Print p = new Print();
        p.printME("Hello it's me");  // This is now valid
    }
}