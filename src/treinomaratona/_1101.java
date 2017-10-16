package treinomaratona;

import java.util.ArrayList;
import java.util.Scanner;

public class _1101 {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                int n = 1, m = 1;

                ArrayList<String> linhas = new ArrayList<>();
                
                int menor, maior;

                while (n > 0 && m > 0) {
                    String l = sc.nextLine();
                    String[] arr = l.split(" ");
                    
                    n = Integer.parseInt(arr[0]);
                    m = Integer.parseInt(arr[1]);

                    if (n > 0 && m > 0) {
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
                        
                        String linha = "";
                        int soma = 0;
                        
                        for (int i = menor; i <= maior; i++) {
                            linha += i + " ";
                            
                            soma += i;
                        }
                        
                        linha += "Sum=" + soma;
                        
                        linhas.add(linha);
                    }
                }
                
                for (String linha : linhas) {
                    System.out.println(linha);
                }
            } catch (Exception e) {
                break;
            }
        }
    }
}
