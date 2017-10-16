package treinomaratona;

import java.util.Scanner;

public class _1156 {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                
                double numerador = 3.0;
                double denominador = 2.0;
                
                double soma = 1.0;
                
                while (numerador <= 39) {
                    soma += numerador / denominador;
                    
                    numerador += 2.0;
                    denominador *= 2.0;
                }

                System.out.printf("%.2f\n", soma);
                break;
            } catch (Exception e) {
                break;
            }
        }
    }
}
