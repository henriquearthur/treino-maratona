package treinomaratona;

import java.util.Scanner;

public class _2483 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                
                int i = sc.nextInt();
                
                String str = "Feliz nat";
                
                for (int j = 0; j < i; j++) {
                    str += "a";
                }
                
                str += "l!";
                
                System.out.println(str);
                
            } catch (Exception e) {
                break;
            }
        }
    }
}
