package Parte1;

import java.util.Scanner;

public class RaizCuadrada {
    Scanner sc = new Scanner(System.in);
    public int raizCuadrada(int numero) throws Exception {
        if (numero < 0) {
            throw new Exception("El número no puede ser negativo");
        }
        return (int) Math.sqrt(numero);
    }

    public void mostrarRaizCuadrada(int numero) {
        try {
            System.out.println("Resultado: " + raizCuadrada(numero));
        } catch (Exception e) {
            //get message from exception es para mostrar el mensaje de la excepción que se ha lanzado
            // en el método raizCuadrada (el mensaje que se ha puesto en el throw new Exception)
            System.out.println(e.getMessage());
        }
    }

    public void preguntarNumero() {
        System.out.println("Introduce un número");
        int numero = sc.nextInt();
        mostrarRaizCuadrada(numero);
    }

}
