public class practice_set_7_q6 {
    public static int avg(int...arr) {
        int sum = 0;
        int avg=0;
        for (int s : arr) {
            sum = sum + s;
            avg = sum / arr.length;
        }
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(avg(10,20));
        }

    }

