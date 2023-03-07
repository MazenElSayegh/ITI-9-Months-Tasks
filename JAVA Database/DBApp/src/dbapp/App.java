package dbapp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java .util.Properties;

public class App{
    public static void main(String[] args){
        Properties prop = new Properties();
        OutputStream output=null;
        try{
            output=new FileOutputStream("db.properties");
            prop.setProperty("MYSQL_DB_URL","jdbc:mysql://localhost:3306/intake43");
            prop.setProperty("MYSQL_DB_USERNAME","root");
            prop.setProperty("MYSQL_DB_PASSWORD","Desouki79&(");
            prop.store(output,null);
        }catch(IOException io){
            io.printStackTrace();
        }finally{
            if(output!=null){
                try{
                    output.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}