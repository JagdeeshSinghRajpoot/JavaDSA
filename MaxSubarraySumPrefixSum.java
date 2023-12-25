public class MaxSubarraySumPrefixSum{
    public static void maxSubarraySum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[numbers.length];
        
        prefix[0] = numbers[0];
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0;i<prefix.length;i++){
            for(int j = i;j<prefix.length;j++){
                currSum = i == 0 ? prefix[i] : prefix[j] - prefix[i-1];
                if(maxSum < currSum){
                maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    } 
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSubarraySum(arr);
    }
}