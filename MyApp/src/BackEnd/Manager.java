package BackEnd;

public class Manager extends People{

    public Manager(int id) {
        super(id);
    }

    public Manager(int id, String name) {
        super(id, name);
    }

    public Manager(int id, String name, String title){
        super(id, name, title);
    }

    public void assign(Task task, Employee employee){
        //TODO
    }

    public void delete(Task task, Employee employee){
        //TODO
    }
}
