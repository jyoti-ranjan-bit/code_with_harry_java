public class practice_set_6_q3 {
    public static void main(String[] args) {
        int [] marks={75,89,90,92,85};
        int sum=0;
        for(int element:marks)
            sum=sum+element;
        System.out.println("the average of marks is: "+sum/marks.length );
    }
}
