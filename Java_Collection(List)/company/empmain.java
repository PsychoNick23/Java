package company;
import java.util.*;

public class empmain {
    ;

    static Scanner sc = new Scanner(System.in);

    static char ifContinue(String option){
        System.out.println("Do you want to continue "+option+" ? ");
        char ans=sc.next().charAt(0);
        return ans;
    }

    static void operations(){
        System.out.println("1:INSERT");
        System.out.println("2:DISPLAY");
        System.out.println("3:SEARCH");
        System.out.println("4:UPDATE");
        System.out.println("5:DELETE");
        System.out.println("6:SORT");
        System.out.println("7:EXIT");

    }

    static class employeeId implements Comparator<employee>
    {
        @Override
        public int compare(employee arg1,employee arg2){
            return arg1.EmpId- arg2.EmpId;
        }
    }

    static class employeeName implements Comparator<employee>
    {
        @Override
        public int compare(employee arg1,employee arg2){
            return (int)(arg1.EmpName.compareTo(arg2.EmpName));
        }
    }


    static class employeeSalary implements Comparator<employee>
    {
        @Override
        public int compare(employee arg1,employee arg2){
            return arg1.EmpId- arg2.EmpId;
        }
    }


    public static void main(String[] args) {
        List<employee> emp=new ArrayList<employee>();

        int option;
        do {
            operations();
            System.out.println("Select an operation to perform: ");
            option = sc.nextInt();


            switch (option) {

                case 1:
                    char result;
                    do {

                        System.out.println("Enter Employee Id: ");
                        int EmpId = sc.nextInt();
                        System.out.println("Enter Employee Name");
                        String EmpName = sc.next();
                        System.out.println("Enter Employee Salary");
                        double Salary = sc.nextDouble();
                        emp.add(new employee(EmpId, EmpName, Salary));

                        result = ifContinue("Insert");

                    }
                    while (result == 'Y' || result == 'y');

                    break;

                case 2:
//                  Display
//                    for (employee r :emp) {
//
//                        // Printing the list
//                        System.out.println(r);
//                    }

                    Iterator<employee> itr = emp.iterator();
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    break;

                case 3:
                    System.out.println("Enter Employee Id to search: ");
                    int searchId=sc.nextInt();
                    for (employee r :emp) {
                        if(r.getEmpId()==searchId){
                            System.out.println(r);
                        }

                    }

                    break;

                case 4:
//                  Update
                    System.out.println("Enter Employee Id to update: ");
                    int empIdToUpdate = sc.nextInt();

                    Iterator<employee> itr1 = emp.iterator();
                    while (itr1.hasNext()) {
                        employee up = itr1.next();
                        if (up.getEmpId() == empIdToUpdate) {
                            System.out.println("Enter new Employee Name: ");
                            String newName = sc.next();
                            up.setEmpName(newName);
                            System.out.println("Enter new Salary: ");
                            double newSalary = sc.nextDouble();
                            up.setSalary(newSalary);
                            System.out.println("Employee record updated successfully!");
                            break;
                        }
                    }
                    break;


                case 5:
                    System.out.println("Enter Employee Id to delete");
                    int empno = sc.nextInt();

//                    ListIterator<employee>ob=emp.listIterator();

                    Iterator<employee> itr2 = emp.iterator();

                    while (itr2.hasNext()) {
                        employee ob = itr2.next();
                        if (ob.getEmpId() == empno) {
                            emp.remove(ob);
                            System.out.println("Record deleted successfully ! ! !");
                            break;
                        }
                    }

                case 6:
                    int options;
                    System.out.println("1: Sort using Employee Id ");
                    System.out.println("2: Sort using Employee Name");
                    System.out.println("3: Sort using Employee Salary");

                    System.out.println("Select an option: ");
                    options= sc.nextInt();
                    switch(options){

                        case 1 :
                            Collections.sort(emp,new employeeId());
                            System.out.println(emp);
                            break;

                        case 2:
                            Collections.sort(emp,new employeeName());
                            System.out.println(emp);
                            break;

                        case 3:
                            Collections.sort(emp,new employeeSalary());
                            System.out.println(emp);
                            break;
                    }


            }
        }
        while(option!=7);
    }
}