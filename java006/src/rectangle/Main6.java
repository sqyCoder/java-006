package rectangle;
import java.util.Scanner;
public class Main6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Rectangle rect=new Rectangle();
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        rect.setXY(a,b);
        System.out.print("面积为"+rect.getArea()+"\n");
        System.out.print("周长为"+rect.getPerimeter());
    }
}