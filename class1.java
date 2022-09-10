class Frog {
//public void hello() {
//        System.out.println("Hello world !!");
//    }

    @Override
    public boolean equals(Object obj) {
        var equals = super.equals(obj);
        System.out.println("Equals Method called.");
        return equals;
    }
}

public class class1 {
    public static void main(String[] args) {
        Frog frog1=new Frog();
        Frog frog2=new Frog();
//        System.out.println(frog1);
        System.out.println(frog1.hashCode());
//        System.out.println(frog2);
    }
}
