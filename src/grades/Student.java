package grades;
import java.util.ArrayList;
public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getAverageGrade() {
        if (this.grades.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return (double) sum / this.grades.size();
    }

    public int getHighestGrade() {
        if (this.grades.size() == 0) {
            return 0;
        }
        int maxGrade = this.grades.get(0);
        for (int i = 1; i < this.grades.size(); i++) {
            int grade = this.grades.get(i);
            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }
        return maxGrade;
    }
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(92);
        System.out.println(student1.getName() + "'s average grade is " + student1.getAverageGrade());
        System.out.println(student1.getName() + "'s highest grade is " + student1.getHighestGrade());

        Student student2 = new Student("Bob");
        student2.addGrade(78);
        student2.addGrade(80);
        student2.addGrade(85);
        student2.addGrade(90);
        System.out.println(student2.getName() + "'s average grade is " + student2.getAverageGrade());
        System.out.println(student2.getName() + "'s highest grade is " + student2.getHighestGrade());
    }
}
