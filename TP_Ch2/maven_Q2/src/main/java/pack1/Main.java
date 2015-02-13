package pack1;
import java.awt.*;
import java.util.Scanner;
import java.lang.*;

/**
 * Created by student on 2015/02/13.
 */
public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        AccountHolder accHol = new AccountHolder();
        int activity;

        System.out.println("Enter account number: ");
        accHol.setAccountNumber(input.nextLine());
        System.out.println("What would you like to do?\n1) Deposit\n2) Withdrawal\n");
        activity = input.nextInt();
        accHol.setActivity(activity);


        if(activity == 1)
        {
            System.out.println("Enter the amount you want to deposit: R");
            accHol.setAmount(input.nextFloat());
        }

        else if(activity == 2) {
            System.out.println("Enter the amount you want to withdraw: R");
            accHol.setAmount(input.nextFloat());
        }
    }

}
