import java.util.*;
public class MinorAtmMachine {
    public static void main(String[] args){
        ATM obj = new ATM();
        obj.checkpin();
    }
}
class ATM{
    float Balance;
    int PIN = 7378;

    public void checkpin(){
        System.out.println("Enter Your PIN");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if(enteredPin == PIN){
            menu();
        }
        else{
            System.out.println("Enter Valid PIN");
            menu();
        }
    }

    public void menu(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Chech A/C balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            withdrawMoney();
        }
        else if(opt == 3){
            depositMoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Kindly enter a valid choice");
        }
    }

    public void checkBalance(){
        System.out.println("Your current balance is "+ Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        if(Amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - Amount;
            System.out.println("Money withdrawal successfully");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposited sufficient");
        menu();
    }

}

