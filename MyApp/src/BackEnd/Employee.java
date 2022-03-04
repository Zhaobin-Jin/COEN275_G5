package BackEnd;


public class Employee extends People{

    public Employee(int id) {
        super(id);
    }

    public Employee(int id, String name){
        super(id, name);
    }

    public Employee(int id, String name, String title){
        super(id, name, title);
    }


    public void ChangeStatus(Task task, int status){
        //TODO
        if(true){
            return;
        }
        task.setStatus(status);
        return;
    }






}
