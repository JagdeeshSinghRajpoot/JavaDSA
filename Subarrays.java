public class Subarrays {
    public static void printSubarrays(int numbers[]){
        int total = 0;
        for(int i=0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                total++;
                for(int k = i;k<=j;k++){
                    
                    System.out.print(" "+numbers[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total numbers of sub arrays : "+total);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6};
        printSubarrays(numbers);
    }
}
