package Parte2;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        Scanner sc = new Scanner(System.in);
        String operador = "";
        boolean valoresValidos = false;
        int a = 0;
        int b = 0;
        do {
            do{
                try {
                    System.out.println("¿primer número?");
                    a = sc.nextInt();

                    System.out.println("¿segundo número?");
                    b = sc.nextInt();

                   //if ((long)a + b > Integer.MAX_VALUE || (long)a + b < Integer.MIN_VALUE) {
                     //   throw new DesbordaCapacidadExcepcion();
                 //   }

                    valoresValidos = true;

                } catch (DesbordaCapacidadExcepcion e) {
                    System.out.println(e.getMessage());
                    sc.nextLine();
                    valoresValidos = false;
                } catch (Exception e) {
                    System.out.println("El valor introducido no es válido");
                    sc.nextLine();
                    valoresValidos = false;
                }
            }while (!valoresValidos) ;

                    System.out.println("¿operador? (+ - * / % o s para salir)");
                    operador = sc.next();
                    switch (operador) {
                        case "+":
                            try {
                                System.out.println("El resultado de la suma es: " + operacion.sumar(a, b));
                            } catch (DesbordaCapacidadExcepcion e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case "-":
                            try {
                                System.out.println("El resultado de la resta es: " + operacion.restar(a, b));
                            } catch (DesbordaCapacidadExcepcion e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case "*":
                            try {
                                System.out.println("El resultado de la multiplicación es: " + operacion.multiplicar(a, b));
                            } catch (DesbordaCapacidadExcepcion e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case "/":
                            try {
                                System.out.println("El resultado de la división es: " + operacion.dividir(a, b));
                            } catch (ArithmeticException e) {
                                System.out.println("No se puede dividir entre 0.");
                            }
                            break;
                        case "%":
                            try {
                                System.out.println("El resto de la división es: " + operacion.resto(a, b));
                            } catch (ArithmeticException e) {
                                System.out.println("No se puede dividir entre 0.");
                            }
                            break;
                        default:
                            System.out.println("Operación no válida.");
                            break;
                    }
               // }
            //}
        } while (operador != "s");
    }

}
