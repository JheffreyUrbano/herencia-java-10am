/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.simuladordnd;

/**
 *
 * @author Jurbano
 */
import Modelo.*;
import Vista.VistaCombate;
import Controlador.ControladorCombate;

public class SimuladorDND {

    public static void main(String[] args) {
        System.out.println("Simulador DND");

        // Inicializar el modelo.
        Personaje explorador = new Ranger("simon", 15);
        Personaje guerrero = new Paladin("tatiana", 28);
        Personaje Profe = new Personaje("edwin", 10);

        Personaje[] miGrupo = {explorador, guerrero, Profe};

        VistaCombate miVista = new VistaCombate();

        // Inicializamos el controlador
        ControladorCombate control = new ControladorCombate(miGrupo, miVista);
        control.ejecutarRonda();

    }
}
