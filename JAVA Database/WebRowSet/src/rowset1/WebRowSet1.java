/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rowset1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

/**
 *
 * @author Mazen
 */
public class WebRowSet1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
      
        WebRowSet web = RowSetProvider.newFactory().createWebRowSet();
        web.setUrl("jdbc:mysql://localhost:3306/intake43");  
        web.setUsername("root");  
        web.setPassword("Desouki79&(");
        web.setCommand("select * from employee1");  
        web.execute(); 
        FileOutputStream out = new FileOutputStream("employeelist.xml");
        web.writeXml(out);
    }
    
}
