package JavaBean;

public interface AdvancedPeopleGetter {
    public int getEmployeeId(People p);
    public String getEmployeeName(People p);
    public String getEmployeeTitle(People p);

    public int getManagerId(People p);
    public String getManagerName(People p);
    public String getManagerTitle(People p);
}
