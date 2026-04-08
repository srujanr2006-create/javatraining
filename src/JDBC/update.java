package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update {
    public static void main(String[] args) {
        try{
            Connection can = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "24042006rs"
            );
            String query = "UPDATE students SET age==25 WHERE id=111";


            Statement stmt= can.createStatement();
            stmt.executeUpdate(query);


            can.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


