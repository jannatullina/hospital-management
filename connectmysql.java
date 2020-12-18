
package hospitalmanagement;

import java.sql.*;
import java.util.Scanner;


public class connectmysql {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public connectmysql()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hospital?"+"user=root");
            st = con.createStatement();
            
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
    public void getData()
    {
        try{
            String query = "SELECT * from price_list";
            rs = st.executeQuery(query);
            while(rs.next()){
                System.out.println("ID: " + rs.getString("Id"));
                System.out.println("Test list : " + rs.getString("Test_list"));
                System.out.println("price list : " + rs.getString("price_list"));
                
                
            }
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
    
    public void insertData()
    {
        
        try{
            Scanner sc = new Scanner(System.in);
         
            System.out.println("Test list :");
            String Test_list =sc.nextLine();
            System.out.println("price list :");
            String price_list = sc.nextLine();
            
            st.executeUpdate("INSERT INTO price_list(Test_list,price_list) VALUES('"+Test_list+"','"+price_list+"')");
            System.out.println("Values Added Succesfully!!");
            
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
    
    public void upDate()
    {
        
        try{
            Scanner sc = new Scanner(System.in);
         
            System.out.println("Test list :");
            String Test_list=sc.nextLine();
            System.out.println("price list :");
            String price_list = sc.nextLine();
            st.executeUpdate("UPDATE price_list SET price_list = '"+price_list+"'WHERE Test_list ='"+Test_list+"'");
            System.out.println("Values Update Succesfully!!");
            
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
    public void delete()
    {
        
        try{
            Scanner sc = new Scanner(System.in);
         
            System.out.println("Test list :");
            String Test_list=sc.nextLine();
           
            st.executeUpdate("DELETE FROM price_list WHERE Test_list ='"+Test_list+"'");
            System.out.println("Values Delete Succesfully!!");
            
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
}
