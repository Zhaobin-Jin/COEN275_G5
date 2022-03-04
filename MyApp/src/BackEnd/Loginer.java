package BackEnd;

public class Loginer {
    private String username;
    private String password;

    public Loginer(){
        
    }
    
    public Loginer(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username){
        this.username = username;
        return;
    }

    public void setPassword(String password){
        this.password = password;
        return;
    }
    public boolean isValid(){
        //TODO
        return true;
    }

    public void add(){
        //TODO
        return;
    }
}
