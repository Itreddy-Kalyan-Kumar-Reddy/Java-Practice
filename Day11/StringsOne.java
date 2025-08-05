package Day11;

public class StringsOne {
    public static void main(String[] args) {
        String s = "Kalyan";// This is string in Literal way -|
                                                            //| - > This tw oreffers to String Litral
        String sdup = "Kalyan";//                            -|
        String s1 = new String("Kalyan Reddy");// This also string in New Object Way - |
        //                                                                                      | -> This Two refers to New Object 
        String s1dup = new String("Kalyan Reddy"); //                                - |
        System.out.println(s);  //   - |
        //                           - | - > This both stores in string pool and efers to same address
        System.out.println(sdup); // - |
        System.out.println(s1); //   - |
        //                           - | - > This both stroes in heap memory and refes to different addresses
        System.out.println(s1dup);// - |
        System.out.println(s.charAt(4));// If we want to pring spacific place character we wnts to use chatAt();
        StringBuffer sb = new StringBuffer("kalyan Reddy"); // This can make changes as like kalyan -> kaLYan & This supports multi-threading
        StringBuilder sbuild = new StringBuilder("Kalyan Reddy"); // This can make changes as like kalyan -> kaLYan & This not supports multi-threading
        System.out.println(sb);
        System.out.println(sbuild);
    }
}
