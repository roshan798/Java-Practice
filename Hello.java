import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String FirstName = input.next();
        System.out.println("Enter your last name : ");
        String  LastName = input.next();
        System.out.println("Welcome To Java programming "+FirstName+" "+LastName);
    }
}
