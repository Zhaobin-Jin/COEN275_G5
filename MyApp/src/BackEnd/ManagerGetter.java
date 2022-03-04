package BackEnd;

public class ManagerGetter implements AdvancedPeopleGetter{

    //doing nothing
    @Override
    public int getEmployeeId(People p) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public String getEmployeeName(People p) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getEmployeeTitle(People p) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public int getManagerId(People p) {
        return p.getId();
    }

    @Override
    public String getManagerName(People p) {
        // TODO Auto-generated method stub
        return p.getName();
    }

    @Override
    public String getManagerTitle(People p) {
        // TODO Auto-generated method stub
        return p.getTitle();
    }
    
}
