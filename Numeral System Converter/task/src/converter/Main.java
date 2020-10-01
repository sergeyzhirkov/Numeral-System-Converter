package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sourceRadix = scanner.nextInt();
        int sourceNumber;
        if (sourceRadix != 1) {
            sourceNumber = Integer.parseInt(scanner.next(), sourceRadix);
        } else {
            sourceNumber = scanner.next().length();
        }

        int targetRadix = scanner.nextInt();
        if (targetRadix==1){
            for (int i = 0; i < sourceNumber; i++) {
                System.out.print(1);
            }
        } else {
            System.out.println(Integer.toString(sourceNumber, targetRadix));
        }
    }
}
