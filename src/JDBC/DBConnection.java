package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DBConnection {
    public static void main(String[] args) {
        try{
            //step1
            Class.forName("com.mysql.cj.jdbc.Driver");

            //step2
            Connection can = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "24042006rs"
            );
            System.out.println("connected succesfully");
            can.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
