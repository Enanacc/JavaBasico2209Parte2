/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.db;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vania
 */
public class TestSQLite {
        public static void main(String[] args) {
        Connection conexion = null;
        try {
            @@ -20,14 +20,20 @@ public static void main(String[] args) {
            System.out.println("Conexión establecida...");
            Statement stm = conexion.createStatement();
            //stm.execute("CREATE TABLE prueba1(nombre VARCHAR(10) , telefono VARCHAR(15) );");
            //stm.execute(" INSERT INTO prueba1 VALUES('Diana','4455677')");

            ResultSet rst= stm.executeQuery("SELECT *FROM prueba1;");

             stm.execute(" INSERT INTO prueba1 VALUES('Diana','4455677')");
            while (rst.next()) {
                System.out.println("Nombre: " + rst.getString(1));
                System.out.println("Telefono: " + rst.getString(2));

            }

             /*Nota: BD*/
             
            //stm.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }       catch (SQLException ex) {
                Logger.getLogger(TestSQLite.class.getName()).log(Level.SEVERE, null, ex);
            }

}
