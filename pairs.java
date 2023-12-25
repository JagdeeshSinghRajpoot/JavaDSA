public class pairs{
    public static void ArrayPairs(int arr[]){
        int total = 0;
        for(int i = 0;i<arr.length;i++){
            int  curr = arr[i];
            for(int j =i+1;j<arr.length;j++ ){
                total++;
                System.out.print(" ("+ curr +", "+arr[j]+") ");
            }
            System.out.println();
        }
        System.out.println(total);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8};
        ArrayPairs(arr);
    }
}