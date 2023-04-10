import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // reading the file
        File reading_file = new File("K:/Computer Science (My life)/My Work Station/DSA-Mini project/src/file7.txt");

        // catch if there is no file.
        try{
            Scanner scan = new Scanner(reading_file);
            // reading the whole file line by line
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }

        }catch (IOException e){
            System.out.println("File not fund!");
        }
    }
}
