public class practice_set_14_q2 {
    public static void main(String[] args) {
        try{
            int a=666/0;
        }
        catch(ArithmeticException e){
            System.out.println("haha");
        }
        catch(IllegalArgumentException e){
            System.out.println("hehe");
        }
    }
}
