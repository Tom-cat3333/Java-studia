package DAO;

import Model.*;
import javax.swing.JOptionPane;
import java.sql.*;

public class UserDao {
    public static void save(User user){
        String query = "insert into user(name, surname, email, phone, position, password) values('"+user.getName()+"','"+user.getSurname()+"','"+user.getEmail()+"','"+user.getPhone()+"','"+user.getPosition()+"','"+user.getPassword()+"',')";
        DbOperations.setDataOrDelete(query, "User created successfully!");
    }
    
    public static User login (String email, String pswd){
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("select * from user where email='"+email+"' and password='"+pswd+"'");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
}
