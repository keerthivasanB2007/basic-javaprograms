import java.util.Scanner;
public class armstrong{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=input.nextInt();
        int d=a;
        int p=0,c=0;
        while(d!=0){
            p++;
            d=d/10;
        }
        d=a;
        for(int i=0;i<p;i++){
               c=c+(int)Math.pow((d%10),p);
               d=d/10;      
        }
        if(c==a)
              System.out.println("given number is armstrong number");
        else 
            System.out.println("given number is not armstrong number");


    }
}