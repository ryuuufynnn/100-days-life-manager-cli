import java.util.ArrayList;
import java.util.Scanner;

public class StudentAppFourTeen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // create a list to store multiple students
        ArrayList<StudentFourTeen> students = new ArrayList<>();

        // start the menu system
        menu(inp, students);

        // scanner close
        inp.close();

    } public static void menu(Scanner inp, ArrayList<StudentFourTeen> students) {
        int option;
        boolean isRunning = true; // controls the loop

        while(isRunning) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student.");
            System.out.println("2. Update GPA.");
            System.out.println("3. Display All Students.");
            System.out.println("4. Exit.");

            System.out.print("Enter Option: ");
            option = inp.nextInt();
            inp.nextLine();

            switch(option) {
                case 1: 
                    // create a new student and add to the list of the students
                    StudentFourTeen newStudent = addStudent(inp);
                    students.add(newStudent);
                    System.out.println("Student added successfully!");
                    break;
                case 2: 
                    // call method to update a student's GPA
                    updateStudentGpa(inp, students);
                    break;
                case 3: 
                    // display all of the students
                    displayAllStudents(students);
                    break;
                case 4:
                    System.out.println("Thank You!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    isRunning = true;
            }
        }

        

    } public static StudentFourTeen addStudent(Scanner inp) {
        String name;
        String course;
        String studentId;
        double gpa;

        System.out.print("Enter your name: ");
        name = inp.nextLine();
        System.out.print("Enter your course: ");
        course = inp.nextLine();
        System.out.print("Enter your Studetnt ID: ");
        studentId = inp.nextLine();

        System.out.print("Enter your new GPA: ");
        gpa = inp.nextDouble();
        inp.nextLine(); // clear buffer

        return new StudentFourTeen(name, course, studentId, gpa);

    } public static void updateStudentGpa(Scanner inp, ArrayList<StudentFourTeen> students) {
        String studentId;
        double gpa;

        System.out.print("Enter your Student ID: ");
        studentId = inp.nextLine();
        System.out.print("Enter your gpa: ");
        gpa = inp.nextDouble();
        inp.nextLine(); // clear buffer

        for(StudentFourTeen student : students) {

            if(student.getStudentId().equals(studentId)) {
                student.setGpa(gpa);
                System.out.println("GPA updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");

    } public static void displayAllStudents(ArrayList<StudentFourTeen> students) {

        if(students.isEmpty()) {
            System.out.println("No student found.");
            return;
        }

        for(StudentFourTeen student : students) {
            student.displayInfo(); // method to display students
            System.out.println(); // new line
        }
    }
}