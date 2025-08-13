import java.util.Scanner;
/**
 * Project created in order to learn Java basics
 *
 *
 *  @author Loic
 *  @version 1.2
 *  @since 2025-08-12
 */
public class Main {

    /**
     * Number of boxes to move, given by the user.
     */
    static int boxesToMove = 0;
    /**
     * Number of boxes the truck can move by each travel, given by the user.
     */
    static int truckCapacity = 0;
    /**
     * Number of travels done to accomplish the move out.
     */
    static int totalTravels = 0;

    /**
     * Asks for the user to give a positive integer, and returns it if the value is correct.
     *
     * @param message the message displayed to ask the user which integer is wanted
     * @return the value of the integer given by the user.
     */
    private static int getPosInt(String message) {
        Scanner clavier = new Scanner(System.in);
        boolean isValid = false;
        int numberTested = 0;

        displayMessage(message);

        while (!isValid) {
            if (!clavier.hasNextInt()) {
                displayMessage("Merci de saisir un nombre entier positif");
                clavier.next();
            }
            else {
                numberTested = clavier.nextInt();
                if (numberTested < 0) {
                    displayMessage("Merci de saisir un nombre entier positif");
                }
                else {
                    isValid = true;
                }
            }
        }
        return numberTested;
    }

    /**
     * Displays a message in the console.
     *
     * @param message is the String that will be displayed
     */
    private static void displayMessage(String message) {
        System.out.println(message);
    }

    /**
     * Entry point of the program.
     * Asks the user to give a number of boxes and the maximum capacity of the truck
     * Then it displays each travel of the truck with the number of boxes moved, until it reaches 0.
     * The last travel gives the total number of travels that have been realised
     *
     * @param args arguments given in terminal
     */
    public static void main(String[] args) {

        //Définition et vérification du nombre de cartons
        boxesToMove = getPosInt("Veuillez renseigner le nombre de cartons");
        //Définition et vérification de la capacité du camion
        truckCapacity = getPosInt("Veuillez renseigner la capacité maximale du camion");

        while (boxesToMove >0) {
            if (boxesToMove >= truckCapacity) {
                displayMessage("Un voyage de " + truckCapacity + " cartons");
                boxesToMove =  boxesToMove - truckCapacity;
                totalTravels ++;
            }
            else {
                totalTravels ++;
                displayMessage("Un voyage de " + boxesToMove + " cartons, fin du déménagement en " + totalTravels + " trajets !");
                boxesToMove = 0;

            }
        }
    }
}