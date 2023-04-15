import java.util.concurrent.Callable;

class Circle{
    int radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
public class practice_set_8_q6 {
    public static void main(String[] args) {
        Circle ob=new Circle();
        ob.radius=4;
        System.out.println(ob.area());
        System.out.println(ob.perimeter());


            }
        }



