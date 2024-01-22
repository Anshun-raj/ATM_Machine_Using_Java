import java.sql.SQLOutput;
import java.util.Scanner;

import static javafx.application.Platform.exit;

public class AtmMachine
{
   static float bal=0;
    public static void main(String[] args)
    {


        int pin=3556;
        AtmFunc obj=new AtmFunc();

        boolean atm=false;
        System.out.println("---ATM Machine System---");
        System.out.print("Enter the pin:-");
        Scanner sc=new Scanner(System.in);
        int pin1=sc.nextInt();
        if(pin1==pin)
        {
            atm=true;
            System.out.println("You are successfully in");
            while(true)
            {

                System.out.println("Press 1. to Deposit amount");
                System.out.println(("Press 2. to Debit amount"));
                System.out.println("Press 3. to Display balance");
                System.out.println("Press 4. to Exit");
                System.out.println("Enter your choice:-");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                        obj.Deposit();
                        break;
                    case 2:
                       obj.Credit();
                        break;
                    case 3:
                       obj.Display();
                        break;
                    case 4:
                        return;
                }
            }
        }
        else
        {
            System.out.println("You Entered a Wrong Pin");
            exit();
        }
    }
}

class AtmFunc
{
    public void Deposit()
    {
        System.out.println("Enter a amount to deposit:-");
        Scanner sc=new Scanner(System.in);
        float bal1=sc.nextFloat();
        AtmMachine.bal+=bal1;

    }

    public void Credit()
    {
        System.out.println("Enter the amount which you want to credit:-");
        Scanner sc=new Scanner(System.in);
        int bal3=sc.nextInt();
        AtmMachine.bal-=bal3;

    }

    public void Display()
    {
        System.out.println("Total amount which you have in your account is:"+AtmMachine.bal);
    }
}
