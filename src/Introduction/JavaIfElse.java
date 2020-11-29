package Introduction;

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String numIs = "";
        if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                numIs = "Not Weird";
            } else if (n >= 6 && n <= 20) {
                numIs = "Weird";
            } else if (n > 20) {
                numIs = "Not Weird";
            }
        } else {
            numIs = "Weird";
        }
        System.out.println(numIs);
    }
}
