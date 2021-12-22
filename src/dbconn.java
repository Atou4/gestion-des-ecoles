
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class dbconn {
    static String username="root"; 
    static String password="";
    static String con_string="jdbc:mysql://localhost/loginform";
    static Connection con=null;
    
    

    public  static Connection ConnectDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(con_string,username,password);
            System.out.println("Connected");
            
       
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e);
            System.out.println("notConnected");
            return null;
        }}

 
 }
    

