/*
package com.example.web_ordinario_u2.utils;

import java.sql.DriverManager;

public class Connection {
    public static java.sql.Connection getConnection(){
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/examen_4b","root", "root");
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        java.sql.Connection conexion = Connection.getConnection();
        if (conexion != null) {
            System.out.println("eres cabron");
        }else {
            System.out.println("nel pastel");
        }
    }
}
*/
