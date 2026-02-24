import java.util.Scanner;
public class StudentMainThree {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // create an StudentClass object.
        StudentClass student = getUserInfo(inp);

        // calling the other method on StudentClass.
        student.displayInfo();
        updateGpa(inp, student);
        
        // scanner close
        inp.close();

    } public static StudentClass getUserInfo(Scanner inp) {
        String name;
        String course;
        String studentId;
        double gpa;

        System.out.print("Enter your Name: ");
        name = inp.nextLine();
        System.out.print("Enter your Course: ");
        course = inp.nextLine();
        System.out.print("Enter your Student ID: ");
        studentId = inp.nextLine();
        System.out.print("Enter your GPA: ");
        gpa = inp.nextDouble();
        inp.nextLine();
        return new StudentClass(name, course, studentId, gpa);

    } public static void updateGpa(Scanner inp, StudentClass student) {
        String update;

        System.out.print("Do you want to update your GPA? (yes/no): ");
        update = inp.nextLine();

        switch(update.toLowerCase()) {
            case "yes":
                System.out.print("Enter your new GPA: ");
                double gpa = inp.nextDouble();
                inp.nextLine();
                System.out.println("\nUpdated User's Information.");
                // calling other method
                student.setGpa(gpa);
                student.displayInfo();
                // print the gpa & gpa status
                System.out.println("GPA: " + gpa);
                System.out.println("GPA Status: " + student.checkGpaStatus());
                break;
            case "no": 
                break;
            default: 
                System.out.println("Invalid input. Please try again.");
        }
        
    }
}