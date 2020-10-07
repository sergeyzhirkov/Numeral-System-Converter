package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radixSource = scanner.nextInt();
        String numberSource = scanner.next();
        int radixTarget = scanner.nextInt();
        System.out.println(converter(numberSource, radixSource, radixTarget));
    }

    public static String converter(String numberSource, int radixSource, int radixTarget) {
        if (numberSource.contains(".")) {
            StringBuilder res = new StringBuilder();
            String[] split = splitInputLine(numberSource);
            res.append(convertDecNumber(convertNumberToDec(split[0], radixSource), radixTarget));
            res.append(".");
            res.append(convertFractionalDecToTargetRadix(convertFractionalToDec(split[1], radixSource), radixTarget));
            return res.toString();
        }
        return convertDecNumber(convertNumberToDec(numberSource, radixSource), radixTarget);
    }

    public static String convertDecNumber(int numberDec, int radix) {
        if (radix == 1) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < numberDec; i++) {
                res.append("1");
            }
            return res.toString();
        }
        return Long.toString(numberDec, radix);
    }

    public static int convertNumberToDec(String number, int radix) {
        if (radix == 1) {
            return number.split("").length;
        }
        return Integer.parseInt(number, radix);
    }

    public static String[] splitInputLine(String input) {
        return input.trim().split("\\.");
    }

    public static double convertFractionalToDec(String number, int radix) {
        double num = 0;
        String[] split = number.split("");
        for (int i = 0; i < split.length; i++) {
            num += Integer.parseInt(split[i], radix) / (Math.pow(radix, i + 1));
        }
        return num;
    }

    public static String convertFractionalDecToTargetRadix(double number, int radixTarget) {
        StringBuilder fractPart = new StringBuilder(5);
        double n1 = number * radixTarget;
        for (int i = 0; i < 5; i++) {
            int n2 = (int) n1;
            fractPart.append(String.valueOf(convertDecNumber(n2, radixTarget)));
            n1 = (n1 - n2) * radixTarget;
        }
        return fractPart.toString();
    }
}
