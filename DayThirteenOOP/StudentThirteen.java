public class StudentThirteen {
    private String name;
    private String course;
    public String studentId;
    private double gpa;
    public StudentThirteen(String name, String course, String studentId, double gpa) {
        this.name = name;
        this.course = course;
        this.studentId = studentId;
        this.gpa = gpa;
    } public void displayInfo() {
        System.out.println("--- Student List ---");
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student GPA: " + gpa);

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
    } public String getStudentId() {
        return studentId;
    }
}
