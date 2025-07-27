import java.util.Scanner;
public class demo3{
    static String plac(int i){
        switch(i){
            case 1:
                return "ones";
            case 10:
                return "tens";
            case 100:
                return "hundreds";
            case 1000:
                return "thousand"; 
            default:
                return "ten thousand";
        }
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int a=input.nextInt();
        System.out.println("enter the digit:");
        int b=input.nextInt();
        int i=1;
        while(a!=0){
         int d=a%10;
            a=a/10;
            if(d==b){
              System.out.println("place:" + plac(i));
              System.out.println("place value:" + d*i);
              System.out.println("face value:" + d);

            }
            i=i*10;
        }
    }
}