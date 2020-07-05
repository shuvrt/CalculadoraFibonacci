/**
 *
 * @author Shuver Jaya
 */
import java.math.BigInteger;
public class CalculadoraFibonaciRecursivo {
    
    private static final BigInteger DOS = BigInteger.valueOf(2);
    
// declaración recursiva del método fibonacci
    public static BigInteger fibonacci(BigInteger numero){
        if (numero.equals(BigInteger.ZERO) || numero.equals(BigInteger.ONE)) // casos base
            return numero;
        else // paso recursivo
            return fibonacci(numero.subtract(BigInteger.ONE)).add(fibonacci(numero.subtract(DOS)));
    }
    
    // muestra los valores de fibonacci del 0 al 40
    public static void main(String[] args){
    
        for (int contador = 0; contador <= 40; contador++)
            System.out.printf("Fibonacci de %d es: %d%n", contador,fibonacci(BigInteger.valueOf(contador)));
    
        }//fin del main
}// fin de la clase CalculadoraFibonacciRecursivo
