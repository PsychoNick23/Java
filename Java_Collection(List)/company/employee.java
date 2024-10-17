package company;

public class employee {
    int EmpId;
    String EmpName;
    double Salary;

    public employee(int empId, String empName, double salary) {
        super();
        this.EmpId = empId;
        this.EmpName = empName;
        this.Salary = salary;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "EmpId=" + EmpId +
                ", EmpName='" + EmpName + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
