package company;
import java.util.*;

public class empmain {
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
        System.out.println("6:EXIT");

    }

    public static void main(String[] args) {


        int option;
        do {
            operations();
            System.out.println("Select an operation to perform: ");
            option = sc.nextInt();


            switch (option) {

                case 1:
                    char result;
                    do {
                        List<employee> emp=new ArrayList<employee>();
                        System.out.println("Enter Employee Id: ");
                        int EmpId = sc.nextInt();
                        System.out.println("Enter Employee Name");
                        String EmpName = sc.next();
                        System.out.println("Enter Employee Salary");
                        double Salary=sc.nextDouble();
                        emp= Collections.singletonList(new employee(EmpId, EmpName, Salary));

                        result = ifContinue("Insert");
                        for (employee r :emp) {

                            // Printing the list
                            System.out.println(r);
                        }
                    }
                    while (result=='Y'||result=='y');

                    break;

                case 2:

                    break;

                case 3:
                    System.out.println("SEARCH");
                    break;

                case 4:
                    System.out.println("UPDATE");

                    break;

                case 5:
                    System.out.println("DELETE");


            }

        }
        while(option!=6);
    }

}
