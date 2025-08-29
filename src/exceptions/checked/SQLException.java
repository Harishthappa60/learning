package exceptions.checked;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLException {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url="jdbc:oracle:thin:@localhost:1521:XE";
            String user="SYSTEM";
            String password="SYSTEM";
            Connection con= DriverManager.getConnection(url,user,password);
            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery("Select * from Account");

            while (rs.next()){
                System.out.println(rs.getInt("id")+rs.getString("name"));
            }
            rs.close();
            stmt.close();
            con.close();


        }catch (java.sql.SQLException | java.lang.ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
