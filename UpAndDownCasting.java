class Machine {
    public static int count=0;
    public Machine() {
        count++;
        System.out.println("Machine count : "+count);
    }
    public void start() {
        System.out.println("Machine Started ...");
    }
}
class Camera extends Machine{
//    public void Machine() {}
    public Camera() {
        System.out.println("Camera count : "+count);
        count++;
    }
    public void start() {
        System.out.println("Camera opened ...");
    }
    public void snap() {
        System.out.println("Photo Snapped ...");
    }
}
public class UpAndDownCasting {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        System.out.println(Machine.count);
        Camera camera1 = new Camera();
        System.out.println(Camera.count);
        machine1.start();
        camera1.start();
        camera1.snap();

        //UpCasting
        machine1= camera1;
//       (machine1= camera1;) is same as  (machine1=(Machine)camera1;)
        machine1.start();
//        Won't Work
//        machine1.snap();
        //since the reference is of type Machine
        // so the Snap method of Camera Class will not work

        //DownCastinge
//        Machine machine2=new Machine();
//        Camera camera2=(Camera)machine2;
//        since the object is of type Machine and reference is of type Camera
//        so this will give runtime error
//        camera2.snap();

//        camera2.start();
    }
}
