package treinomaratona;

import java.util.Scanner;

public class _1071 {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                int m = sc.nextInt();

                int maior, menor;

                if (n > m) {
                    maior = n;
                    menor = m;
                } else if (m > n) {
                    maior = m;
                    menor = n;
                } else {
                    maior = n;
                    menor = m;
                }
                
                int soma = 0;
                
                for (int i = menor + 1; i < maior; i++) {
                    if (i % 2 != 0) {
                        soma = soma + i;
                    }
                }
                
                System.out.println(soma);
            } catch (Exception e) {
                break;
            }
        }
    }
}
