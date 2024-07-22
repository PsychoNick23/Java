package Java;

import java.util.Scanner;

public class Student {
    Scanner sc=new Scanner(System.in);
    String Name,RollNo,result="Pass";
    int JAVA,Cpp,Go,Ruby,Csrp,Python;


    void Student_details(){

        System.out.println("Enter your Name: ");
        Name=sc.next();
        System.out.println("Enter Roll No: ");
        RollNo=sc.next();

    }
    void Marks(){
        System.out.println("Enter Your JAVA Marks: ");
        JAVA=ensureMarks();
        System.out.println("Enter Your C++ Marks:");
        Cpp=ensureMarks();
        System.out.println("Enter Your Go Marks:");
        Go=ensureMarks();
        System.out.println("Enter Your Ruby Marks:");
        Ruby=ensureMarks();
        System.out.println("Enter Your C# Marks:");
        Csrp=ensureMarks();
        System.out.println("Enter Your Python Marks:");
        Python=ensureMarks();

    }

    int ensureMarks(){
        int x=0;
        while(true){
            x= sc.nextInt();
            if (x>=0&&x<=100){
                break;
            }
            System.out.println("Invalid Input!!! Enter a no between 0-100");
        }
        return x;
    }


    void displayMarks(){
        System.out.println("Java = "+JAVA+"/100"+result(JAVA));
        System.out.println("C++ = "+Cpp+"/100"+result(Cpp));
        System.out.println("Go = "+Go+"/100"+result(Go));
        System.out.println("Ruby = "+Ruby+"/100"+result(Ruby));
        System.out.println("C# = "+Csrp+"/100"+result(Csrp));
        System.out.println("Python = "+Python+"/100"+result(Python));
    }

    int total(){
        return JAVA+Cpp+Go+Ruby+Csrp+Python;
    }

    String result(int marks){
        if(marks>=40){
            return " P";
        }
        else{
            result="Fail";
            return " F";
        }
    }


    public static void main(String[] args) {
        Student obj=new Student();
        obj.Student_details();
        obj.Marks();
        System.out.println("Student Report Card");
        System.out.println("-------------------");
        System.out.println("Name: "+obj.Name);
        System.out.println("Roll Number: "+obj.RollNo);
        System.out.println();
        System.out.println("Marks:");
        obj.displayMarks();
        System.out.println();
        System.out.println("Total = "+obj.total()+"/600");
        System.out.println("Percentage = "+obj.total()*100/600+"%");
        System.out.println("Status: "+obj.result);
        System.out.println();

        //Grading System
        if(obj.total()>=480){
            System.out.println("Grade A");
        }
        else if(obj.total()>=360){
            System.out.println("Grade B");
        }
        else if (obj.total()>=240) {
            System.out.println("Grade C");
        }
        else if (obj.total()>=120) {
            System.out.println("Grade D");
        }

    }
}
