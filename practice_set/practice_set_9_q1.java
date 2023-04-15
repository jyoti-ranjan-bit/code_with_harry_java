class Cylinder{
   private int radius;
  private int height;
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }

    public void setHeight(int h) {
        height = h;
    }

    public void setRadius(int r) {
        radius = r;
    }
public class practice_set_9_q1 {
    public static void main(String[] args) {
        Cylinder ob = new Cylinder();
        ob.setHeight(7);
        System.out.println(ob.getHeight());
        ob.setRadius(12);
    }
}
}
