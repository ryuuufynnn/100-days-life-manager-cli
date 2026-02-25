import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Create a list to store multiple students
        ArrayList<StudentThirteen> students = new ArrayList<>();

        // Start the menu system
        menu(inp, students);

        // Close scanner when program ends
        inp.close();
    }

    public static void menu(Scanner inp, ArrayList<StudentThirteen> students) {
        int option;
        boolean isRunning = true; // controls the loop

        while (isRunning) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update GPA");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");

            System.out.print("Enter Option: ");
            option = inp.nextInt();
            inp.nextLine(); // clear buffer after nextInt()

            switch (option) {
                case 1:
                    // Create new student and add to list
                    StudentThirteen newStudent = addStudent(inp);
                    students.add(newStudent);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    // Call method to update a student's GPA
                    updateStudentGpa(inp, students);
                    break;
                case 3:
                    // Display all students inside the list
                    displayAllStudents(students);
                    break;
                case 4:
                    // Stop the loop and exit program
                    System.out.println("Thank You!");
                    isRunning = false;
                    break;
                default:
                    // If user enters invalid number
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    public static StudentThirteen addStudent(Scanner inp) {
        String name;
        String course;
        String studentId;
        double gpa;

        // Ask user for student details
        System.out.print("Enter your Name: ");
        name = inp.nextLine();

        System.out.print("Enter your Course: ");
        course = inp.nextLine();

        System.out.print("Enter your Student ID: ");
        studentId = inp.nextLine();

        System.out.print("Enter your GPA: ");
        gpa = inp.nextDouble();
        inp.nextLine(); // clear buffer

        // Return a new Student object
        return new StudentThirteen(name, course, studentId, gpa);
    }

    public static void updateStudentGpa(Scanner inp, ArrayList<StudentThirteen> students) {

        // Ask for student ID to update
        System.out.print("Enter Student ID to update: ");
        String studentId = inp.nextLine();

        // Ask for new GPA
        System.out.print("Enter new GPA: ");
        double newGpa = inp.nextDouble();
        inp.nextLine(); // clear buffer

        // Loop through the list to find matching student
        for (StudentThirteen student : students) {

            // Check if ID matches
            if (student.getStudentId().equals(studentId)) {
                student.setGpa(newGpa); // update GPA
                System.out.println("GPA updated successfully!");
                return; // stop searching once found
            }
        }

        // If no student matched the ID
        System.out.println("Student not found.");
    }

    public static void displayAllStudents(ArrayList<StudentThirteen> students) {

        // Check if list is empty
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        // Loop through all students and display their info
        for (StudentThirteen student : students) {
            student.displayInfo();
            System.out.println();
        }
    } 
}