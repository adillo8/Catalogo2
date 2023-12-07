package src.dominio2;
import java.io.*;

public class Consolas {
    /**
     * Atributos
    */
    protected String nombre;
    protected int precio;
    public ArrayList <Juego> juegos = new ArrayList<>();

    /**
     * Constructor
    */
     public Consolas(String nombre, String marca, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Geter y seter
    */
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getPrecio() {
        return precio;
    }

    /**
     * Metodo toString
    */
     public String toString() {
        return ("El nombre de la consola es " + nombre + " y su precio es " + precio); //nombre y precio
    }

    
    
}
