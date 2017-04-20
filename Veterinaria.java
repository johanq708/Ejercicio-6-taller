/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.ArrayList;
/**
 *
 * @author johit
 */
public class Veterinaria {
    private ArrayList<Mascota> mv;

    public Veterinaria() {
        this.mv = new ArrayList<>();
    }
    
    public void adicionarmascota(Mascota m){
        mv.add(m);
    }
    
    public void eliminarmascota(Mascota m){
        mv.remove(m);
    }
    
    public void mostrarmascotas(){
        System.out.println("Todas las macostas de la veterinaria son:");
        for(int i=0;i<mv.size();i++){
            System.out.println(mv.get(i));
        }
    }
}
