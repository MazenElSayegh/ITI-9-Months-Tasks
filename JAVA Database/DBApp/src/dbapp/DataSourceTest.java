package dbapp;


import java.sql.*;
import java.util.*;
import javax.sql.ConnectionEvent;
import java.sql.ResultSet;
import javax.sql.DataSource;
import java.sql.Statement;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
//import java.sql.Connection.createStatement;
import java.util.Properties;
import com.mysql.cj.jdbc.MysqlDataSource;

public class DataSourceTest{
    public static void main(String args[]){
        testDataSource();
    }
    private static void testDataSource(){
        DataSource ds=null;
        ds=MyDataSourceFactory.getMySQLDataSource();
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        try{
            con=(Connection) ds.getConnection();
            stmt=con.createStatement();
            rs=stmt.executeQuery("select Fname,Lname from employee");
            while(rs.next()){
                System.out.println("First Name: "+rs.getString("Fname")+"Last Name: "+rs.getString("Lname"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }}}
        
            