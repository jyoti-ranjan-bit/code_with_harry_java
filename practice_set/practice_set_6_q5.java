public class practice_set_6_q5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int l=arr.length;
        int n=Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
