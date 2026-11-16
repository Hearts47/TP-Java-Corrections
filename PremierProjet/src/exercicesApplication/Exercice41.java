package exercicesApplication;

import java.util.Scanner;

public class Exercice41 {

    public static void executer() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre");
        int nombre = scanner.nextInt();

        if (nombre > 0) {
            System.out.println("Positif");
        } else if (nombre < 0) {
            System.out.println("Négatif");
        } else {
            System.out.println("Nul");
        }

        if (nombre % 2 == 0) {
            System.out.println("Pair");
        } else {
            System.out.println("Impair");
        }
    }
}