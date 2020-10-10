import java.util.Scanner;

class Iteration {
    private  Scanner scanner = new Scanner(System.in);

    public  void iter() {
        String inputString;
        while (!(inputString = scanner.nextLine()).equals("0")) {
            System.out.println(new Validate(inputString).toNewString());
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Iteration it = new Iteration();
        it.iter();
    }
}

class Validate {
    private String input;

    public Validate(String input) {
        this.input = input;
    }

    public String toNewString() {
        try {
            return Integer.toString(Integer.parseInt(input) * 10);
        } catch (Exception e) {
            return String.format("Invalid user input: %s", input);
        }
    }
}