import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print((char) ('A' + (i % ('Z' - 'A' + 1))));
        }
        for (int i = 0; i < b; i++) {
            System.out.print((char) ('a' + (i % ('z' - 'a' + 1))));
        }
        for (int i = 0; i < c; i++) {
            System.out.print((char) ('0' + (i % ('9' - '0' + 1))));
        }
        for (int i = 0; i < n - a - b - c; i++) {
            System.out.print((char) ('B' + (i % ('Z' - 'A' + 1))));
        }
    }
}