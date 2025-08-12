public class Main {
    public static void main(String[] args) {
        int boxesToMove = 34;
        while (boxesToMove>0) {
            if (boxesToMove>=9) {
                boxesToMove =  boxesToMove-9;
                System.out.println("un voyage de 9 cartons");
            }
            else {
                System.out.println("un voyage de " + boxesToMove + " cartons");
                boxesToMove = 0;
            }
        }
    }
}