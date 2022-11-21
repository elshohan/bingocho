package Clases;

import java.util.Scanner;

public class Bingo {
    // Función
    public void jugar() {
        // Instanciación
        Scanner sc = new Scanner(System.in);
        Carton carton1 = new Carton();

        // Controla el ciclo While
        boolean control = true;

        while (control) {
            System.out.println(".:: Obtener Bola ::.");
            Bola bola1 = new Bola();
            carton1.mostrarCarton();
            System.out.println(" ");
            System.out.println("Mi bola: " + bola1.numero);
            System.out.println();
            System.out.println("1) Tirar otra vez");
            System.out.println("2) Salir");
            System.out.print("Su elección: ");
            int option = sc.nextInt();
            switch (option) {
                case 1 -> System.out.println("Has girado nuevamente");
                case 2 -> {
                    System.out.println("Gracias por usar el bingo");
                    control = false;
                }
                default -> {
                    System.out.println("Opción Incorrecta");
                    control = false;
                }
            }
        }
    }
}
