/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.modelo;

import ico.fes.herencia.Persona;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author vania
 */
public class ModeloPersonaCombo implements ComboBoxModel<Persona>{
   private ArrayList<Persona> datos;
   private Persona selected;

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList datos, String selected) {
        this.datos = datos;
        this.selected = selected;
    }

    public ArrayList getDatos() {
        return datos;
    }

    public void setDatos(ArrayList datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selected = (Persona)o;     
    }

    @Override
    public Object getSelectedItem() {
        return selected;    
    }

    @Override
    public int getSize() {
        //regresara el numero de elementos a mostrar
        return datos.size();
    }

    @Override
    public Persona getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener ll) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener ll) {
        
    }
   
    public void consultarBaseDatos(){
        //simular una consulta de datos
        datos=new ArrayList<Persona>();
        //conextiarn a bd
        //consulta SQL
        datos.add(new Persona("Jose", 19));
        datos.add(new Persona("Maria", 21));
        datos.add(new Persona("Jesus", 33));
        datos.add(new Persona("Diana", 22));
    }
}
