import java.util.Scanner;


public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("You: ");
            input = scanner.nextLine();
            String response = getResponse(input);
            System.out.println("Bob: " + response);
        } while (!input.isEmpty());

        scanner.close();
    }

    public static String getResponse(String input) {
        if (input.endsWith("?")) {
            return "Sure.";
        } else if (input.endsWith("!")) {
            return "Whoa, chill out!";
        } else if (input.trim().isEmpty()) {
            return "Fine. Be that way!";
        } else {
            return "Whatever.";
        }
    }
}
