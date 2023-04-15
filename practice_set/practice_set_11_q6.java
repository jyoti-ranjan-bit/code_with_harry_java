interface TvRemote{
    void remote();
}
interface SmartTvRemote extends TvRemote{
    void smartRemote();
}
class TV implements TvRemote{
    public void remote(){
        System.out.println(" Remote...");
    }}
    public class practice_set_11_q6 {
    public static void main(String args[]){

        TV t1=new TV();
        t1.remote();
    }
    }



