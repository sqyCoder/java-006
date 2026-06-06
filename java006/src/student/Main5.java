package student;
import java.util.Scanner;
public class Main5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student stu1=new Student();
        String name1=sc.next();
        double score1=sc.nextDouble();
        stu1.setName(name1);
        stu1.setScore(score1);
        String name2=sc.next();
        double score2=sc.nextDouble();
        Student stu2=new Student(name2,score2);
        System.out.print("stu1: name="+stu1.getName()+",score=");
        System.out.printf("%.1f",stu1.getScore());
        System.out.println();
        System.out.print("stu2: name="+stu2.getName()+",score=");
        System.out.printf("%.1f",stu2.getScore());
        sc.close();
    }
}
