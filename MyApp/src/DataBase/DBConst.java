package DataBase;



public class DBConst {


    //Create a constant for each of the table and column names
    public static final String TABLE_EMPLOYEE = "employee";
    public static final String EMPLOYEE_COLUMN_ID = "id";
    public static final String EMPLOYEE_COLUMN_FNAME = "first_name";
    public static final String EMPLOYEE_COLUMN_LNAME = "last_name";
    public static final String EMPLOYEE_COLUMN_TITLE = "title";

    public static final String TABLE_MANAGER = "manager";
    public static final String MANAGER_COLUMN_ID = "id";
    public static final String MANAGER_COLUMN_FNAME = "first_name";
    public static final String MANAGER_COLUMN_LNAME = "last_name";
    public static final String MANAGER_COLUMN_TITLE = "title";

    public static final String TABLE_TASK = "task";
    public static final String TASK_COLUMN_ID = "id";
    public static final String TASK_COLUMN_DES = "des";
    public static final String TASK_COLUMN_STATUS = "status";


   
    public static final String CREATE_TABLE_EMPLOYEE =
            "CREATE TABLE " + TABLE_EMPLOYEE + " (" +
                    EMPLOYEE_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " +
                    EMPLOYEE_COLUMN_FNAME + " VARCHAR(50), " +
                    EMPLOYEE_COLUMN_LNAME + " VARCHAR(50), " +
                    EMPLOYEE_COLUMN_TITLE + " VARCHAR(50), " +
                    "PRIMARY KEY(" + EMPLOYEE_COLUMN_ID + ")" +
                    ");";

    public static final String CREATE_TABLE_MANAGER =
            "CREATE TABLE " + TABLE_MANAGER + " (" +
                    MANAGER_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " +
                    MANAGER_COLUMN_FNAME + " CHAR(17) NOT NULL, " +
                    MANAGER_COLUMN_LNAME + " VARCHAR(25), " +
                    MANAGER_COLUMN_TITLE + " VARCHAR(50), " +
                    "PRIMARY KEY(" + MANAGER_COLUMN_ID +")" +
                    ");";

    
    public static final String CREATE_TABLE_TASK =
            "CREATE TABLE " + TABLE_TASK + " (" +
                    TASK_COLUMN_ID + " int NOT NULL AUTO_INCREMENT, " +
                    TASK_COLUMN_DES + " DATE, " +
                    TASK_COLUMN_STATUS + " VARCHAR(255), " +
                    "PRIMARY KEY(" + TASK_COLUMN_ID +")" +
                    ");";


}
