/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.*;

/**
 *
 * @author sasha
 */
public class UserDao {
    public static void save(User user){
        String query = "insert into user(name, surname, email, phone, position, password) values('"+user.getName()+"','"+user.getSurname()+"','"+user.getEmail()+"','"+user.getPhone()+"','"+user.getPosition()+"','"+user.getPassword()+"',')";
        DbOperations.setDataOrDelete(query, "Registered successfully!");
    }
}
