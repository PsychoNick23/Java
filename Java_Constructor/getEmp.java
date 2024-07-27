package Java;

public class getEmp {
    public static void main(String[] args) {
        Employee emp=new Employee(20000,"Nishant");
        System.out.println("Emp Name: "+emp.get_salary());
        System.out.println("Emp Name: "+emp.get_name());
        System.out.println();

        emp.set_salary(25000);
        System.out.println("Emp Name: "+emp.get_salary());
        System.out.println("Emp Name: "+emp.get_name());
    }
}
