import java.util.Scanner;

public class stringClass {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        System.out.println("Using scanner.nextLine()  :"+s);
        System.out.println("length of string : "+s.length());
        System.out.println("String.substr()  : "+s.substring(3,8));
        s=sc.next(); // to take one token as input
        System.out.println("Using scanner.next()  :"+s);
        System.out.println("length of string : "+s.length());
        System.out.println("String.substr()  : "+s.substring(3));

    }
}
