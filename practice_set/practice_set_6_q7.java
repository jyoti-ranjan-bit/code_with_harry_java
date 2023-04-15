public class practice_set_6_q7 {
    public static void main(String[] args) {
        int[]arr={15,10,45,2,56,5};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
