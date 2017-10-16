package treinomaratona;

import java.util.Scanner;

public class _1132 {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                int maior, menor;
                
                if (a > b) {
                    maior = a;
                    menor = b;
                } else if (b > a) {
                    maior = b;
                    menor = a;
                } else {
                    maior = a;
                    menor = b;
                }
                
                int soma = 0;
                
                for (int i = menor; i <= maior; i++) {
                    if (i % 13 != 0) {
                        soma += i;
                    }
                }

                System.out.println(soma);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
