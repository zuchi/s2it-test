package Questao8;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class main {

    private static Scanner leitor;

    private static Logger logger = Logger.getLogger(main.class.getName());

    public static void main(String[] args) {
        leitor = new Scanner(System.in);

        try {
            System.out.print("Digite o número A: ");
            int numeroA = lerNumero();
            System.out.print("Digite o número B: ");
            int numeroB = lerNumero();

            Integer numberC = createNumberC(numeroA, numeroB);

            System.out.println(numberC);


        } catch (InputMismatchException ime) {
            logger.warning("Erro ao converter o número para inteiro: " + ime.getMessage());
            ime.printStackTrace();
        }
    }

    private static int lerNumero() {
        leitor.reset();
        return leitor.nextInt();
    }

    private static int createNumberC(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        int dif = strA.length() - strB.length();

        // a > b
        if (dif > 0) {
            for (int i = 0; i < dif; i++)
                strB += 'x';
        } else if (dif < 0) { // a < b
            for (int i = 0; i < Math.abs(dif); i++)
                strA += 'x';
        }

        String c = "";
        for (int i = 0; i < strA.length(); i++) {

            if (strA.charAt(i) != 'x')
                c += String.valueOf(strA.charAt(i));

            if (strB.charAt(i) != 'x')
                c += String.valueOf(strB.charAt(i));

        }

        Integer numberC = Integer.parseInt(c);

        return numberC > 1000000 ? -1 : numberC;
    }

}
