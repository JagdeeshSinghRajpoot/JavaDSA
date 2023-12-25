import java.util.*;
public class jagdeesh {

    public static void main(String[] args) {
        Integer arr[] = {1,3,6,7,4,3};
        Arrays.sort(arr,Collections.reverseOrder());
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
