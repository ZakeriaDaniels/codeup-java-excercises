import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        1a while loop
//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + "");
//            i++;
//        }

//        1b do while
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);
//        int i = 100;

//        altered to count backwards
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);
//        int i = 2;

//        do while
//        do {
//            System.out.println(i * i);
//            i++;
//        } while (i * i < 1000000);

//refactor 1a while loop to for loop
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }
//        refactor 1b while loop
//        for (int num = 2; num < 1000000; num *= num) {
//            System.out.println(num * num);
//        }

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter an integer: ");
            num = input.nextInt();

            System.out.println("Number  Square  Cube");
            System.out.println("------  ------  ----");

            for (int i = 1; i <= num; i++) {
                int square = i * i;
                int cube = i * i * i;
                System.out.println(i + "\t" + square + "\t" + cube);
            }

            System.out.print("Do you want to continue? (y/n): ");
        } while (input.next().equalsIgnoreCase("y"));

//        number 4
        int grade;

        do {
            System.out.print("Enter a numerical grade (0-100): ");
            grade = input.nextInt();

            if (grade >= 88 && grade <= 100) {
                System.out.println("Letter grade: A");
            } else if (grade >= 80 && grade <= 87) {
                System.out.println("Letter grade: B");
            } else if (grade >= 67 && grade <= 79) {
                System.out.println("Letter grade: C");
            } else if (grade >= 60 && grade <= 66) {
                System.out.println("Letter grade: D");
            } else {
                System.out.println("Letter grade: F");
            }
            System.out.print("Do you want to continue? (y/n): ");
        } while (input.next().equalsIgnoreCase("y"));

    }

}
