package FileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadingTextFile{
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "C:/Users/rosha/OneDrive/Desktop/Hello.txt";

//        try (Scanner scan = new Scanner(textFile)) {
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
            File textFile=new File(filename);
            Scanner scan=new Scanner(textFile);
            while (scan.hasNextLine()) {
//            System.out.print(i+". ");
//            String line =;
                System.out.println(scan.nextLine());
//            i++;
//            if(i>10)break;
            }
            scan.close();
//        }
//        catch(FileNotFoundException e) {
//            System.out.println();
//        }

        int i=1;



    }
}
