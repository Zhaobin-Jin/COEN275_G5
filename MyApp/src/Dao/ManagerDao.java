package Dao;
import JavaBean.Manager;
import java.util.ArrayList;

public interface ManagerDao {
    public ArrayList<Manager> getAllManager();
    public Manager getManager(int managerID);
    public void updateManager(Manager manager);
    public void deleteManager(Manager manager);
    public void createManager(Manager manager);
}
