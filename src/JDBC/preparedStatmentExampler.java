package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class preparedStatmentExampler {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "24042006rs"
            );
            String query="INSERT INTO students(is, name, age) VALUES (? , ? , ?)";


           PreparedStatement ps= con.prepareStatement(query);

           ps.setInt(1,101);
           ps.setString(2,"sujith");
           ps.setInt(3,95);
            System.out.println("data inserted successfully");


        }catch(Exception e){
            System.out.println(e);
        }
    }
}

