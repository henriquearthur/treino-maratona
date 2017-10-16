package treinomaratona;

import java.util.ArrayList;
import java.util.Scanner;

public class _1160 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                
                int t = Integer.parseInt(sc.nextLine());
                
                ArrayList<String> linhas = new ArrayList<>();
                
                for (int i = 0; i < t; i++) {
                    linhas.add(sc.nextLine());
                }
                
                for (int i = 0; i < t; i++) {
                    String linha = linhas.get(i);
                    String[] arr = linha.split(" ");
                    
                    int pa = Integer.parseInt(arr[0]);
                    int pb = Integer.parseInt(arr[1]);
                    double ga = Double.parseDouble(arr[2]);
                    double gb = Double.parseDouble(arr[3]);
                    
                    int anos = 0;
                    
                    while (pa <= pb) {
                        pa = (int) Math.floor(((ga / 100.0) * pa) + pa);
                        pb = (int) Math.floor(((gb / 100.0) * pb) + pb);
                        
                        anos++;
                        
                        if (anos > 100) {
                            break;
                        }
                    }
                    
                    if (anos > 100) {
                        System.out.println("Mais de 1 seculo.");
                    } else {
                        System.out.println(anos + " anos.");
                    }
                }
            } catch (Exception e) {
                break;
            }
        }
    }
}
