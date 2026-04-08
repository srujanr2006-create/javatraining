package JDBC;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class read {
    public static void main(String[] args) {
        try{
            Connection can = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "24042006rs"
            );
            String query="SELECT * FROM students";


            Statement stmt= can.createStatement();

            ResultSet rs = stmt.executeQuery(query);

           while (rs.next()){
               System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
           }
            can.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


