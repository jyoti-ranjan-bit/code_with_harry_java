class rectanglee{
    private int length;
    private int breadth;

    public rectanglee() {
        this.length = 4;
        this.breadth = 5;
    }

    public rectanglee(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class practice_set_9_q4 {

    public static void main(String[] args) {
        rectanglee r = new rectanglee();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

    }}
