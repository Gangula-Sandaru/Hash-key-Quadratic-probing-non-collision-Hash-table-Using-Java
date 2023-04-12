import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class FileReader {
    private String path = "";
    // constructorscnz
    FileReader(String path){
        this.path = path;
    }


    String Read_file() {
        // store file data
        String file_data = "";

        // reading the file
        File reading_file = new File(this.path);

        // catch if there is no file.
        try {
            Scanner scan = new Scanner(reading_file);
            // reading the whole file line by line
            while (scan.hasNextLine()) {
                file_data = file_data.concat(scan.nextLine() + "\n");
            }

        } catch (
                IOException e) {
            System.out.println("File not fund!");
        }

        // print the file data
        return  file_data;

    }
}
