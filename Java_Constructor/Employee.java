package Java;

public class Employee {
    int salary;
    String name;
    int[] data;

    Employee(int Salary, String Name){
        salary=Salary;
        name=Name;
    }
    int get_salary(){
        return salary;
    }
    String get_name(){
        return name;
    }

    void set_salary(int Salary1){
        salary=Salary1;
    }

    void set_name(String Name1){
        name=Name1;
    }
}
