package treinomaratona;

import java.util.Scanner;

public class _1175 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                
                int numTotal = 20;
                
                Integer[] n = new Integer[numTotal];
                
                for (int i = numTotal - 1; i >= 0; i--) {
                    n[i]= sc.nextInt();
                }
                
                for (int i = 0; i < n.length; i++) {
                    System.out.printf("N[%d] = %d\n", i, n[i]);
                }
            } catch (Exception e) {
                break;
            }
        }
    }
}
