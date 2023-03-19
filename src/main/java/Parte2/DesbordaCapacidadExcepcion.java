package Parte2;

public class DesbordaCapacidadExcepcion extends ArithmeticException{
   // se genera una excepción de tipo ArithmeticException.

    // los valores deben estar entre -2.147.483.648 y 2.147.483.647. Si una variable de tipo int se inicializa a 2.000.000.000 y la variable se multiplica por dos, la variable contendrá: 294.967.296
    //Esta clase se utiliza para representar una excepción controlada. El mensaje asociado es "El resultado desborda la capacidad de esta calculadora".

    public DesbordaCapacidadExcepcion() {
        super("El resultado desborda la capacidad de esta calculadora");
    }

}
