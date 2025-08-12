import java.util.Scanner;
/**
 * Project created in order to learn Java basics
 *
 *
 *  @author Loic
 *  @version 1.1
 *  @since 2025-08-12
 */
public class Main {

    static int boxesToMove = 0;
    static int truckCapacity = 0;

    /**
     * Asks for the user to give an integer, and returns it if the value is correct.
     *
     * @param message the message displayed to ask the user which integer is wanted
     * @return the value of the integer given by the user.
     */
    private static int getInt(String message) {
        Scanner clavier = new Scanner(System.in);

        afficherMessage(message);
        while (!clavier.hasNextInt()) {
            afficherMessage("Merci de saisir un nombre entier");
            clavier.next();
        }
        return clavier.nextInt();
    }

    /**
     * Displays a message in the console.
     *
     * @param message is the String that will be displayed
     */
    private static void afficherMessage(String message) {
        System.out.println(message);
    }

    /**
     * Entry point of the program.
     * Asks the user to give a number of boxes and the maximum capacity of the truck
     * Then it displays each travel of the truck with the number of boxes moved, until it reaches 0.
     *
     * @param args arguments given in terminal
     */
    public static void main(String[] args) {

        //Définition et vérification du nombre de cartons
        boxesToMove = getInt("Veuillez renseigner le nombre de cartons");
        //Définition et vérification de la capacité du camion
        truckCapacity = getInt("Veuillez renseigner la capacité maximale du camion");

        while (boxesToMove >0) {
            if (boxesToMove >= truckCapacity) {
                afficherMessage("Un voyage de " + truckCapacity + " cartons");
                boxesToMove =  boxesToMove - truckCapacity;
            }
            else {
                afficherMessage("Un voyage de " + boxesToMove + " cartons, fin du déménagement !");
                boxesToMove = 0;
            }
        }
    }
}