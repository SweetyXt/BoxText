import java.util.Scanner;
import javax.swing.JOptionPane;
class Box{
    private double length;
    private double width;
    private double high;
    public Box(double a,double b,double c){
        if(a<=0||b<=0||c<=0){
            System.out.println("非法数字");
            length=0;
            width=0;
            high=0;
        }else{
            length=a;
            width=b;
            high=c;
        }
    }
    public double getVolume(){
        return (high*width*length);
    }
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHigh() {
        return high;
    }
}

public class BoxText {
    public static void main(String args[]){
        double l,w,h;
        Scanner in=new Scanner(System.in);
        System.out.println("input length");
        l=in.nextDouble();
        System.out.println("input width");
        w=in.nextDouble();
        System.out.println("input high");
        h=in.nextDouble();
        Box box=new Box(l,w,h);
        System.out.printf("the volumn of box(%.2f,%.2f,%.2f)is %.2f.\n",box.getLength(),box.getWidth(),box.getHigh(),box.getVolume());
    }
}
