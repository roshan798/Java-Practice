import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessTheNumber {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int num;
        GuessNumber n=new GuessNumber();
        System.out.print("Guess the Number (0-100) : ");
        num = sc.nextInt();
        while (!n.check(num)) {
            num = sc.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
class GuessNumber{
    private int ranNum;
    private int score;
    public GuessNumber() {
        Random random=new Random();
        ranNum= random.nextInt(100);
        score=0;
    }
    int getRanNum() {
        return ranNum;
    }
   boolean check(int num) {
        if (num==ranNum) {
            System.out.println("Wooh!! you guessed it right \nYour Score : "+score);
            return true;
        }
        else if (num > ranNum) System.out.print("Try a Smaller number : ");
        else System.out.print("Try a Bigger number : ");
        score++;
        return false;
    }
}
