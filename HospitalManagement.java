
package hospitalmanagement;



import java.util.Scanner;
import java.util.InputMismatchException;
import java.sql.*;

public class HospitalManagement {


    
    public static void main(String[] args) {
       
        
        System.out.println(" Hospital Management ");
       
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Log in \n1.Admin\n2.Exit");
            int option = input.nextInt();
            if(option == 1) {
                
                    Scanner input2 = new Scanner(System.in);
            System.out.println("\n1.Add Test\n2.Test List \n3.Update Test Peice\n4.Delete Test");
            int option1 = input2.nextInt();
            switch (option1) {
                case 1:
                    connectmysql con = new connectmysql();
                    con.insertData();
                    continue;
                case 2:
                    connectmysql cec = new connectmysql();
                    cec.getData();
                    continue;
                case 3:
                    connectmysql coc = new connectmysql();
                    coc.upDate();
                    continue;    
                case 4:
                    connectmysql com = new connectmysql();
                    com.delete();
                    continue;    
                
                default:
                    System.out.println(" wrong option.");
                    break ;
            } 
            System.out.println("\n....Completee!!...\n");
                    break ;
            }
            
            
                   
            
            else if(option ==2)
            {
                System.out.println("\n Thank You\n");
                break;
            }
        }
        
        
    }
    
}
