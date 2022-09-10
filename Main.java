import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Student in Class : ");
        int n=sc.nextInt();

        HigherClassStudents []students=new HigherClassStudents[n];
        int r,a;
        String s,d;
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.printf("Student %d\n", i);
            System.out.print("Name : ");
            s = sc.nextLine();
            System.out.print("Roll No. : ");
            r = sc.nextInt();
            System.out.print("Your Age. : ");
            a = sc.nextInt();
            sc.nextLine();
            System.out.print("Department : ");
            d = sc.nextLine();

            HigherClassStudents tmp=new HigherClassStudents(s,r);
            students[i-1]=tmp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student "+(i+1));
            System.out.printf("Name  : %s\nRoll : %d\nAge : %d\nDepartment : %s\n\n",students[i].getName(),students[i].getRoll(),students[i].getAge(),students[i].getDept());
        }
        sc.close();
    }
}
class Student {
     String name;
     int roll;
     int age;
    public  Student(){    }
    public Student(String n, int r,int age) {

        this.name = n;
        this.roll = r;
        this.age=age;
    }
    public Student(String name,int roll ) {

        this(name,roll,0);
    }
    public Student(String name) {

        this(name,0);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getRoll() {
        return roll;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
class HigherClassStudents extends Student{
    private String Dept;
    HigherClassStudents (String name,int roll ,int age,String dept) {

        super(name,roll,age);
        this.Dept=dept;
    }
    HigherClassStudents (String name,int roll ,int age) {

        super(name,roll,age);
        Dept="CSE";
    }
    HigherClassStudents (String name,int roll ) {

        super(name,roll,18);
        System.out.println("HELOOKLS");
        Dept="CSE";
    }




    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        this.Dept = dept;
    }
}
