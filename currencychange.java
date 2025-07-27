/*"3) Write a Java program that accepts a currency note value (positive integer) and finds
 the minimum number of currency notes with which the amount can be made. 
 Note: Assume the currency system of denominations - Rs 2, Rs 5, Rs 10, Rs 20, Rs 50, Rs 100, Rs 500, Rs 2000*/
 import java.util.Scanner;
 public class demo5{
    static int[] r={1,2,5,10,20,50,100,200,500,2000};
    static int currency(int a){
         int i=0;
         int dex=0;
        while(i < r.length && a>=r[i]){
          i++;
        }   
          int[] q=new int[i];             
        for(int n=0;n<i;n++){
            q[n]=(int)(a/r[n]);
            
        }
        int min=q[0];
        for(int g=0;g<i;g++){
            if(min>q[g]){
                min=q[g];
                dex=g;
            }
        }

         return dex;

    }
    public static void main(String args[]){
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter the amount:");
        int a=input.nextInt();
        int b=a;
        while(a!=0){
            int dex=currency(a);
            int min=(int)(a/r[dex]);
             int value =r[dex]*min;
            
             System.out.println(min + " --> Rs."+r[dex]+" rupees");
             a=a-value;
            
        }
        System.out.println("total amount ="+b);
 }
 }