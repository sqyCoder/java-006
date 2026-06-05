package studentinfo;
import java.util.Scanner;
public class Main3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name1=sc.next();
        int age1=sc.nextInt();
        Student object1=new Student(name1,age1);
        String name2=sc.next();
        int age2=sc.nextInt();
        String major=sc.next();
        Undergraduate object2=new Undergraduate(name2,age2,major);
        System.out.println(object1.show());
        System.out.println(object2.show());
        sc.close();
    }
}