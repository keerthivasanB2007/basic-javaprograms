/*8) Write a java program that reads first name and last name, age, employee_id of an 
employee and generates an e-mail address with first 3 letters of the first name, last 
3 letters of last name, age and last two digit of employee_id.

Example:

Inputs: First Name: Mary, Last Name: Joyce, Age-36, Empid- 3452

Output: Maryce3652@xxx.com*/
import java.util.Scanner;
public class demo6{
    public static void main(String args[]){
           Scanner input=new Scanner(System.in);
           String fname,lname;
           String age,empid;
           System.out.println("First name:");
           fname=input.nextLine();
           System.out.println("Last name:");
           lname=input.nextLine();
           System.out.println("Age:");
           age=input.nextLine();
           System.out.println("Empid:");
           empid=input.nextLine();
           char[] email=new char[20];
           int i=0;
           for(int j=0;j<3;j++){
               email[i]=fname.charAt(j);
               i++;
           }
           for(int j=lname.length()-1;j>(lname.length()-3);j--){
                  email[i]=lname.charAt(j);
                  i++;
           }
       for(int j=0;j<age.length();j++){
        email[i]=age.charAt(j);
        i++;
       }
       for(int j=empid.length()-1;j>(empid.length()-3);j--){
                        email[i]=empid.charAt(j);
                            i++;
       }
       System.out.println("emailid: ");
       for(int j=0;j<i;j++)
              System.out.print(email[j]);

    }
    
}