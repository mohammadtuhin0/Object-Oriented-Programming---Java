public class Course {
    String courseName;
    String courseCode;
    int courseCredit;

    public void updateCode(String name, String code, int credit){
        courseName = name;
        courseCode = code;
        courseCredit = credit;
    }
    public void displayCourse(){
        System.out.println("Course name " + courseName);
        System.out.println("Course code: " + courseCode);
        System.out.println("Course credit: " + courseCredit);
    }
}
