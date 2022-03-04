package JavaBean;

public class EmployeeGetter implements AdvancedPeopleGetter{


    @Override
    public int getEmployeeId(People p){
        return p.getId();
    }

    @Override
    public String getEmployeeName(People p){
        return p.getName();
    }

    @Override
    public String getEmployeeTitle(People p){
        return p.getTitle();
    }


    //do nothing
    @Override
    public int getManagerId(People p){
        return -1;
    }

    @Override
    public String getManagerName(People p){
        return null;
    }

    @Override
    public String getManagerTitle(People p){
        return null;
    }

}
