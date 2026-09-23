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
    private String nombre;
    private int contitucion;

    public Personaje(String nombre, int contitucion) {
        this.nombre = nombre;
        this.contitucion = contitucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContitucion() {
        return contitucion;
    }

    public void setContitucion(int contitucion) {
        this.contitucion = contitucion;
    }
    
    public String realizarAtaque(){
        return "Realiza un ataque sin armas, con los puños";
    }
}
