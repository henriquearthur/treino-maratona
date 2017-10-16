package treinomaratona;

import java.util.Scanner;

public class _1185 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                String operacao = sc.nextLine();
                double[][] m = new double[12][12];
                
                for (int i = 0; i < 12; i++) {
                    for (int j = 0; j < 12; j++) {
                        m[i][j] = Double.parseDouble(sc.nextLine());
                    }
                }
                
                double soma = 0;
                int cont = 0;
                
                for (int i = 0; i < 11; i++) {
                    int maximo = 10 - i;
                    
                    for (int j = 0; j <= maximo; j++) {
                        soma = soma + m[i][j];
                        cont++;
                    }
                }

                if (operacao.equals("S")) {
                    System.out.printf("%.1f\n", soma);
                } else if (operacao.equals("M")) {
                    double media = soma / cont;
                    
                    System.out.printf("%.1f\n", media);
                }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
