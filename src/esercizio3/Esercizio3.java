package esercizio3;

import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String stringa;

        do {

            System.out.println("Inserisci una parola, o inserisci ':q' per terminare");
            stringa = scanner.nextLine();

           if (!stringa.equals(":q"))
            for (int i = 0; i < stringa.length(); i++) {
                System.out.println(stringa.charAt(i));
                System.out.print(", ");
            }

        }
        while (!stringa.equals(":q"));

        System.out.println("programma terminato");
        scanner.close();

    }
}
