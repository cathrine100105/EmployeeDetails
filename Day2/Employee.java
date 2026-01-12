package Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String department;
    private boolean onLeave;

    static List<Employee> list = new ArrayList<>();

    public Employee(int employeeId,String employeeName,String department, boolean onLeave) {
        this.employeeId = employeeId;
        this.department=department;
        this.onLeave=onLeave;
        this.employeeName=employeeName;
    }

    public String toString(){
        return "ID: "+employeeId + "  NAME: " + employeeName +"  DEPARTMENT: " +department + "  EMPLOYEE ON LEAVE : " + onLeave;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*********************************************************");
        System.out.print("Enter the Department Name: ");
        String departmentName = scanner.nextLine();

        System.out.print("Do you want to know Employees on Leave?(true/false): ");
        boolean leaveStatus = scanner.nextBoolean();
        System.out.println("*********************************************************");

        list.add(new Employee(1,"Madhu","IT",true));
        list.add(new Employee(2,"Kani","HR",false));
        list.add(new Employee(3,"Lilli","IT",true));
        list.add(new Employee(4,"Mari","Marketing",false));
        list.add(new Employee(5,"Selvi","Engineering",true));

        boolean found= false;
        for(Employee details: list) {
            if (details.onLeave == leaveStatus && details.department.equalsIgnoreCase(departmentName)) {
                System.out.println(details);
                found = true;
            }
        }
        if(!found){
            System.out.println("Not Found!");
        }
        scanner.close();
    }
}
