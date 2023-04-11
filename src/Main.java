import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // store modified data in the list
        String[] modifiedData;


        // create file reader obj and pass the path
        FileReader reader = new FileReader("K:/Computer Science (My life)/My Work Station/DSA-Mini project/src/file7.txt");
        //create Data modifiers obj
        DataModifiers modifiers = new DataModifiers();

        // read the file and remove the special and number characters then store it in the modified data variable
        modifiedData = modifiers.stringRemover(reader.Read_file());

        // created object for the hash function
        HashFunction hash_f = new HashFunction(modifiedData);

        hash_f.hashKey();

//        for(int i = 0; i <= (modifiedData.length) -1 ; i++){
//            System.out.println(modifiedData[i]);
//        }
//        System.out.println(Arrays.toString(modifiedData));

    }
}
