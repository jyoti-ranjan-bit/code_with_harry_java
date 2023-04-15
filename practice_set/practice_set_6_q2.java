public class practice_set_6_q2 {
    public static void main(String[] args) {
        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 63.4f;
        boolean isInArray = false;
        for (int i = 0; i < marks.length; i++) {
            if (num == marks[i]) {
                isInArray = true;
                break;
            }
        }
        if (isInArray==true) {
            System.out.println("present ");
        } else {
            System.out.println("not present");
        }

    }
}

