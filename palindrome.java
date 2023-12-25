public class palindrome {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float question2(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dar = path.charAt(i);
            if (dar == 'S') {
                y--;
            } else if (dar == 'N') {
                y++;
            } else if (dar == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void example() {
        String str1 = "jagdeesh";
        String str2 = "jagdeesh";
        String str3 = new String("jagdeesh");

        if (str1 == str2) {
            System.out.println("string are equal");
        } else {
            System.out.println("string are not equal");
        }

        // if(str1 == str3){
        // System.out.println("string are equal");
        // }else{
        // System.out.println("string are not equal");
        // }
        if (str1.equals(str3)) {
            System.out.println("string are equal");
        } else {
            System.out.println("string are not equal");
        }

    }

   

    public static void main(String[] args) {
        String str = new String("helloWorld");
        // System.out.println(isPalindrome(str));

        // String path = "WNEENESENNN";
        // System.out.println(question2(path));
        // example();

        
    }

}
