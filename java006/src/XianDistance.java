import java.util.Scanner;
public class XianDistance{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int answer=Math.abs(c-a)+Math.abs(d-b);
        System.out.println(answer);
    }
}