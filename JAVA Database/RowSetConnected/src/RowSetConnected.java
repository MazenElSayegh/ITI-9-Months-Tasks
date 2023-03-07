


import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author Mazen
 */
public class RowSetConnected {

   
    public static void main(String[] args) throws SQLException {
        RowSetFactory rowSetFactory= RowSetProvider.newFactory();
        JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet(); 
        rowSet.setUrl("jdbc:mysql://localhost:3306/intake43");  
        rowSet.setUsername("root");  
        rowSet.setPassword("Desouki79&(");
       
        rowSet.setCommand("select * from employee");  
        rowSet.execute();  
        while (rowSet.next()) {  
                         
                        System.out.print( "ID="+ rowSet.getString(1) +"   ");  
                        System.out.print( "first name:"+ rowSet.getString(2)+ "   last name:");  
                        System.out.println( rowSet.getString(3));  
                }
    }
    
}
