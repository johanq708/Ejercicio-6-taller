/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.ArrayList;
/**
 *
 * @author Johan Quiñonez
 */
public class Persona {
    private String nombre;
    private int cedula;
    private ArrayList<Mascota> mp;

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.mp = new ArrayList<>();
    }
    
    public void adicionarmascota(Mascota m){
        mp.add(m);
    }
    
    public void mostarmascota(){
        System.out.println(nombre+" tiene "+mp.size()+" mascotas y estas son:");
        for(int i=0;i<mp.size();i++){
            System.out.println((i+1)+". "+mp.get(i));
        }
    }
}
