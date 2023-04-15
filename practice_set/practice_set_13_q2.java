class mythread3 extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning");
        }
    }
}
class mythread4 extends Thread{
    public  void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
          catch  (Exception e){
              System.out.println(e);
          }
            System.out.println("welcome");
        }
    }
}
public class practice_set_13_q2 {
    public static void main(String[] args) {
        mythread3 ob1=new mythread3();
        mythread4 ob2=new mythread4();
        ob1.start();
        ob2.start();
    }

}

