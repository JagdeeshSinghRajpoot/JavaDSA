public class maxSubarraySumKadanes {
        public static void kadanes(int numbers[]){
            int cs = 0;
            int ms = Integer.MIN_VALUE;
            for(int i = 0;i<numbers.length;i++){
                cs = cs + numbers[i];
                if(cs < 0){
                    cs = 0;
                }
                ms = Math.max(cs, ms);
            }
            System.out.println("our max subarray sum is : "+ ms);
        }
    public static void main(String[] args) {
        // int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int arr[] = {1,-2,6,-1,3};
        kadanes(arr);
    }
}
