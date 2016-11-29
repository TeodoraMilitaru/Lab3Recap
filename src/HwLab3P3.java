/**
 * @author flo
 * @since 29/11/2016.
 */
public class HwLab3P3 {

    public static void main(String[] args) {

        int n = HwLab3P4.readIntFromKeyboard();
        int m = HwLab3P4.readIntFromKeyboard();

        if(n % m == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        boolean x = n % m == 0;
        System.out.println(x);


        int min, max;
        if( n < m) {
            min = n;
            max = m;
        } else {
            min = m;
            max = n;
        }
        for(int i = min ;i< max ;i++) {
            System.out.print(i + ",");
        }
        System.out.print(max);
       // checkParity(n, m);

//        checkParity2(n, m);

    }

    private static void checkParity2(int n, int m) {
        if(n % 2 == 0 && m % 2 == 0) {
            System.out.println("Both are even.");
        } else {
            if(n % 2 == 1 && m % 2 == 1) {
                System.out.println("Both are odd");
            } else {
                System.out.println("One is event the other is isn't.");
            }
        }
    }

    public static void checkParity(int n, int m) {
        if(n % 2 == 0) {
            if(m % 2 == 0) {
                System.out.println("Both even.");
            } else {
                System.out.println("One is even the other isn't");
            }
        } else {
            if(m % 2 == 1) {
                System.out.println("Both odd");
            } else {
                System.out.println("One is even the other is odd");
            }
        }
    }
}
