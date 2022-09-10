import java.util.Arrays;

public class forEach {
    public static void main(String[] args) {
        int[] a = {2,5,3,7,2,2,7,3};
        System.out.println(a.length);
        long count = 0;
        for (int i : a) {
            if (i==2)
             count++;
        }
        System.out.println(count);
    }
}
