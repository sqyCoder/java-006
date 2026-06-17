package bankAccount;

class BankAccount{
    int balance;
    public BankAccount(){
        this.balance=0;
    }
    public BankAccount(int inbalance){
        this.balance=inbalance;
    }
    public int getBlance(){
        return balance;
    }
    public int withdraw(int amount){
        this.balance=this.balance-amount;
        return this.balance;
    }
    public int deposit(int amount){
        this.balance=this.balance+amount;
        return this.balance;
    }
}
