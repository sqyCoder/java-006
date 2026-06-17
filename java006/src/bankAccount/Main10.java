package bankAccount;
import java.util.Scanner;
public class Main10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        int amount1=sc.nextInt();
        int amount2=sc.nextInt();
        if(balance<0){
            System.out.println("输入的数据不能为负数");
        }
        if(balance<amount1 && balance>0){
            System.out.println("账户余额不足");
        }
        BankAccount bank=new BankAccount(balance);
        if(balance>0){
            System.out.println("账户的初始余额是:"+bank.getBlance());
            if(balance>=amount1){
                System.out.println("取款后,账户的余额是:"+bank.withdraw(amount1));
                System.out.print("存款后,账户的余额是:"+bank.deposit(amount2));
            }
        }

    }
}