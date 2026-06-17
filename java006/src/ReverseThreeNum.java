import java.util.Scanner;
public class ReverseThreeNum {
        public static void main(String[] agrs){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=(a%10)*100;
            int c=((a/10)%10)*10;354
            int d=a/100;
            System.out.println(b+c+d);
        }
    }