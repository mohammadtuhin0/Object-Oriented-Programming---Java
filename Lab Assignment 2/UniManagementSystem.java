abstract class Person{
    private String name;
    private String id;
    private String email;

    public Person(String name, String id, String email){
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public abstract void  displayDetails();

    public void introduce(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
    }
}
// 2. Student Class

class Student extends Person{
    private String department;
    private double cgpa;

    public Student(String name, String id, String email, String department, double cgpa){
        super(name, id, email);
        this.department = department;
        this.cgpa = cgpa;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }

    public double getCgpa(){
        return cgpa;
    }
    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }

    // method overriding
    @Override 
    public void displayDetails(){
        System.out.println("----- Student Details -----");
        System.out.println("Name : " + getName());
        System.out.println("ID : " + getId());
        System.out.println("Email : " + getEmail());
        System.out.println("Department : " + getDepartment());
        System.out.println("CGPA : " + getCgpa());
    }
    // method overloading
    public void displayDetails(String format) {
        if(format.equalsIgnoreCase("short")) {
            System.out.println("Name : " + getName());
            System.out.println("ID : " + getId());
        } else if(format.equalsIgnoreCase("full")){
            displayDetails();
        } else{
            System.out.println("Invalid format!");
        }
    }
}
// 3. Teacher Class

interface Payable{
    double calculatePayment();
}

class Teacher extends Person implements Payable{
    private String designation;
    private double salary;

    public Teacher(String name, String id, String email, String designation, double salary) {
        super(name, id, email);
        this.designation = designation;
        this.salary = salary;
    }
    @Override 
    public void displayDetails(){
        System.out.println("----- Teacher Details -----");
        System.out.println("Name : " + getName());
        System.out.println("ID : " + getId());
        System.out.println("Email : " + getEmail());
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
    }

    @Override 
    public double calculatePayment() {
        return  salary;
    }
}


public class UniManagementSystem {
    public static void  validateCGPA(double cgpa){
        if(cgpa < 0 || cgpa > 4){
            throw new IllegalArgumentException(
                "Invalid CGPA! CGPA must be between 0 and 4."
            );
        }
    }
    public static void main(String[] args) {
        // cgpa validation
        double cgpa1 = 3.75;
        double cgpa2 = 3.50;

        try{
            validateCGPA(cgpa1);
            validateCGPA(cgpa2);

            System.out.println("CGPA validation successful.");
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // Student Object
        Student student1 = new Student(
            "Tuhin",
            "52",
            "md.tuhin42525@gmail.com",
            "CSE",
            cgpa1
        );

        Student student2 = new Student(
            "Mamun",
            "78",
            "mamun@gmail.com",
            "CSE",
            cgpa2
        );

        // Teacher Objects

        Teacher teacher1 = new Teacher(
            "Rakib Sir",
            "T-101",
            "rakibsir@gmail.com",
            "Lecturer",
            50000
        );

        Teacher teacher2 = new Teacher(
            "Firoz Sir",
            "T-102",
            "firozalmamun@gmail.com",
            "Lecturer",
            60000
        );

        // Student Details
        student1.displayDetails();
        System.out.println();
        student1.displayDetails("short");
        System.out.println();
        student1.displayDetails("full");

        // Teacher Details 
        System.out.println();
        teacher1.displayDetails();
        System.out.println();
        System.out.println("Teacher Payment: " + teacher1.calculatePayment());

        // introduce() method 
        System.out.println();
        System.out.println("--- Introduction ---");
        student1.introduce();
        System.out.println();
        teacher1.introduce();

        // Runtime Polymorphism
        System.out.println();
        System.out.println("--- Runtime Polymorphism ---");
        Person person;
        person = student1;
        person.displayDetails();
        System.out.println();

        person = teacher1;
        person.displayDetails();

        // Array of Person Objects
        System.out.println();
        System.out.println("--- Array of Objects ---");
        Person[] people = new Person[4];

        people[0] = student1;
        people[1] = student2;
        people[2] = teacher1;
        people[3] = teacher2;

        for(int i = 0; i < people.length; i++) {
            people[i].displayDetails();
            System.out.println();
        }
        // Invalid CGPA Test
        System.out.println("--- Exception Handling ---");
        try{
            validateCGPA(4.5);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }    
}
