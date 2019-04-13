import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int guessCount = 1;
        System.out.println("Guess the number.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        CheckValues check = Checker.check(num);
        while(!check.equals(CheckValues.EQUAL)){
            guessCount++;
            System.out.println(String.format("Your number is %s than the secret number. Enter another number.", check));
            num = sc.nextInt();
            check = Checker.check(num);
        }

        System.out.println(String.format("Congratulations! You guessed the number from the %s try;", guessCount));

    }


}
