import java.util.ArrayList;

class Human {
    String name;
    public Human() {
        this.name="NO NAME";
    }
    public Human(String name) {
        this.name=name;
    }
    public String toString() {
        return "I am a Human Being \n my name is "+name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
class Male extends Human{
    public Male(String name) {
        super(name);
    }
    public String toString() {
        return super.toString()+"\n and I am Male";
    }

}

public class GenericsAndWildCard {
    public static void main(String[] args) {
/*        ArrayList<String> arr=new ArrayList<>();
        arr.add("Mango");
        arr.add("Apple");
        arr.add("Litchi");
        show(arr);
*/

        ArrayList<Human> list2=new ArrayList<>();
        Human h1=new Human("Roshan");
        list2.add(new Human("Ram"));
        list2.add(new Human("Shyam"));
        list2.add(h1);
        show(list2);

        ArrayList<Male> list3=new ArrayList<>();
        Human h2=new Male("Roshan");
        list2.add(new Male("Ram"));
        list2.add(new Male("Shyam"));
        list2.add(h2);

        show(list3);


    }
//    public static void show(ArrayList<? super Male> list) {
    public static void show(ArrayList<? extends Human> list) {
//        for(Object x : list )
        for(Human x : list)  {
            System.out.println(x.toString());
        }
    }
}
