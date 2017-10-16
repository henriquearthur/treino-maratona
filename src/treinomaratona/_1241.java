package treinomaratona;

import java.util.Scanner;

public class _1241 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                int n = Integer.parseInt(sc.nextLine());
                String[] numeros = new String[n];

                for (int i = 0; i < n; i++) {
                    numeros[i] = sc.nextLine();
                }

                for (int i = 0; i < n; i++) {
                    String[] arr = numeros[i].split(" ");
                    
                    String a = arr[0];
                    String b = arr[1];
                    
                    if (a.length() < b.length()) {
                        System.out.println("não encaixa");
                        continue;
                    }
                    
                    String str = "encaixa";
                    
                    for (int j = 0; j < a.length(); j++) {
                        if (b.charAt((b.length() - (j+1))) != a.charAt((a.length() - (j+1)))) {
                            str = "não encaixa";
                            break;
                        }
                    }
                    
                    System.out.println(str);
                            
                }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
