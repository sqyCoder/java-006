package bankbusiness;
import java.util.Scanner;
class BankBusiness {
    public static String bk = "中国银行";
    private String n;
    private String p;
    private double bal;

    public BankBusiness(String name, String pwd) {
        n = name;
        p = pwd;
        bal = 0;
    }

    public static void welcome() {
        System.out.println(bk + "欢迎您的到来！");
    }

    public static void welcomeNext() {
        System.out.println("请收好您的证件和物品，欢迎您下次光临！");
    }

    public void deposit(String pwd, double m) {
        if (!pwd.equals(p)) {
            System.out.println("您的密码错误！");
            return;
        }
        bal += m;
        System.out.println("您的余额有" + bal + "元。");
    }

    public void withdraw(String pwd, double m) {
        if (!pwd.equals(p)) {
            System.out.println("您的密码错误！");
            return;
        }
        if (bal < m) {
            System.out.println("您的余额不足！");
            return;
        }
        bal -= m;
        System.out.println("请取走钞票，您的余额还有" + bal + "元。");
    }
}
