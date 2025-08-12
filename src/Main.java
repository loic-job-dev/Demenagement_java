import java.util.Scanner;

public class Main {

    static int boxesToMove = 0;
    static int truckCapacity = 0;
    //Définition de la fonction utilitaire
    private static int getInt() {
        Scanner clavier = new Scanner(System.in);

        while (!clavier.hasNextInt()) {
            System.out.println("Merci de saisir un nombre entier");
            clavier.next();
        }
        return clavier.nextInt();
    }

    private static void afficherMessage() {
        if (boxesToMove == 0) {
            System.out.println("Merci de renseigner le nombre de cartons :");
        } else if (boxesToMove != 0 && truckCapacity == 0) {
            System.out.println("Merci de renseigner la capacité maximale du camion :");
        }
        else if (boxesToMove != 0 && truckCapacity != 0 && boxesToMove >= truckCapacity) {
            System.out.println("un voyage de " + truckCapacity + " cartons");
        }
        else if (boxesToMove != 0 && truckCapacity != 0 && boxesToMove < truckCapacity) {
            System.out.println("un voyage de " + boxesToMove + " cartons");
        }
    }

    public static void main(String[] args) {

        //Définition et vérification du nombre de cartons
        afficherMessage();
        boxesToMove = getInt();
        //Définition et vérification de la capacité du camion
        afficherMessage();
        truckCapacity = getInt();

        //Déménagement
        while (boxesToMove >0) {
            if (boxesToMove >= truckCapacity) {
                afficherMessage();
                boxesToMove =  boxesToMove - truckCapacity;
            }
            else {
                afficherMessage();
                boxesToMove = 0;
            }
        }
    }
}