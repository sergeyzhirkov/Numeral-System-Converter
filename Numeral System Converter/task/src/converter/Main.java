package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int radix = scanner.nextInt();
        String prefix = new String();

        if (radix == 2) {
            prefix = "0b";
        } else if (radix == 8) {
            prefix = "0";
        } else if (radix == 16) {
            prefix = "0x";
        }
        System.out.println(prefix + Long.toString(number, radix));
    }
}
