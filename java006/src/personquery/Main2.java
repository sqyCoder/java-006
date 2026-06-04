package personquery;
import java.util.Scanner;
public class Main2  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Person[] per=new Person[n];
        for(int i=0;i<n;i++){
            String name=sc.next();
            int age=sc.nextInt();
            per[i]=new Person(name,age);
            System.out.println(per[i]);
        }
        String target=sc.next();
        for(int j=0;j<n;j++){
            if(per[j].getName().equals(target)){
                System.out.println("查询结果：");
                System.out.println(per[j]);
                return;
            }
        }
        System.out.println("not found");
    }
}
