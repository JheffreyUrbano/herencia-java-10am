/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Jurbano
 */
import Modelo.Personaje;
import Modelo.Paladin;
import Modelo.Ranger;
import Vista.VistaCombate;

public class ControladorCombate {

    // atributos
    private Personaje[] grupo;
    private VistaCombate Vista;

    public ControladorCombate(Personaje[] grupo, VistaCombate Vista) {
        this.grupo = grupo;
        this.Vista = Vista;
    }

    public void ejecutarRonda() {

        Vista.mostrarInicioDeCombate();
        
        // Polimorfismo
        for (Personaje p : grupo) {
            
            String accion = p.realizarAtaque();
            Vista.mostrarAtaque(p.getNombre(), accion);
        }
        
    }

}
