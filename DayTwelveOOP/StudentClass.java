public class StudentClass {
    String name;
    String course;
    String studentId;
    double gpa;
        // constractor
        public StudentClass(String name, String course, String studentId, double gpa) {
            this.name = name;
            this.course = course;
            this.studentId = studentId;
            this.gpa = gpa;
        } public void displayInfo() {
            System.out.println("Name: " + name.toUpperCase());
            System.out.println("Course: " + course.toUpperCase());
            System.out.println("Student ID: " + studentId);
            System.out.println("GPA: " + gpa);

            System.out.println("GPA Status: " + checkGpaStatus());
    } public String checkGpaStatus() {
        if(gpa <= 1.75) {
            return "Dean's Lister";
        } else if(gpa <= 2.5) {
            return "Regular Student.";
        } else if(gpa <= 3.0) {
            return "Needs Improvement.";
        }else{
            return "Failed.";
        }
    } public void setGpa(double gpa) {
        this.gpa = gpa;
    } public void updatedGpa() {
            System.out.println("Name: " + name.toUpperCase());
            System.out.println("Course: " + course.toUpperCase());
            System.out.println("Student ID: " + studentId);
    }
}