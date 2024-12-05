package Emolyee;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
public class EmpMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        Emp_Dao doa=new Emp_Dao();
        Emp_Pojo em=new Emp_Pojo();
        Scanner scanner=new Scanner(System.in);


        while (true) {
            System.out.println("Select Any one Option");

            System.out.println("1: Display");
            System.out.println("2: Insert");
            System.out.println("3: Update");
            System.out.println("4: Delete");
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    List<Emp_Pojo> allemp = doa.getAllemp();
                    System.out.println("Employee ID  | Employee Name  | Employee Salary ");
                    System.out.println("      -----------------------        ");
                    for (Emp_Pojo o : allemp) {
                        System.out.println(o);
                    }
                    break;
                case 2:
                    System.out.println("Enter Employee ID");
                    int id = scanner.nextInt();
                    System.out.println("Enter the Employee Name");
                    String Name = scanner.next();
                    System.out.println("Enter the Employee Salary ");
                    int Salary = scanner.nextInt();
                    em.setEmpname(Name);
                    em.setSalary(Salary);
                    em.setEmpid(id);
                    doa.save(em.Employee(em));

                    break;
                case 3:
                    System.out.println("Update The Details");
                    System.out.println("Enter the Id Where You want to Update");

                    int idserch = scanner.nextInt();
                    em.setEmpid(idserch);
                    System.out.println("Enter The Name");
                    String name = scanner.next();
                    System.out.println("Enter the Salary");
                    int sal=scanner.nextInt();
                    em.setSalary(sal);
                    em.setEmpname(name);
                    doa.updateEmp(em.Employee(em));
                    break;
                case 4:
                    System.out.println("Enter the Id what detail you want to deleate");
                    int ids=scanner.nextInt();
                    em.setEmpid(ids);
                    doa.deleteEmp(em.Employee(em));
                    break;
            }
        }
    }
}
