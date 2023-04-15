class monkey{
    void jump(){
        System.out.println("jumop");
    }
    void bite(){
        System.out.println("bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements BasicAnimal{
   void speak(){
       System.out.println("hello sir");
   }

    @Override
    public void eat() {
        System.out.println("eat");
    }
    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
public class practice_set_11_q3 {
    public static void main(String[] args) {
        human ob=new human();
        ob.eat();
        ob.sleep();
        ob.speak();
        ob.bite();
        ob.jump();

    }
}
