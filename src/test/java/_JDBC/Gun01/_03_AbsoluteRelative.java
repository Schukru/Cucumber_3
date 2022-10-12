package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelative extends JDBCParent {

    @Test
    public void test1() throws SQLException {

        ResultSet rs=statement.executeQuery("select * from film");

        rs.absolute(10);
        String title=rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(15);
        title=rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(-15);
        title=rs.getString("title");
        System.out.println("title = " + title);

        rs.relative(5);
        title=rs.getString("title");
        System.out.println("title = " + title);

        rs.relative(-5);
        title=rs.getString("title");
        System.out.println("title = " + title);

        rs.last();
        int satir=rs.getRow();
        System.out.println("satir = " + satir);


    }
}
