public class Employee {
    String name;
    double salary = 30000;
    String designation = "junior";

    public void newEmployee(String name) {
        this.name = name;
        salary = 30000;
        designation = "junior";
    }

    public void calculateTax() {
        if (salary > 50000) {
            salary = salary - (salary * 0.30);
        }
        else if (salary >= 30000){
            salary = salary - (salary * 0.10);
        }
    }

    public void promoteEmployee(String newDesignation) {
        designation = newDesignation;

        if(newDesignation.equals("senior")) {
            salary += 25000;
        }
        else if(newDesignation.equals("lead")){
            salary += 50000;
        }
        else if(newDesignation.equals("manager")) {
            salary += 75000;
        }
    }

    public void displayInfo(){
        System.out.println("Employee name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Designation: " + designation);
    }
}