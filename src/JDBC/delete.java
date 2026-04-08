package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class delete {
        public static void main(String[] args) {
            try{
                Connection can = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/testdb",
                        "root",
                        "24042006rs"
                );
                String query = "DELETE FROM students WHERE id=112 ";


                Statement stmt= can.createStatement();
                stmt.executeUpdate(query);


                can.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }




