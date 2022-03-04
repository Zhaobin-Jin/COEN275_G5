package BackEnd;

public class People {
    private int id;
    private String name;
    private String title;

    public People(int id){
        this.id = id;
        //TODO
    }

    public People(int id, String name){
        this.id = id;
        this.name = name;
        //TODO
    }

    public People(int id, String name, String title){
        this.id = id;
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


}
