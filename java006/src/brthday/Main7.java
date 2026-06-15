package brthday;
import java.util.Scanner;
public class Main7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int month=sc.nextInt();
        int day=sc.nextInt();
        Birthday bir=new Birthday(year,month,day);
        System.out.println("age="+bir.getAge());
    }
}