import java.util.Scanner;
public class Test {
    int r;
    public void insert(int n) {
        r=n;
    }
    public void print () {
        System.out.println(3.14 * r* r);
    }
}
class test15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        Test obj=new Test();
        obj.insert(r);
        obj.print();
    }
}
