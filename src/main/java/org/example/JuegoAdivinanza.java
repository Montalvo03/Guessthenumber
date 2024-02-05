package org.example;

// Clase principal que contiene el método main
public class JuegoAdivinanza {

    public static void main(String[] args) {
        // Crear una instancia de la interfaz para la entrada/salida
        InterfazUsuario interfaz = new Consola();
        interfaz.mostrarMensaje("Ingresa el rango máximo para adivinar (por ejemplo, 100): ");

        // Obtener el rango máximo del usuario
        int maximo = interfaz.leerEntero();

        // Crear una instancia del juego y comenzar
        Juego juego = new Juego(maximo, interfaz);
        juego.iniciar();
    }
}
