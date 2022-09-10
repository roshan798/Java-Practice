import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int n) {
        if (n <= 1) return n;
        else return fibo(n-1)+fibo(n-2);
    }
    public static void Fibo(int n) {
        int a=0,b=0,c=1;
        while(n--!=0) {
            a=a+b;
            System.out.print(a+"  ");
            b=c;
            c=a;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of terms of Fibonacci series you want to print : ");
        int n=sc.nextInt();
//        Fibo(n);
        for(int i=0;i<=n;i++)
            System.out.print(fibo(i)+"  ");

    }
}
