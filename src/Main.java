import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    // special and number remover function.
    public String stringRemover(String text){
        String stringRm;
        stringRm = text.replaceAll("[^a-zA-Z]","");
        return stringRm;
    }

    public static void main(String[] args){
        Main obj = new Main();
        // store file data
        String file_data = "";

        // reading the file
        File reading_file = new File("K:/Computer Science (My life)/My Work Station/DSA-Mini project/src/file7.txt");

        // catch if there is no file.
        try{
            Scanner scan = new Scanner(reading_file);
            // reading the whole file line by line
            while(scan.hasNextLine()){
                file_data = file_data.concat(scan.nextLine() + "\n");
            }

        }catch (IOException e){
            System.out.println("File not fund!");
        }

        // print the file data
        System.out.println(obj.stringRemover(file_data));
    }
}
