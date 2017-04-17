/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author johit
 */
public class Perro extends Mascota{
    private String raza;

    public Perro(String raza, int id, String nombre, String color) {
        super(id, nombre, color);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "El perro" + super.toString() + " y es de raza " + raza;
    }
    
}
