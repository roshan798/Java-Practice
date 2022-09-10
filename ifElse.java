import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter your Age : ");
        byte age=scan.nextByte();
        if (age<18)
            System.out.printf("Your age is %d\n So you can't vote.\n",age);
        else
            System.out.printf("Your age is %d\nSo you can vote\n.",age);
    }
}
