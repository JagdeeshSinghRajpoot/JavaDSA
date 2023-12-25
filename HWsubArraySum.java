import java.util.*;

public class HWsubArraySum {
    public static void printSubarrays(int numbers[]){
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int total = 0;
        for(int i=0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                total++;
                int sum = 0;
                for(int k = i;k<=j;k++){
                    sum += numbers[k];
                }
                System.out.print("sum : "+sum);
                System.out.println();
                if(maximum < sum){
                    maximum = sum;
                }
                if(minimum > sum){
                    minimum = sum;
                }
                
            }
            
        }
        System.out.println("maximum value is : "+ maximum);
        System.out.println("minimum value is : "+ minimum);
        System.out.println("total numbers of sub arrays : "+ total);
    }

    public static void main(String[] args) {
        int arr[] = {1,-1,6,-1,3};
        printSubarrays(arr);
    }
}