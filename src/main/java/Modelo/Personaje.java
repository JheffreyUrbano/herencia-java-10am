/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jurbano
 */
public class Personaje {

    String nombre;
    int constitucion;

    public Personaje(String nombre, int constitucion) {
        this.nombre = nombre;
        this.constitucion = constitucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContitucion() {
        return constitucion;
    }

    public void setContitucion(int contitucion) {
        this.constitucion = contitucion;
    }

    public String realizarAtaque() {
        return "Realiza un ataque sin armas, con los puños";
    }
}
