public class Assignment_Array_1 {
    public static boolean Question1(int nums[]){
        for(int i = 0;i<nums.length;i++){
            for(int j =i+i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(Question1(nums));
    }
    
}
