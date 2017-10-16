package treinomaratona;

import java.util.Scanner;


public class _2060 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                
                int n = Integer.parseInt(sc.nextLine());
                String numeros = sc.nextLine();
                
                String[] arr = numeros.split(" ");
                
                int multiplos2 = 0;
                int multiplos3 = 0;
                int multiplos4 = 0;
                int multiplos5 = 0;
                
                for (int i = 0; i < arr.length; i++) {
                    if (Integer.parseInt(arr[i]) % 2 == 0) {
                        multiplos2++;
                    }
                    
                    if (Integer.parseInt(arr[i]) % 3 == 0) {
                        multiplos3++;
                    }
                    
                    if (Integer.parseInt(arr[i]) % 4 == 0) {
                        multiplos4++;
                    }
                    
                    if (Integer.parseInt(arr[i]) % 5 == 0) {
                        multiplos5++;
                    }
                }
                
                System.out.println(multiplos2 + " Multiplo(s) de 2");
                System.out.println(multiplos3 + " Multiplo(s) de 3");
                System.out.println(multiplos4 + " Multiplo(s) de 4");
                System.out.println(multiplos5 + " Multiplo(s) de 5");
            } catch (Exception e) {
                break;
            }
        }
    }
}
