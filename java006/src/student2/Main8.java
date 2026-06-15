package student2;
import java.util.Scanner;
public class Main8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        Student2[] stu=new Student2[k];
        for(int i=0;i<k;i++){
            String number=sc.next();
            String name=sc.next();
            int age=sc.nextInt();
            stu[i]=new Student2(number,name,age);
            if(stu[i].getAge()>=7 &&stu[i].getAge()<=60){
                System.out.println(stu[i]);
            }
            else{
                System.out.println("bad");
            }
        }
    }
}