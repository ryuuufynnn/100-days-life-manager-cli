import java.util.Scanner;
public class StudentMainTwo {
    // main class that controls program flow and handles user input
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String name;
        String course;
        String studentId;
        double gpa;

        System.out.print("Enter your name: ");
        name = inp.nextLine();
        System.out.print("Enter your course: ");
        course = inp.nextLine();
        System.out.print("Enter your student ID: ");
        studentId = inp.nextLine();
        System.out.print("Enter your GPA: ");
        gpa = inp.nextDouble();

        // create StudentInfo object using constructor
        StudentInfo studentInfo = new StudentInfo(name, course, studentId, gpa);

        // display student information (don't use static)
        studentInfo.displayInfo();
       //studentInfo.checkGpaStatus(gpa);
        
        // scanner close
        inp.close();
    } 
}
