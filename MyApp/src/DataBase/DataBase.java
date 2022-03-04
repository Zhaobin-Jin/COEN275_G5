package DataBase;
import java.sql.*;

public class DataBase {
    private static DataBase instance = null;
    private Connection connection = null;

    //create private constructor
    private DataBase() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/smsdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root","root");
                System.out.println("Successfully Created Connection");
            } catch (Exception e) {
                e.printStackTrace();

            }
            try {
                createTable("employee", DBConst.CREATE_TABLE_EMPLOYEE, connection);
                createTable("manager", DBConst.CREATE_TABLE_MANAGER, connection);
                createTable("task", DBConst.CREATE_TABLE_TASK, connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
    public static DataBase getInstance() {
        if(instance == null) {
            instance = new DataBase();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    private void createTable(String tableName, String tableQuery, Connection connection) throws SQLException {
        Statement sqlStatement;
        //Grab the database meta data
        DatabaseMetaData md = connection.getMetaData();
        //Grab if the table exists in the database
        ResultSet result = md.getTables(null, null, tableName, null);
        //if I have a next value (the table exists, otherwise it does not)
        if(result.next()) {
            System.out.println( tableName + " Table already exists");
        } else {
            sqlStatement = connection.createStatement();
            sqlStatement.execute(tableQuery);
            System.out.println("The " + tableName + " table has been inserted");
        }
    }

}
