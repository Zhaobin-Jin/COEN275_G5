package Dao;
import JavaBean.Task;
import java.util.ArrayList;

public interface TaskDao {
    public ArrayList<Task> getAllTask();
    public Task getTask(int taskID);
    public void updateTask(Task task);
    public void deleteTask(Task task);
    public void createTask(Task task);
}
