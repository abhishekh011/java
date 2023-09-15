/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class JDBC {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll");
        String r=sc.nextLine();
        System.out.println("Enter Name");
        String n=sc.nextLine();
        System.out.println("Enter City");
        String c=sc.nextLine();
        
//        String name="Abhisheak";
//        String email="abhi@gmail.com";
//        String pass="1234";
//        String gender="Male";
//        String city="M.P";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class Load");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
            //PreparedStatement ps=con.prepareStatement("insert into student values('piyush','piyush@gmail.com','piyush123','male','indore')");
            PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
            ps.setString(1, r);
            ps.setString(2, n);
            ps.setString(3, c);
//            ps.setString(4, gender);
//            ps.setString(5, city);
            int i=ps.executeUpdate();
            if(i>0){
                System.out.println("success");
            }
            else{
                System.out.println("false");
            }
             } catch (ClassNotFoundException ex) {
            System.out.println("Class not found");
        }
         catch (Exception ex) {
             
            }
    }
    
}
