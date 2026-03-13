package arrayandstring;

public class MergeStringAlternatively {
    public static void main(String[] args) {
      String  word1 = "abc";
      String  word2 = "pqr";
      System.out.println(mergeAlternately(word1,word2));

    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder finalString = new StringBuilder();
        for(int i =0; i< (word1.length() + word2.length()); i++){
            if(i < word1.length()) {
                finalString.append(word1.charAt(i));
            }
            if(i < word2.length()){
                finalString.append(word2.charAt(i));
            }
        }
        return finalString.toString();
    }
}
