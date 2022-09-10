import java.util.Scanner;
public class MarksPercentage {
    public static void main(String[] args) {
        float sum=0;
        int t;
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your  subject marks : ");
        System.out.print("Subject1 : ");
        t=input.nextInt();
        sum+=t;
        System.out.print("Subject2 : ");
        t=input.nextInt();
        sum+=t;
        System.out.print("Subject3 : ");
        t=input.nextInt();
        sum+=t;
        System.out.print("Subject4 : ");
        t=input.nextInt();
        sum+=t;
        System.out.print("Subject5 : ");
        t=input.nextInt();
        sum+=t;

        System.out.println("You have got "+(sum/5)+"%");

    }
}
