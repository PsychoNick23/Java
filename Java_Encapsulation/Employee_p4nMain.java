package Java;

public class Employee_p4nMain {
    public static void main(String[] args) {

        String name1[] = {"joy","nishant","alok","omji"};
        double salary1[] = {45000,78000,90000,125000};
        String designation1[] = {"ios","HR","Tech","CA"};
        int increment1[] = {2,5,7,10};


        Employee_p4n emp1 = new Employee_p4n(name1,salary1,designation1,increment1);
        emp1.get_all_data();
    }
}
