import java.util.Scanner;

public class Main {

    //Définition de la fonction utilitaire
    public static int isInt() {
        Scanner clavier = new Scanner(System.in);

        while (!clavier.hasNextInt()) {
            System.out.println("Merci de saisir un nombre entier");
            clavier.next();
        }
        return clavier.nextInt();
    }

    public static void main(String[] args) {
        int boxesToMove = 0;
        int truckCapacity = 0;

        //Définition et vérification du nombre de cartons
        System.out.println("Merci de renseigner le nombre de cartons :");
        boxesToMove = isInt();
        //Définition et vérification de la capacité du camion
        System.out.println("Merci de renseigner la capacité maximale du camion :");
        truckCapacity = isInt();


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
    }
}