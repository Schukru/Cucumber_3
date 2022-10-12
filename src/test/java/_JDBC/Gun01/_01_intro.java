package _JDBC.Gun01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_intro {

    @Test
    public void test1() throws SQLException {

        String url="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila"; //hotstname,port,db adını (user db)
        String username="root"; //username
        String password="'\"-LhCB'.%k[4S]z";

        Connection connection= DriverManager.getConnection(url, username, password);
        Statement statement=connection.createStatement();
        ResultSet rs=statement.executeQuery("select * from actor");

        rs.next();

        String ad=rs.getString("first_name");
        String soyad=rs.getString("last_name");

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

        rs.next();

        ad=rs.getString("first_name");
        soyad=rs.getString("last_name");

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);

        connection.close();

    }

}
