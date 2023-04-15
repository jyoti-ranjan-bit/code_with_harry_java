class Circle1{
    public int radius;
    Circle1(){
        System.out.println("I am non param of circle");
    }
    Circle1(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class practice_set_10_q1 {
    public static void main(String[] args) {
        // Problem 1
       //  Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1(12,4);
    }
}

