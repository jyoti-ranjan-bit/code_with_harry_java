public class square {
    int side;
    public static int area(int n){
        return n*n;
    }
    public static int perimeter(int n){
        return 4*n;
    }
    public static void main(String[] args) {
        int side=3;
        System.out.println(area(side));
        System.out.println(perimeter(side));

    }
}
