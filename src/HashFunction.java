import java.util.HashMap;

class HashFunction {
    private String[] word;
    private String writableTxt = "Index\t| Character\t| Hash Key\n";;
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


//        for(char c : englishAlphaList.keySet()) {
//            System.out.println(c + " = " + englishAlphaList.get(c));
//        }

        for(int i = 0; i < this.word.length; i++){
            String tmpWord = word[i];
            int hashKey = 0;
            for(int j = 0; j < tmpWord.length(); j++){
                char tmpChar = tmpWord.charAt(j);
//                System.out.print(tmpChar + ",");
                hashKey +=  englishAlphaList.get(tmpChar);
            }
//            System.out.println(i +"  word: " + tmpWord + " Key: " + hashKey + "\n");
//            System.out.print("\n"); // print space after each word

            writableTxt += String.format("%-7d\t| %-10s\t| %-7d\n", i, tmpWord, hashKey);
            quadraticHashFunction(tmpWord,hashKey,i, word.length);

        }
        obj.fileWriter(writableTxt);
    }

    private void quadraticHashFunction(String word, int hashKey, int i, int tableSize){
        int quadraticHashKey, probes;
        final int c1 = 1, c2 = 1, c3 = 0;

         probes = (c1 * i * i) + (c2 * i) + c3;
         quadraticHashKey = (hashKey + probes) % tableSize;

         System.out.println("Q key: " + quadraticHashKey);
    }
}
