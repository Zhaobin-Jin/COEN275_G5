package BackEnd;

public class main {
    public static void main(String[] args) {
        Manager e1 = new Manager(100, "Mr. Po", "Employee");
        PeopleAdapter pa = new PeopleAdapter(e1);
        System.out.println(pa.getTitle(e1));

    }
}
