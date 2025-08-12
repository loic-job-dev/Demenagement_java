import java.util.Scanner;

public class Main {

    //Définition de la fonction utilitaire
    private static int getInt() {
        Scanner clavier = new Scanner(System.in);

        while (!clavier.hasNextInt()) {
            System.out.println("Merci de saisir un nombre entier");
            clavier.next();
        }
        return clavier.nextInt();
    }

    public static void main(String[] args) {

        //Définition et vérification du nombre de cartons
        System.out.println("Merci de renseigner le nombre de cartons :");
        int boxesToMove = getInt();
        //Définition et vérification de la capacité du camion
        System.out.println("Merci de renseigner la capacité maximale du camion :");
        int truckCapacity = getInt();


        //Déménagement
        while (boxesToMove >0) {
            if (boxesToMove >= truckCapacity) {
                boxesToMove =  boxesToMove - truckCapacity;
                System.out.println("un voyage de " + truckCapacity + " cartons");
            }
            else {
                System.out.println("un voyage de " + boxesToMove + " cartons");
                boxesToMove = 0;
            }
        }
    }
}