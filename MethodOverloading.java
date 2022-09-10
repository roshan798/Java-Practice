public class MethodOverloading {
    static  int sum(int a,int b){
        return  a+b;
   }
    static  int sum(int a,int b,int c){
        return  a+b+c;
    }
    static int sum(int a,int b,int c,int d){
        return  a+b+c+d;
    }
//    static int sum(int )
    public static void main(String[] args) {
        System.out.println("sum of 4 + 5 + 9 = "+sum(4,5));
        System.out.println("sum of 4 + 5 + 9 = "+sum(4,5,9));
        System.out.println("sum of 4 + 5 + 9 + 65= "+sum(4,5,9,65));

    }
}
