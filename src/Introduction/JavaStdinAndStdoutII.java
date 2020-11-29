package Introduction;

import java.util.Scanner;

public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double d = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();

        System.out.printf("String: %s%n", input);
        System.out.printf("Double: %f%n", (d));
        System.out.printf("Int: %d%n", n);

    }
}
