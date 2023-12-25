public class String_ {
    public static void subString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        System.out.println("substring is : " + substr);
    }

    public static void example() {
        /*
         * String str = "helloWorl";
         * System.out.println(str.substring(0, 5));
         */
        String str[] = { "mango", "apple", "google" };
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }

        }
        System.out.println(largest);

    }

    public static void main(String[] args) {
        example();
        // String str = "helloWorld";
        // subString(str, 0, 5);
    }
}
