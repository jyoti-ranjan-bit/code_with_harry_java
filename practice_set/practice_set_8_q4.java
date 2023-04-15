class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }

}
public class practice_set_8_q4 {
    public static void main(String[] args) {
        Rectangle sq=new Rectangle();
        sq.length=5;
        sq.breadth=2;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }
}
