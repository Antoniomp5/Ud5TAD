package Ejercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio2 {
    public static void main(String[] args) {
        Set<String> nombres = new LinkedHashSet<>();
        
        nombres.add("Antonio");
        nombres.add("Diego");
        nombres.add("Carlos");
        System.out.println(nombres);
        
        boolean agregar = nombres.add("Antonio");
        System.out.println(agregar);  // Es falso ya que Antonio ya existe en el set
        System.out.println(nombres);
        System.out.println("Tamaño " + nombres.size());
        
        nombres.add(null);
        System.out.println(nombres);  // Inclusión de null
        nombres.add(null);
        System.out.println(nombres);  // Ya existe un null
        
        for (String nombre : nombres) {  // Impresión en vertical
            System.out.println(nombre);
        } 
        
        // Implementación polimórfica de HashSet
        Set<String> nombresHashSet = new HashSet<>();  // Cambiamos la implementación a HashSet
        
        // Agregar elementos desde 'nombres' (que es un LinkedHashSet) a 'nombresHashSet' (que es un HashSet)
        nombresHashSet.addAll(nombres);
        System.out.println("HashSet:");

        // Iterando sobre nombresHashSet
        for (String nombre : nombresHashSet) { 
            System.out.println("D. " + nombre);
        } 
    }
}
