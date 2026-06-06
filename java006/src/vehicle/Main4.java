package vehicle;
import java.util.Scanner;
public class Main4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String plateNo1=sc.next();
        int wheel1=sc.nextInt();
        Vehicle objVehicle=new Vehicle(plateNo1,wheel1);
        System.out.println("车辆信息如下：");
        objVehicle.show();
        String plateNo2=sc.next();
        int wheel2=sc.nextInt();
        int passenger=sc.nextInt();
        Bus objBus=new Bus(plateNo2,wheel2,passenger);
        System.out.println("客车信息如下：");
        objBus.show();
        sc.close();
    }
}