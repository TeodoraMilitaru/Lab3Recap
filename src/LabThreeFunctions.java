/**
 * @author flo
 * @since 29/11/2016.
 */
public class LabThreeFunctions {

    public static void main(String[] args) {
        String hello = hello("Lab 4");
        say(hello);
    }

    // function
    public static String hello(String toWho) {
        return toWho  + " Hello!";
    }
    // procedure or method
    public static void say(String what) {
        System.out.println(what);
    }

}
