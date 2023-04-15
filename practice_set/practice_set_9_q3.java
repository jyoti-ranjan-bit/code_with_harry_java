class CYLINDERR{
    private int radius;
    private int height;
    public CYLINDERR(int r,int h){
        radius=r;
        height=h;
    }
    public int getRadius(){
      return radius;
    }
    public int getHeight(){

        return height;
    }

   // public void setHeight(int h) {
     //   height = h;
    //}

    //public void setRadius(int r) {
      //  radius = r;
    //}
    public double surfacearea(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class practice_set_9_q3 {
    public static void main(String[] args) {
        CYLINDERR ob=new CYLINDERR(9,12);
        //ob.setHeight(7);
        System.out.println(ob.getHeight());
      //  ob.setRadius(12);
        System.out.println(ob.getRadius());
        System.out.println(ob.surfacearea());
        System.out.println(ob.volume());
    }
}
