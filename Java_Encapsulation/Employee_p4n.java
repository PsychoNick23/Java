package Java;

class Employee_p4n{

    String name[];
    double salary[];
    String designation[];
    int increment[];

    Employee_p4n(String[] Name, double[] Salary, String[] Designation,int[] Increment) {
        name = Name;
        salary = Salary;
        designation = Designation;
        increment=Increment;
    }

    void get_all_data(){

        int size = name.length;
        System.out.println("Sn.no. | Name | Salary | Designation | Increment");
        for (int i = 0; i < size; i++) {

            System.out.println(i+1+" | "+name[i]+" | "+(salary[i]+(salary[i]*increment[i]/100))+" | "+designation[i]+" | "+increment[i]+"%");

        }

    }






}
