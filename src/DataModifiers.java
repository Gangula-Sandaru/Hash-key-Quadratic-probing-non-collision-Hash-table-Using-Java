class DataModifiers {

    // special and number remover function.
    String[] stringRemover(String text){
        String stringRm;
        // store split data in the list form
        String[] modifiedDataList;
        // replace with white space , remove special characters , numbers using regular expression
        stringRm = text.replaceAll("[^a-zA-Z]+"," ");

        // split the words
        modifiedDataList = stringRm.split(" ");

        for(int i = 0; i <= (modifiedDataList.length) - 1; i++){
            //remove new line of the string
            modifiedDataList[i] = modifiedDataList[i].replaceAll("[\\s+]", "");
        }
        return modifiedDataList;
    }


    // similar word catcher
    String wordCatcher(String word_list){

        System.out.println("hi");
        return null;
    }
}
