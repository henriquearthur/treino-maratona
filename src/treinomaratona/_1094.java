package treinomaratona;

import java.util.Scanner;


public class _1094 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                
                int n = Integer.parseInt(sc.nextLine());
                
                String l;
                
                int total = 0;
                int totalC = 0;
                int totalR = 0;
                int totalS = 0;
                
                for (int i = 0; i < n; i++) {
                    l = sc.nextLine();
                    String[] arr = l.split(" ");
                    
                    int quantia = Integer.parseInt(arr[0]);
                    String tipo = arr[1];
                    
                    total += quantia;
                    
                    if (tipo.equalsIgnoreCase("c")) {
                        totalC += quantia;
                    } else if (tipo.equalsIgnoreCase("r")) {
                        totalR += quantia;
                    } else if (tipo.equalsIgnoreCase("s")) {
                        totalS += quantia;
                    }
                }
                
                double percentC = (100.0 * totalC) / total;
                double percentR = (100.0 * totalR) / total;
                double percentS = (100.0 * totalS) / total;
                
                System.out.printf("Total: %d cobaias\n", total);
                System.out.printf("Total de coelhos: %d\n", totalC);
                System.out.printf("Total de ratos: %d\n", totalR);
                System.out.printf("Total de sapos: %d\n", totalS);
                System.out.printf("Percentual de coelhos: %.2f %%\n", percentC);
                System.out.printf("Percentual de ratos: %.2f %%\n", percentR);
                System.out.printf("Percentual de sapos: %.2f %%\n", percentS);
            } catch (Exception e) {
                break;
            }
        }
    }
}
