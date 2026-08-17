public class Assignment {
    int assTask ;
    String assDifficulty ;
    boolean assSubmission;

    public void printDetails(int task, String difficulty, boolean submission){
        assTask = task;
        assDifficulty = difficulty;
        assSubmission = submission;
    }
    public void printDisplay(){
        System.out.println("Number of Tasks: " + assTask);
        System.out.println("Difficulty level: " + assDifficulty);
        System.out.println("Submission required: " + assSubmission);
    }
}
