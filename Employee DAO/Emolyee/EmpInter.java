package Emolyee;
import java.sql.SQLException;
import java.util.*;
public interface EmpInter {

    public int save(Emp_Pojo e);
    public List <Emp_Pojo> getAllemp() throws SQLException, ClassNotFoundException;
    public Emp_Pojo getEmp(int empno);
    public void updateEmp(Emp_Pojo e);
    public void deleteEmp(Emp_Pojo e);
}
