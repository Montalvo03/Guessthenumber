package org.example;
import java.util.Random;

// Clase que implementa la lógica del juego
public class Juego {
    private int numeroAdivinanza;
    private int intentos;
    private boolean adivinado;
    private int rango;
    private InterfazUsuario interfaz;

    // Constructor que recibe el rango máximo y la interfaz
    public Juego(int maximo, InterfazUsuario interfaz) {
        // Generar un número aleatorio dentro del rango proporcionado
        Random random = new Random();
        this.numeroAdivinanza = random.nextInt(maximo) + 1;
        this.intentos = 0;
        this.adivinado = false;
        this.rango = maximo;
        this.interfaz = interfaz;
    }

    // Método principal que inicia el juego
    public void iniciar() {
        // Mostrar mensajes de bienvenida y explicación del juego
        interfaz.mostrarMensaje("¡Bienvenido al juego de adivinanza!");
        interfaz.mostrarMensaje("Intenta adivinar el número del 1 al " + this.rango + ".");

        // Bucle principal del juego
        while (!this.adivinado) {
            // Solicitar al usuario ingresar su numero
            interfaz.mostrarMensaje("Ingresa tu suposición: ");
            int suposicion = interfaz.leerEntero();
            //sumar 1 intento cada vez que se repite el bucle
            ++this.intentos;

            // Comprobar si el numero entero es mayor o menor que el rango
            if (suposicion > this.rango) {
                interfaz.mostrarMensaje("El número ingresado es mayor al rango seleccionado.");
            } else if (suposicion < 1) {
                interfaz.mostrarMensaje("El número ingresado es menor al rango seleccionado.");
            } else if (suposicion == this.numeroAdivinanza) {
                // si el numero es igual al aleatorio cambiar adivinando a true para que el bucle finalice
                this.adivinado = true;
            } else {
               // si el numero esta dentro del rango pero no es igual al aleatorio pedir que lo intente de nuevo
                interfaz.mostrarMensaje("¡Incorrecto! Intenta de nuevo.");
            }
        }

        // Mostrar mensaje de felicitaciones al usuario
        interfaz.mostrarMensaje("¡Felicidades! Adivinaste el número en " + this.intentos + " intentos.");
    }
}