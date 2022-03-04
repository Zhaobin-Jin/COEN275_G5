package BackEnd;

import java.util.Date;

public class Task {
    private int id;
    private String des;
    private int status;
    private int pri;
    private Date DDL;

    public Task(){
        //TODO
    }

    public Task(String des){
        this.des = des;
        //TODO
    }

    public Task(String des, int status, int pri, Date ddl){
        this.des = des;
        this.status = status;
        this.pri = pri;
        this.DDL = ddl;
        //TODO
    }

    public int getId(){
        return this.id;
    }

    public String getDes(){
        return this.des;
    }

    public int getStatus(){
        return this.status;
    }

    public int getPri(){
        return this.pri;
    }

    public Date getDDL(){
        return this.DDL;
    }

    public void setDes(String des){
        this.des = des;
        //TODO
    }

    public void setStatus(int status){
        this.status = status;
        //TODO
    }

    public void setPri(int pri){
        this.pri = pri;
        //TODO
    }

    public void setDDL(Date DDL){
        this.DDL = DDL;
        //TODO
    }

    public void addPeople(){
        //TODO
    }

}
