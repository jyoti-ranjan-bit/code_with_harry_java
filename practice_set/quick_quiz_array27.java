//quick quiz:print elements of array in reverse order
public class quick_quiz_array27 {
    public static void main(String[] args) {
        int[] arr = {68, 45, 23, 32, 41};
        System.out.println(arr.length);
        System.out.println("Array in revers order");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
