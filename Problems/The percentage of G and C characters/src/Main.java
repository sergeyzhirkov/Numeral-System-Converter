import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        int countC = (" " + s + " ").split("c").length - 1;
        int countG = (" " + s + " ").split("g").length - 1;
        System.out.println((double) (countC + countG) / s.length() * 100);
    }
}