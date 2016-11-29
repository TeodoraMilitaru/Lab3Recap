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
        int max = 0;
        for(int i = 1; i<= n; i++) {
            int v = readIntFromKeyboard();
            System.out.println(v);
            sum += v;
            product *= v;
            if(v > max) {
                max = v;
                System.out.println("New max is " + v);
            }
        }
        System.out.println("Sum is: " + sum);
        System.out.println("Product is " + product);
        System.out.println("Max is " + max);
    }

    public static int readIntFromKeyboard() {
        return Integer.valueOf(new Scanner(System.in).nextLine());
    }
}
