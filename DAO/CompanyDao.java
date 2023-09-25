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
public class CompanyDao {
    public static void register(Company company){
        String query = "insert into company(name, nip, address, city, zipcode, country) values('"+company.getName()+"','"+company.getNip()+"','"+company.getAddress()+"','"+company.getCity()+"','"+company.getZipCode()+"','"+company.getCountry()+"',')";
        DbOperations.setDataOrDelete(query, "Registered successfully!");
    }
}
