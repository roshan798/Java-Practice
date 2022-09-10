import java.util.Scanner;
//import java.util.random.RandomGenerator
public class Array {
    public static void main(String[] args) {
        int[] marks =new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your subject marks  : ");
        for (int i =0; i < 5; i++) {
            System.out.printf("Subject %d :-  ",i+1);
            marks[i]=sc.nextInt();
        }
        sc.close();
        float per= 0;
        for (int j = 0; j <5; j++) per += (float) marks[j];
        per/=5;
        System.out.printf("You got %.2f percentage ",per);
    }

}
