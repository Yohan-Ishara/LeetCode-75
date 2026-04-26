package arrayandstring;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a'};
        char[] arr = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(arr));
    }

    public static int compress(char[] chars) {

        int i = 0;       // read pointer
        int write = 0;   // write pointer

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            // count duplicates
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            // write character
            chars[write++] = current;

            // write count if more than 1
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
