/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import javax.swing.JOptionPane;

/**
 *
 * @author sasha
 */
public class tables {
    public static void main(String[] args){
        try{
            String userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200), surname varchar(200), email varchar(200), phone varchar(20), position varchar(200), password varchar(200), UNIQUE(email))";
            DbOperations.setDataOrDelete( userTable, "User table created successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
