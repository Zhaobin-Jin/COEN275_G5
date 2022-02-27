package BackEnd;


public class Employee {
    private int id;
    private String name;
    private String title;

    public Employee(){
        //TODO
    }

    public Employee(String name){
        this.name = name;
        //TODO
    }

    public Employee(String name, String title){
        this.name = name;
        this.title = title;
        //TODO
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getTitle(){
        return this.title;
    }

    public void setName(String name){
        //TODO
        this.name = name;
        return;
    }

    public void setTitle(String title){
        //TODO
        this.title = title;
        return;
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
