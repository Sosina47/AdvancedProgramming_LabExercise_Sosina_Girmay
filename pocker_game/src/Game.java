import java.util.ArrayList;
import java.util.Collections; 
import java.util.Scanner; 

public class Game {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        ArrayList<Integer> deck = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            deck.add(i);
        }

        System.out.println("CHOOSE ONE OF THE CARDS: "); 

        for (int i = 1; i <= 3; i++) {
            Collections.shuffle(deck); 

            System.out.println(deck.remove(0)); 
        }

        int player = input.nextInt(); 

        input.close(); 
        
        Collections.shuffle(deck); 
        int computer = deck.remove(0); 

        System.out.println("You have selected: " + player); 
        System.out.println("The computer selected " + computer); 

        if (player > computer) {
            System.out.println("YOU WON!"); 
        } else if (player < computer) {
            System.out.println("YOU LOSE!"); 
        } else {
            System.out.println("IT'S A TIE."); 
        }

    }
}