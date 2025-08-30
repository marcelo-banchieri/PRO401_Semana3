import java.util.Scanner; 
// Importa la clase Scanner desde java.util para leer datos por consola.

/**
 * Clase ActividadNombreEdad
 * Programa que solicita el nombre y la edad de un usuario y luego
 * los muestra en pantalla. Demuestra el uso de Scanner y System.out.
 */
public class ActividadNombreEdad { // Inicio de la clase

    /**
     * Método principal del programa.
     * @param args Argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) { // Inicio del método main

        Scanner sc = new Scanner(System.in); 
        // Crea un objeto Scanner para leer desde teclado (System.in).

        System.out.print("Ingrese su nombre: "); 
        String nombre = sc.nextLine(); 
        // nextLine() lee la línea completa (permite espacios en el nombre).

        System.out.print("Ingrese su edad: "); 
        int edad = sc.nextInt(); 
        // nextInt() lee un número entero ingresado por el usuario.

        // Muestra en pantalla los datos ingresados
        System.out.println("Nombre ingresado: " + nombre); 
        System.out.println("Edad ingresada: " + edad + " años"); 

        sc.close(); 
        // Cierra el Scanner para liberar recursos
    } // Fin del método main
} // Fin de la clase ActividadNombreEdad
