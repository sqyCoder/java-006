package studnet3;
import java.util.Scanner;
public class Main9{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String name = input.nextLine();
        String sex = input.nextLine();
        int age = input.nextInt();
        input.nextLine();
        String major = input.nextLine();
        String studentID = input.nextLine();
        Student3 stu=new Student3(name,sex,age,major,studentID);
        stu.printInfo();
    }
}