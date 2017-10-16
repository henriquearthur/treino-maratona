package treinomaratona;

public class _1155 {
    public static void main(String[] args) {
        while (true) {
            try {
                double soma = 0.0;
                
                for (double i = 2.0; i <= 100.0; i++) {
                    soma += 1.0 / i;
                }

                System.out.printf("%.2f\n", soma + 1.0);
                break;
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
