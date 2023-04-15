abstract class pen1{
    abstract void write1();
    abstract void refil1();
}
class FountainPen extends pen1{
    public void write1(){
        System.out.println("write");
    }
    public void refil1(){
        System.out.println("refil");
    }
    public void changeNib(){
        System.out.println("change nib");
    }
}
public class practice_set_11_q2 {
    public static void main(String[] args) {
        FountainPen ob=new FountainPen();
        ob.write1();
        ob.refil1();
        ob.changeNib();
    }
}
