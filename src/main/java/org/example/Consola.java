package org.example;
import java.util.Scanner;

// Implementación de la interfaz para manejar entrada/salida por consola
public class Consola implements InterfazUsuario {

    // Método para mostrar un mensaje en la consola
    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.print(mensaje);
    }

    // Método para leer un número entero desde la consola
    @Override
    public int leerEntero() {
        try {
            // Crear un objeto Scanner para leer la entrada desde la consola
            Scanner scanner = new Scanner(System.in);

            // Leer un entero desde la consola
            return scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            // Si no es un entero mostrar el siguiente mensaje
            System.out.println("Por favor, ingresa un número válido.");

            // Volver a llamar al metodo para leer otra entrada de texto
            return leerEntero();
        }
    }
}
