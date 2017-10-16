package treinomaratona;

import java.util.Scanner;

public class _1144 {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                
                int a = 1, b = 1, c = 1;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (j == 0) {
                            a = i + 1;
                            b = a * a;
                            c = a * b;
                        } else {
                            b = b + 1;
                            c = c + 1;
                        }
                        
                        System.out.printf("%d %d %d\n", a, b, c);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
