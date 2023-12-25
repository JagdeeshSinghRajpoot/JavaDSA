public class stringBuilder {
    public static void a_z() {
        StringBuilder sb = new StringBuilder("");
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }

    public static String toUpercase(String str) {
        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String stringCompression(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) { // O(n)

            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i + 1) == str.charAt(i)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
        }
        return newStr;
    }

    public static int countvowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    // public static boolean anagrams(String str1, String str2){
    //     if(str1.length() == str2.length()){
    //         for();
    //     }
    //     return false;
    // }

    public static void main(String[] args) {
        // String str = "hi, i am jagdeesh rajpoot ";
        // System.out.println(toUpercase(str));
        String str = "jagdeesh rajpoot";
        System.out.print(stringCompression(str));

    }
}
