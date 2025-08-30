import java.util.Scanner; 
// Importa la clase Scanner desde java.util para leer datos por consola.

/**
 * Clase ActividadVehiculo
 * Programa que solicita datos de un vehículo (marca, modelo, cilindrada,
 * tipo de combustible y capacidad de pasajeros) y los muestra por pantalla.
 * Demuestra el uso de Scanner para entrada de datos y System.out para salida.
 */
public class ActividadVehiculo { // Inicio de la clase

    /**
     * Método principal del programa.
     * @param args Argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) { // Inicio del método main

        Scanner sc = new Scanner(System.in); 
        // Crea un objeto Scanner para leer desde teclado (System.in).

        System.out.print("Ingrese la marca: "); 
        String marca = sc.nextLine(); 

        System.out.print("Ingrese el modelo: "); 
        String modelo = sc.nextLine(); 

        System.out.print("Ingrese la cilindrada: "); 
        String cilindrada = sc.nextLine(); 

        System.out.print("Ingrese el tipo de combustible: "); 
        String combustible = sc.nextLine(); 

        System.out.print("Ingrese la capacidad en pasajeros: "); 
        int capacidad = sc.nextInt(); 

        // Muestra en pantalla los datos ingresados
        System.out.println("La marca que ha ingresado es: " + marca); 
        System.out.println("El modelo que ha ingresado es: " + modelo); 
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada); 
        System.out.println("El tipo de combustible es: " + combustible); 
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros."); 

        sc.close(); 
        // Cierra el Scanner para liberar recursos
    } // Fin del método main
} // Fin de la clase ActividadVehiculo

