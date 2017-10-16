package treinomaratona;

import java.util.Scanner;

public class _1962 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                int[] anos = new int[n];
                
                for (int i = 0; i < n; i++) {
                    anos[i] = sc.nextInt();
                }
                
                for (int i = 0; i < n; i++) {
                    int res = 2015 - anos[i];
                    
                    if (res < 0) {
                        System.out.println( (Math.abs(res) + 1) + " A.C.");
                    } else if (res == 0) {
                        System.out.println("1 A.C.");
                    } else if (res > 0) {
                        System.out.println(res + " D.C.");
                    }
                }
            } catch (Exception e) {
                break;
            }
        }
    }
}
