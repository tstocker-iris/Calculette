package com.company;

public class Main {

    public static void main(String[] args)
    {
        int[] tab;
        int resultat = 0;

        // 2) Afficher les paramètres du programmes
        System.out.println("Liste des paramètres du programme");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        // 3) Initialiser notre tableau tab avec la même longueur que le tableau de paramètre
        tab = new int[args.length];

        System.out.println("Liste des entrées de tab");
        // On affiche les entrées du tableau tab;
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        // 5) On insère la conversion string > int de args dans tab
        for (int i = 0; i < args.length; i++) {
            tab[i] = Integer.parseInt(args[i]);
        }

        System.out.println("Liste des entrées de tab après conversion");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        // On boucle pour additioner les différentes colonnes de tab dans résultat.
        for (int i = 0; i < tab.length; i++) {
            resultat += tab[i];
        }

        System.out.println("Le résultat de l'addtion est : "  + resultat);
    }
}
