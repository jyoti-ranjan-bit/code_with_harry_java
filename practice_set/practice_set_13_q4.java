class mythread7 extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}
class mythread8 extends Thread{
    public  void run(){
    //    while(true){
      //      System.out.println("welcome");
        //}
    }
}
public class practice_set_13_q4 {
    public static void main(String[] args) {
        mythread7 ob1=new mythread7();
        mythread8 ob2=new mythread8();
        ob1.setPriority(6);
        ob2.setPriority(9);
        System.out.println(ob1.getPriority());
        System.out.println(ob2.getPriority());
        System.out.println(ob2.getState());
        //  ob1.start();
         ob2.start();
        System.out.println(ob2.getState());
    }

}
