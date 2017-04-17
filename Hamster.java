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
public class Hamster extends Mascota{
    private double peso;

    public Hamster(double peso, int id, String nombre, String color) {
        super(id, nombre, color);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "El hamster" + super.toString() + " y pesa " + peso;
    }
    
}
