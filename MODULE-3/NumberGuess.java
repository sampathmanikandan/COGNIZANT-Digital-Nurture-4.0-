import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = new Random().nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess the number (1–100): ");
            guess = sc.nextInt();

            if (guess > number) System.out.println("Too High!");
            else if (guess < number) System.out.println("Too Low!");
            else System.out.println("Correct!");
        } while (guess != number);
    }
}
