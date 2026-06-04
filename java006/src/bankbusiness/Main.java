package bankbusiness;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankBusiness.welcome();

        String n = sc.next();
        String p = sc.next();
        BankBusiness acc = new BankBusiness(n, p);

        String p1 = sc.next();
        double m1 = sc.nextDouble();
        acc.deposit(p1, m1);

        String p2 = sc.next();
        double m2 = sc.nextDouble();
        acc.withdraw(p2, m2);

        String p3 = sc.next();
        double m3 = sc.nextDouble();
        acc.withdraw(p3, m3);

        String p4 = sc.next();
        double m4 = sc.nextDouble();
        acc.withdraw(p4, m4);

        BankBusiness.welcomeNext();
        sc.close();
    }
}