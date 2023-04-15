abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartphone extends telephone{
    void dance(){
        System.out.println("dancing");
    }
   public void ring(){
        System.out.println("ring");
    }
   public void lift(){
        System.out.println("lift");
    }
    void disconnect(){
        System.out.println("disconnect");
    }
}
public class practice_set_11_q4 {
    public static void main(String[] args) {
        telephone ob =new smartphone();
        ob.lift();
        // ob.dance();  cannot use dance because the reference is telephone which does not have dance method
        }
    }

