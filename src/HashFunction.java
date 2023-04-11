import java.util.HashMap;

class HashFunction {
    private String[] word;

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


        for(char c : englishAlphaList.keySet()) {
            System.out.println(c + " = " + englishAlphaList.get(c));
        }

        for(int i = 0; i < this.word.length; i++){
            String tmpWord = word[i];
            int hashKey = 0;
            for(int j = 0; j < tmpWord.length(); j++){
                char tmpChar = tmpWord.charAt(j);
                System.out.print(tmpChar + ",");
                hashKey +=  englishAlphaList.get(tmpChar);
            }
            System.out.println("word: " + tmpWord + " Key: " + hashKey);
            System.out.print("\n"); // print space after each word
        }
    }

}
