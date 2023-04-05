package grades;
import java.util.HashMap;
import java.util.Scanner;
public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<String, Student>();

        Student Zakeria = new Student("Zakeria");
        Zakeria.addGrade(85);
        Zakeria.addGrade(90);
        Zakeria.addGrade(92);
        students.put("Zakeria123", Zakeria);

        Student bob = new Student("Bob");
        bob.addGrade(78);
        bob.addGrade(80);
        bob.addGrade(85);
        students.put("bob456", bob);

        Student Sam = new Student("Sam");
        Sam.addGrade(90);
        Sam.addGrade(92);
        Sam.addGrade(95);
        students.put("Sam789", Sam);

        Student diana = new
        Student("Diana");
        diana.addGrade(88);
        diana.addGrade(92);
        diana.addGrade(96);
        students.put("diana012", diana);

        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            // Print the list of GitHub usernames
            System.out.println("Welcome!\n" + "Here are the GitHub usernames of our students:\n");
            for (String username : students.keySet()) {
                System.out.println("| " + username + " |");
            }

            // Prompt the user for input
            System.out.print("\nEnter a GitHub username to see more information: ");
            userInput = scanner.nextLine();
            // Check if the user input matches a key in the map
            if (students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.println("\nName: " + student.getName());
                System.out.println("Github Username:" + userInput);
                System.out.printf("Average grade: %.2f\n\n", student.getAverageGrade());
            } else {
                System.out.println("\nSorry, no students with that GitHub username were found.\n");
            }

            // Ask the user if they want to continue
            System.out.print("Would you like to see another student? (y/n) ");
            userInput = scanner.nextLine();
        } while (userInput.equalsIgnoreCase("y"));

        System.out.println("\nGoodbye!");

        }
}
