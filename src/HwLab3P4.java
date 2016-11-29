import java.util.Scanner;

/**
 * @author flo
 * @since 29/11/2016.
 */
public class HwLab3P4 {

    public static void main(String[] args) {

        int n = readIntFromKeyboard();

        int sum = 0;
        int product = 1;
        for(int i = 1; i<= n; i++) {
            int v = readIntFromKeyboard();
            System.out.println(v);
            sum += v;
            product *= v;
        }
        System.out.println("Sum is: " + sum);
        System.out.println("Product is " + product);
    }

    public static int readIntFromKeyboard() {
        return Integer.valueOf(new Scanner(System.in).nextLine());
    }
}
