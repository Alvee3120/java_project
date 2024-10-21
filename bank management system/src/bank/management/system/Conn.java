
package bank.management.system;


import java.sql.*;  

public class Conn{
    Connection c1;
    Statement s;
    public Conn(){  
        try{  
       
            c1 =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","12345");    
            s =c1.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  