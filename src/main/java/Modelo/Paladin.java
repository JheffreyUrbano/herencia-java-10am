/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jurbano
 */
public class Paladin extends Personaje {

    public Paladin(String nombre, int contitucion) {
        super(nombre, contitucion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContitucion(int contitucion) {
        this.constitucion = contitucion;
    }

    @Override
    public String realizarAtaque() {
        return "Golpea con su martillo divino y hace un ataque radiante.";
    }
}
