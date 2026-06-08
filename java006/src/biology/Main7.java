package biology;
import java.util.Scanner;
public class Main7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String school=sc.next();
        Pupil zhangsan=new Pupil();
        zhangsan.setSchool(school);
        System.out.println("我的学校是"+zhangsan.getSchool());
        zhangsan.breathe();
        zhangsan.eat();
        zhangsan.sleep();
        zhangsan.think();
    }
}