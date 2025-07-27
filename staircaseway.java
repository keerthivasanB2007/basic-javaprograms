import java.util.Scanner;
public class demo2{
        static int step(int s){
            if(s==0 || s==1)
                return 1;
                return step(s-1)+step(s-2);
        }
        public static void main(String args[]){
            Scanner input=new Scanner(System.in);
                int a;
                System.out.println("enter the number of steps:");
                a=input.nextInt();
                int s=step(a);
                System.out.println("number of ways:"+s);
            }
        }
    
