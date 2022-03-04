package BackEnd;

public class PeopleAdapter implements PeopleGetter{

    private AdvancedPeopleGetter pg;

    public PeopleAdapter(People p){
        if(p.getClass() == Manager.class){
            pg = new ManagerGetter();
        }else if(p.getClass() == Employee.class){
            pg = new EmployeeGetter();
        }
    }

    @Override
    public int getId(People p) {
        
        if(pg.getClass() == ManagerGetter.class){
            return pg.getManagerId(p);
        }else if(pg.getClass() ==EmployeeGetter.class){
            return pg.getEmployeeId(p);
        }
        return -1;
    }

    @Override
    public String getName(People p) {
        if(pg.getClass() ==ManagerGetter.class){
            return pg.getManagerName(p);
        }else if(pg.getClass() ==EmployeeGetter.class){
            return pg.getEmployeeName(p);
        }
        return null;
    }

    @Override
    public String getTitle(People p) {
        if(pg.getClass() ==ManagerGetter.class){
            return pg.getManagerTitle(p);
        }else if(pg.getClass() ==EmployeeGetter.class){
            return pg.getEmployeeTitle(p);
        }
        return null;
    }
    
}
