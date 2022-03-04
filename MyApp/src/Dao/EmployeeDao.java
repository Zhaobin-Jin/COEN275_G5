package Dao;
import JavaBean.Employee;
import java.util.ArrayList;

public interface EmployeeDao<Empolyee> {
    public ArrayList<Empolyee> getAllEmpolyee();
    public Empolyee getEmpolyee(int empolyID);
    public void updateEmpolyee(Empolyee empolyee);
    public void deleteEmpolyee(Empolyee empolyee);
    public void createEmpolyee(Empolyee empolyee);
}
