public class Employee extends Person{
    static int numOfEmployee;
    int salary;
     
    Employee(String first, String last, int salary){
        super(first,last);
        this.salary=salary;
        numOfEmployee++;

    }

    void showSalary(){
        System.out.println(this.first + " " + this.last + " Salary: " +this.salary);
    }
    static void showNumOfEmployee(){
        System.out.println("Number of Employee: " + numOfEmployee);
    }
}
