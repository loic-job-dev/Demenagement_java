import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int boxesToMove = 0;
        int truckCapacity = 0;
        boolean isInt = false;

        Scanner clavier = new Scanner(System.in);

        //Définition et vérification du nombre de cartons
        while (!isInt) {
            System.out.println("Saisir le nombre de catons : ");
            //Si la saisie est un int
            if (clavier.hasNextInt()) {
                boxesToMove = clavier.nextInt();
                isInt = true;
            }
            //Sinon on boucle
            else {
                System.out.println("Merci de saisir un nombre entier");
                clavier.next();
            }
        }

        //Réinitialisation du booléen isInt
        isInt = false;

        //Définition et vérification de la capacité du camion
        while (!isInt) {
            System.out.println("Saisir la capacité du camion : ");
            //Si la saisie est un int
            if (clavier.hasNextInt()) {
                truckCapacity = clavier.nextInt();
                isInt = true;
            }
            //Sinon on boucle
            else {
                System.out.println("Merci de saisir un nombre entier");
                clavier.next();
            }
        }

        //Déménagement
        while (boxesToMove>0) {
            if (boxesToMove>=truckCapacity) {
                boxesToMove =  boxesToMove-truckCapacity;
                System.out.println("un voyage de " + truckCapacity + " cartons");
            }
            else {
                System.out.println("un voyage de " + boxesToMove + " cartons");
                boxesToMove = 0;
            }
        }
        clavier.close();
    }
}