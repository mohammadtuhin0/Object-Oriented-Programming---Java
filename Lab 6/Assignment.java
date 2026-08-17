
public class Assignment {
    int task ;
    String difficulty ;
    boolean submission;

    public void printDetails(){
        System.out.println("Number of task: " + task);
        System.out.println("Difficulty level: " + difficulty);
        System.out.println("Submission required: " + submission);
    }
    public String makeOptional(){
        submission = false;
        return "Assignment will not require submission";
    }
}
