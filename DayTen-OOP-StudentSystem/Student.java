public class Student {
    String name;
    String studentId;
    String course;
    double gpa;
    
    // constractor
    public Student(String name, String studentId, String course, double gpa) {
        this.name = name; // rightside parameter - leftside object variabe
        this.studentId = studentId;
        this.course = course;
        this.gpa = gpa;
    } public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gpa);
    }
}


// constractor has access modifier, class name, and no return type (void, double, int, String etc.)\
// normal method has access modifier, mrthod name, and return type.
