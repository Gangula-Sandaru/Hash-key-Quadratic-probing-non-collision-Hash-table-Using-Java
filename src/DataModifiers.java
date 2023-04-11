import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class DataModifiers {

    // special and number remover function.
    public static String[] stringRemover(String text) {
        // Replace non-alphabetic characters with whitespace and split into words
        String[] words = text.replaceAll("[^a-zA-Z]+", " ").split("\\s+");
        // Create a HashSet to store unique words
        Set<String> uniqueWords = new HashSet<>();
        // Loop through words
        for (String word : words) {
            // If word is not already in uniqueWords and is not identical to an existing word (ignoring case),
            // add it to the uniqueWords set
            if (!uniqueWords.contains(word) && !uniqueWords.contains(word.toLowerCase()) && !uniqueWords.contains(word.toUpperCase())) {
                uniqueWords.add(word);
            }
        }
        // Convert uniqueWords set back to an array and return
        return uniqueWords.toArray(new String[uniqueWords.size()]);
    }


//    // similar word catcher
//    String[] wordCatcher(String[] word_list){
//        System.out.println("3");
////        for(int i = 0; i <= word_list.length; i++){
////            if(word_list[i].contains())
////        }
//    }
}
