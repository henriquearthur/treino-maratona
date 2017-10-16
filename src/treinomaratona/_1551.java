package treinomaratona;

import java.util.ArrayList;
import java.util.Scanner;

public class _1551 {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                int n = Integer.parseInt(sc.nextLine());
                String[] frases = new String[n];

                for (int i = 0; i < n; i++) {
                    frases[i] = sc.nextLine();
                }

                for (int i = 0; i < n; i++) {
                    ArrayList<String> letras = new ArrayList<String>();

                    for (int j = 0; j < frases[i].length(); j++) {
                        if (frases[i].charAt(j) != ',' && frases[i].charAt(j) != ' ') {
                            if (!letras.contains(String.valueOf(frases[i].charAt(j)))) {
                                letras.add(String.valueOf(frases[i].charAt(j)));
                            }
                        }
                    }

                    if (letras.size() == 26) {
                        System.out.println("frase completa");
                    } else if (letras.size() >= (26 / 2)) {
                        System.out.println("frase quase completa");
                    } else {
                        System.out.println("frase mal elaborada");
                    }
                }
            } catch (Exception e) {
                break;
            }
        }
    }
}
