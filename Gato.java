/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author Johan Daniel Quiñonez Ruiz
 */
public class Gato extends Mascota{
    private boolean cazador;

    public Gato(boolean cazador, int id, String nombre, String color) {
        super(id, nombre, color);
        this.cazador = cazador;
    }
    public String escazador(){
        if(cazador==true){
            return "es cazador";
        }else{
            return "no es cazador";
        }
    }

    @Override
    public String toString() {
        return "El gato" + super.toString()+ " y " + this.escazador();
    }
    
}
