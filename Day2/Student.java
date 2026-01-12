package Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private String department;
    private boolean present;

    static List<Student> list = new ArrayList<>();

    public Student(int studentId,String studentName,String department,boolean present) {
        this.studentName=studentName;
        this.department = department;
        this.present=present;
        this.studentId=studentId;
    }
    public String toString(){
        return "Student Id is " +studentId+ " and the Student Name is "+ studentName+ " He studies the Department of " +department +" She is "+ present+" In the Class.";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("************************");
        System.out.print("Enter the Student name :");
        String input = scanner.nextLine();
        System.out.println("*************************");



        list.add(new Student(1,"Alice","BioMaths",true));
        list.add(new Student(2,"Bob","Arts",false));
        list.add(new Student(3,"Cathrine🤷‍♀️","BioMaths",true));
        list.add(new Student(4,"David","Nursing",false));
        list.add(new Student(5,"Emma","Commerse",false));

        boolean found= false;
        for (Student detail : list) {
            if (detail.studentName.equalsIgnoreCase(input)) {
                System.out.println("Student Details" + detail);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Student not Found");
        }

        System.out.println("***************************");
        System.out.print("Student Present/Not: ");
        boolean present=scanner.nextBoolean();
        System.out.println("***************************");
        for (Student detail : list) {
            if (detail.present==present && detail.department=="Arts") {
                System.out.println("Student Details" + detail);
            }
        }
            if(!found) {
                System.out.println("Student not Found");
            }

        scanner.close();
    }

}
