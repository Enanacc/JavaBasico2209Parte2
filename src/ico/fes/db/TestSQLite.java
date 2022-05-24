/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.db;


import java.sql.*;

/**
 *
 * @author vania
 */
public class TestSQLite {
    public static void main(String[] args) {
        Connection conexion= null;
        try {
            String url="jdbc:sqlite:" + System.getProperty("user.dir") +"/poo2022.db";
            conexion = DriveManager.getConnection(url);
            System.out.println("Conexion establecida...");
            Statement stm= conexion.createStatement();
            stm.execute("CREATE TABLE prueba1(nombre VARCHAR(10) , telefono VARCHAR(15) ) ;"); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
