package arrayandstring;

public class GcdOfStrings {
    public static void main(String[] args) {
        String  str1 = "ABCABC";
        String  str2 = "ABC";
        System.out.println(gcdOfStrings(str1,str2));
    }

        public static String gcdOfStrings(String str1, String str2) {
            String output = null;
            int str1Size = str1.length();
            int str2Size = str2.length();
            int size = Math.min(str1Size,str2Size);

            for(int i=1;i<= size ; i++){
                String part1 = str1.substring(0,i);
                String part2 = str2.substring(0,i);
                if(part1.equals(part2) &&
                        (str1Size % part1.length()==0) &&
                        (str2Size % part2.length()==0)
                ){
                    output = part1;
                }
            }

            if (output==null){
                return "";
            }

            String maxStr ="";
            String smallStr="";
            if (str1Size > str2Size){
                maxStr =str1;
                smallStr=str2;
            }else{
                maxStr =str2;
                smallStr=str1;
            }

            for (int i=0;i<maxStr.length();i += output.length()){

                String substring = maxStr.substring(i, i+output.length());
                if(!substring.equals(output)){
                    return "";
                }
            }
            for (int i=0;i<smallStr.length();i += output.length()){

                String substring = smallStr.substring(i, i+output.length());
                if(!substring.equals(output)){
                    return "";
                }
            }
            return output;
        }
}
