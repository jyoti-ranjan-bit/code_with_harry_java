class cylinder{
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
    public double surfacearea(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class practice_set_9_q2 {
    public static void main(String[] args) {
        cylinder ob=new cylinder();
        ob.setHeight(7);
        System.out.println(ob.getHeight());
        ob.setRadius(12);
        System.out.println(ob.getRadius());
        System.out.println(ob.surfacearea());
        System.out.println(ob.volume());

    }
}



