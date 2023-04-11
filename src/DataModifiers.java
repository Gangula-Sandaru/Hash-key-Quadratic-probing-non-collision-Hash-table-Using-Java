class DataModifiers {

    // special and number remover function.
    String[] stringRemover(String text){
        String stringRm;
        // store split data in the list form
        String[] modifiedDataList, finalList = new String[];
        int count = 0;

        stringRm = text.replaceAll("[^a-zA-Z]"," ");

        // split the words
        modifiedDataList = stringRm.split(" ");

        for(int i = 0; i <= (modifiedDataList.length) - 1; i++){
            if(!modifiedDataList[i].equals(" ")){
                finalList[count] = modifiedDataList[i];
                count++;
            }
        }

        return finalList;
    }

    // similar word catcher
    String wordCatcher(String word_list){

        System.out.println("hi");
        return null;
    }
}
