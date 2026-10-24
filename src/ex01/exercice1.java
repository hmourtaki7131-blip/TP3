
package ex01;

import java.util.Scanner;

public class exercice1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double somme = 0;

        System.out.print("Entrez la valeur de n : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            somme = somme + 1.0 / i;
        }

        System.out.println("La somme est : " + somme);

        sc.close();
    }
}

