/**
 *
 * @author Shuver Jaya
 */
public class CalculadoraFibonaciInteraccion {
  
    static int Fibonacci_Iterative(int n){
	int fn_1 = 1;
	int fn_2 = 1;
		
	for (int i = 3; i <= n; i++){
        	int fn_2Aux = fn_1;
		fn_1 = fn_2 + fn_1;
		fn_2 = fn_2Aux; // old value of fn_1
	}
		
	return fn_1;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here

        for (int i = 1; i <= 40; i++)
        {
            int fibonacci = Fibonacci_Iterative(i);
            String text = String.format("Fibonacci de %s es: %s", i, fibonacci);
            System.out.println(text);
        }
    } 
}
