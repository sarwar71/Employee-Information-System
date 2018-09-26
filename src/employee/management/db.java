package employee.management;

import java.sql.*;
import javax.swing.*;

public class db {

    Connection con = null;

    public static Connection java_db() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:E:\\SUST-CSE\\Development\\Employee Management\\mydatabase.sqlite");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
