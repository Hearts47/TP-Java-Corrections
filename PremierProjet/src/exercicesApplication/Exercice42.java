package exercicesApplication;

import java.util.Scanner;

public class Exercice42 {

    public static void executer() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre compris entre 1 et 10 inclusif");
        int nombre = scanner.nextInt();
        
        
        if (nombre > 10 || nombre < 1) {
        	System.out.println("Entrée invalide");
        } else {
        	
        	for (int i = 1; i <=10; i++) {
        		System.out.println(nombre + "x" + i + "=" + nombre*i);
        	}

        }
    }
}