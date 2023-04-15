class mythread1 extends Thread{
  public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}
class mythread2 extends Thread{
  public  void run(){
        while(true){
            System.out.println("welcome");
        }
    }
}
public class practice_set_13q1 {
    public static void main(String[] args) {
        mythread1 ob1=new mythread1();
        mythread2 ob2=new mythread2();
        ob1.start();
        ob2.start();
    }

}
