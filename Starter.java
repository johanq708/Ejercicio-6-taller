/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author Johan Quiñonez
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veterinaria v1=new Veterinaria();
        Persona p1=new Persona("juan",1001001);
        Persona p2=new Persona("andrea", 2002002);
        Perro pepe=new Perro("golden",1,"pepe","dorado");
        Gato mi=new Gato(false,2,"mota","blanco");
        Hamster tom=new Hamster(100,3,"tom","cafe");
        p1.adicionarmascota(pepe);
        p1.adicionarmascota(mi);
        p2.adicionarmascota(tom);
        v1.adicionarmascota(pepe);
        v1.adicionarmascota(mi);
        v1.adicionarmascota(tom);
        p1.mostarmascota();
        p2.mostarmascota();
    }
    
}
