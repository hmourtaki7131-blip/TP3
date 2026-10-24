
package ex01;

public class exercice4 {

    public static void affiche(double t[][]) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean regulier(double t[][]) {
        if (t == null) {
            return false;
        }

        for (int i = 1; i < t.length; i++) {
            if (t[i].length != t[0].length) {
                return false;
            }
        }

        return true;
    }

    public static double[] sommeLignes(double t[][]) {
        if (!regulier(t)) {
            return null;
        }

        double[] sommes = new double[t.length];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                sommes[i] += t[i][j];
            }
        }

        return sommes;
    }

    public static double[][] somme(double t1[][], double t2[][]) {
        if (!regulier(t1) || !regulier(t2)) {
            return null;
        }

        if (t1.length != t2.length) {
            return null;
        }

        if (t1.length > 0 && t1[0].length != t2[0].length) {
            return null;
        }

        double[][] resultat = new double[t1.length][t1.length == 0 ? 0 : t1[0].length];

        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }

        return resultat;
    }

    public static void main(String[] args) {
        double[][] t1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        double[][] t2 = {
            {10, 20, 30},
            {40, 50, 60}
        };

        System.out.println("Tableau t1 :");
        affiche(t1);

        System.out.println("Tableau regulier : " + regulier(t1));

        System.out.println("Somme des lignes :");
        double[] s = sommeLignes(t1);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        System.out.println("Somme des deux tableaux :");
        double[][] resultat = somme(t1, t2);

        if (resultat != null) {
            affiche(resultat);
        } else {
            System.out.println("Tableaux incompatibles");
        }
    }
}
