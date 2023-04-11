import java.util.Arrays;

class DataModifiers {

    // special and number remover function.
    String[] stringRemover(String text) {
        // todo ignore the case. fix this
        String stringRm;
        // store split data in the list form
        String[] modifiedDataList;
        // replace with white space , remove special characters , numbers using regular expression
        stringRm = text.replaceAll("[^a-zA-Z]+", " ");

        // split the words
        modifiedDataList = stringRm.split(" ");

        String[] uniqueDataList = new String[modifiedDataList.length];
        int uniqueDataCount = 0;
        boolean[] seen = new boolean[modifiedDataList.length];

        for (int i = 0; i < modifiedDataList.length; i++) {
            String currentWord = modifiedDataList[i].replaceAll("[\\s+]", "");

            if (!seen[i]) {
                uniqueDataList[uniqueDataCount++] = currentWord;
                seen[i] = true;
            }

            for (int j = i + 1; j < modifiedDataList.length; j++) {
                if (!seen[j] && currentWord.equalsIgnoreCase(modifiedDataList[j].replaceAll("[\\s+]", ""))) {
                    seen[j] = true;
                }
            }
        }

        // Trim the uniqueDataList to remove null elements
        uniqueDataList = Arrays.copyOf(uniqueDataList, uniqueDataCount);

        return uniqueDataList;
    }

//    // similar word catcher
//    String[] wordCatcher(String[] word_list){
//        System.out.println("3");
////        for(int i = 0; i <= word_list.length; i++){
////            if(word_list[i].contains())
////        }
//    }
}
