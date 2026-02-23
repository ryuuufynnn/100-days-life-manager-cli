// StudentInfo class represents a student object
public class StudentInfo {
     // instance variables (attributes of a student)
    String name;
    String studentId;
    String course;
    double gpa;
    // constructor initializes student data
    public StudentInfo(String name, String course, String studentId, double gpa) {
        this.name = name;   // assign parameter to instance variable
        this.course = course;
        this.studentId = studentId;
        this.gpa = gpa;

        // Method that determines GPA status and returns result
    } public String checkGpaStatus() {
        if (gpa <= 1.75) {
            return "Dean's Lister";
        } else if (gpa <= 2.5) {
            return "Regular Student";
        } else {
            return "Needs Improvement";
    }
    
    // method that displays student information
    } public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + gpa);

        // calls checkGpaStatus method to display GPA classification
        System.out.println("GPA Status: " + checkGpaStatus());
    }
}
