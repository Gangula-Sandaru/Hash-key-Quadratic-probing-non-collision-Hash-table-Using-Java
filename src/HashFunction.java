import java.util.Arrays;
import java.util.HashMap;

class HashFunction {
    private String[] word;
    private String writableTxt = "Index\t| Character\t| Hash Key\n";
    private String writableTxtLine = "Index\t| Words\n";
    private String writableTxtQKey = "Index\t| Character\t| Hash Key\t | New Hash Key \t | Q Hash Key \n";
    int quadraticHashKey, probes;
    writeFile obj = new writeFile();

    HashFunction(String[] words){
        this.word = words;
    }
    void hashKey(){
        // Create a new HashMap to store the alphabet characters
        HashMap<Character, Integer> englishAlphaList = new HashMap<Character, Integer>();
        // Assign each character from a-z to the values 26-51
        int count = 0;
        for(char c = 'a'; c <= 'z'; c++) {
            englishAlphaList.put(c, count);
            count++;
        }
        // Assign each character from A-Z to the values 0-25
        count = 26;
        for(char c = 'A'; c <= 'Z'; c++) {
            englishAlphaList.put(c, count);
            count++;
        }

        // read word by word.
        for(int i = 0; i < this.word.length; i++){
            String tmpWord = word[i];
            int hashKey = 0;
            // read latter by latter
            for(int j = 0; j < tmpWord.length(); j++){
                // take each value from the hash map that corresponding to each latter.
                char tmpChar = tmpWord.charAt(j);
//                System.out.print(tmpChar + ",");
                // add up all values in to one.
                hashKey +=  englishAlphaList.get(tmpChar);
            }

            // format the table according to the giving criteria
            // task o1
            writableTxt += String.format("%-7d\t| %-10s\t| %-7d\n", i, tmpWord, hashKey);


            // task o3
            writableTxtLine +=  String.format("%-7d\t| %-7s\n", i, tmpWord);


            // task 02
            final int c1 = 1, c2 = 1, c3 = 0;
            // new hash key.
             probes = (c1 * i * i) + (c2 * i) + c3; // according to the giving question.

             quadraticHashKey = (hashKey + probes) % (word.length * 2);

             // format the table according to the question.
             writableTxtQKey += String.format("%-7d\t| %-10s\t| %-7d\t | %-7d\t| %-10s\n", i,word[i], hashKey, probes,quadraticHashKey);
        }

        // sent data to the file functions for the write.
        obj.fileWriter(writableTxt, "wordsHK7"); // first task
        obj.fileWriter(writableTxtQKey, "wordsQHK7"); // second task
        obj.fileWriter(writableTxtLine, "nonCollisionHashTable"); // third task

    }
}
