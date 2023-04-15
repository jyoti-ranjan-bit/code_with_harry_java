class mythread5 extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}
class mythread6 extends Thread{
    public  void run(){
        while(true){
            System.out.println("welcome");
        }
    }
}
public class practice_set_13_q3 {
public static void main(String[] args) {
        mythread5 ob1=new mythread5();
        mythread6 ob2=new mythread6();
        ob1.setPriority(6);
        ob2.setPriority(9);
    System.out.println(ob1.getPriority());
    System.out.println(ob2.getPriority());
      //  ob1.start();
       // ob2.start();
    }

}
