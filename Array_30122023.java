
//Linear Search
public class Array_30122023 {

    static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];

            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }

        }
        System.out.println("This is smallest value =" + smallest);
        return largest;

    }

    static int LinearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (key == numbers[i]) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int key = 10;

        int index = LinearSearch(numbers, key);
        if (index == -1) {
            System.out.println("not hava this key");
        }
        System.out.println("key's index is = " + index);

        System.out.println("this largest value of this Array is = " + getLargest(numbers));

    }
}
