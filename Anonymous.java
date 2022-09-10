class Base {
    public void type() {
        System.out.println("I am of Base type");
    }
}
interface Plant {
    void grow();
}
public class Anonymous {
    public static void main(String[] args) {
        // anonymous class example
        Base b1=new Base(){
            @Override
            public void type() {
                System.out.println("I am override Base Method");
            }
        };
        b1.type();
//        Plant p1=new Plant() {
//            @Override
//            public void grow() {
//                System.out.println("Plant Growing...");
//            }
//        };
        //  same lambda method
         Plant p1= () -> System.out.println("Plant Growing...");
        p1.grow();
    }
}
