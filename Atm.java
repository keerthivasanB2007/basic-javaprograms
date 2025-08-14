/*Create a Java program that simulates a simple ATM. The user should be presented with a menu to:
Check Balance
Deposit Money
Withdraw Money
Exit
The program should use a while loop to keep showing the menu until the user selects "Exit".
 Use switch for menu options and if-else to validate inputs (like ensuring the withdrawal amount doesn't exceed the balance).*/


import java.util.Scanner;
public class Atm{
          public static void main(String args[]){
                   Scanner input=new Scanner(System.in);
                  System.out.println("enter your initial balance :");
                  double bal;
                  bal=input.nextDouble();
                 account a=new account(bal);
                 int choice=0;
                 double w,d;
                 
                  while(choice!=4){
                         System.out.println("menu:");
                         System.out.println("1.Check Balance");
                         System.out.println("2.Deposit Money");
                         System.out.println("3.Withdraw Money");
                         System.out.println("4.exit");
                         System.out.println("enter your choice:");
                          choice=input.nextInt();
                 switch(choice){
                       case 1:
                         a.checkbalance();
                         break;
                       case 2:
                         System.out.println("enter the amount you want to Deposit:");
                         d=input.nextDouble();
                         a.deposit(d);
                         break;
                       case 3:
                          System.out.println("enter the amount you want to withdraw:");
                          w=input.nextDouble();
                          a.withdraw(w);
                          break;
                       case 4:
                           System.out.println("exiting.....");
                           break;
                       default:
                           System.out.println("Invalid choice");
                          }
                      }
             }
   	} 
class account{
        double balance;
        account(double b){
            balance=b;
         }
          void checkbalance(){
              System.out.println("your bank balance is Rs."+ balance);
         }
          void deposit(double d){
               if(d<0){
                System.out.println("Amount should not be Negative");
              }
          else{
             System.out.println("Deposited amount: "+d);
             balance=balance+d;
             System.out.println("After Deposition your Balance is Rs."+balance);
            }
        }
        void withdraw(double w){
               if(w>balance){
                      System.out.println("withdrawal amount is more than your current Balance");
                    
                }
               else if(w<0){
                      System.out.println("Amount should not be in negative");
                 }
               else{
               System.out.println("Withdrawn amount: "+w);
               balance = balance - w;
               System.out.println("After money withdrawal your Balance is Rs."+balance);
              }
          } 
}
