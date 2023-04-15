class monkey1{
    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }
}
interface BasicAnimal1{
    void eat();
    void sleep();
}
class human1 extends monkey1 implements BasicAnimal{
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
public class practice_set_11_q5 {
    public static void main(String[] args) {
        monkey1 ob=new human1();
        ob.bite();
        ob.jump();
        //ob.speak():  cannot use speak because the reference is monkey which does not have speak method
    }
}