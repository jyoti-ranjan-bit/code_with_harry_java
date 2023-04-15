class mythread9 extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}
class mythread10 extends Thread{
    public  void run(){
        //    while(true){
        //      System.out.println("welcome");
        //}
    }
}
public class practice_set_13_q5 {
    public static void main(String[] args) {
        mythread9 ob1=new mythread9();
        mythread10 ob2=new mythread10();
        ob1.setPriority(6);
        ob2.setPriority(9);
        System.out.println(ob1.getPriority());
        System.out.println(ob2.getPriority());
        System.out.println(ob2.getState());
        //  ob1.start();
        ob2.start();
        System.out.println(ob2.getState());
        System.out.println(Thread.currentThread().getState());
    }

}
