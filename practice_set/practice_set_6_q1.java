public class practice_set_6_q1 {
    public static void main(String[] args) {
        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0.0f;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        System.out.println(sum);
    }
}