package Ejercicios;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
//import Ud4Objetos.Ud4Objetos.Persona

public class Ejercicio3 {

    public static void main(String[] args) {
    	//Alumnos
        TreeSet<String> nombre = new TreeSet<>();
        nombre.add("Pablo");
        nombre.add("Pedro");
        nombre.add("Juan");
        
        for(String alumno : nombre) {
        	System.out.println(alumno);
        }
        
        //Numeros
        TreeSet<Integer> conjunto = new TreeSet<>();
        conjunto.add(3);
        conjunto.add(5);
        conjunto.add(1);
        
 
        Iterator it = conjunto.descendingIterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
      /*  //Persona
        TreeSet<Persona> personas = new TreeSet<>();
        personas.add("");
        personas.add("");
        personas.add("");
        */
         
    }
}