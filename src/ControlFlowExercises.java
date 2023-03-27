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
        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }
//        refactor 1b while loop
        for (int num = 2; num < 1000000; num *= num) {
            System.out.println(num * num);
        }

    }
}
