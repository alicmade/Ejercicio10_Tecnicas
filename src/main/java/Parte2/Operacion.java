package Parte2;

public class Operacion {
   final static int MAX_VALUE = 2147483647 ;
   final static int MIN_VALUE = -2147483648;

    public int sumar(int a, int b) throws DesbordaCapacidadExcepcion {
        //Este método suma dos enteros y devuelve el resultado.
        //Si el resultado excede la capacidad de un entero de tipo int, se genera una excepción del tipo DesbordaCapacidadException.
        long resultado = (long) a + (long) b;
        if (resultado > MAX_VALUE || resultado < MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }


    public int restar(int a, int b) throws DesbordaCapacidadExcepcion {
        //Este método resta dos enteros y devuelve el resultado.
        //Si el resultado excede la capacidad de un entero de tipo int, se genera una excepción del tipo DesbordaCapacidadException.
        long resultado = (long) a - (long) b;
        if (resultado > MAX_VALUE || resultado < MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }


    public int multiplicar(int a, int b) throws DesbordaCapacidadExcepcion {
        //Este método multiplica dos enteros y devuelve el resultado.
        //Si el resultado excede la capacidad de un entero de tipo int, se genera una excepción del tipo DesbordaCapacidadException.
        long resultado = (long) a * (long) b;
        if (resultado > MAX_VALUE || resultado < MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int) resultado;
    }

    public int dividir(int a, int b) throws ArithmeticException {
        //Este método divide dos enteros y devuelve el resultado.
        //Si el resultado excede la capacidad de un entero de tipo int, se genera una excepción del tipo DesbordaCapacidadException.
        return a / b;
    }

    public int resto(int a, int b) throws ArithmeticException {
        //Este método calcula el resto de la división de dos enteros y devuelve el resultado.
        //Si el resultado excede la capacidad de un entero de tipo int, se genera una excepción del tipo DesbordaCapacidadException.
        return a % b;
    }




}
