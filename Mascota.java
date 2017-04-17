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
public class Mascota {
    protected int id;
    protected String nombre;
    protected String color;

    public Mascota(int id, String nombre, String color) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
    }

    @Override
    public String toString() {
        return " se llama " + nombre + ", es de color " + color;
    }
    
}
