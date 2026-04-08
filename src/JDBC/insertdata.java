package JDBC;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class insertdata {
    public static void main(String[] args) {
        try{
            Connection can = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "24042006rs"
            );
            String query="INSERT INTO students(is, name, age) VALUES (121, 'sujith', 25)";


            Statement stmt= can.createStatement();

            int rows = stmt.executeUpdate(query);

            System.out.println(rows+ "row Inserted!");
            System.out.println("connected succesfully");
            can.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
