/*Write a Java program that accepts four digits and forms the largest and smallest number from it.*/
import  java.util.Scanner;
public class demo1{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the four digit number:");
        int[] ass=new int[4];
        int[] des=new int[4];
        int i=0;
        while(i<4){
            ass[i]=input.nextInt();     
            des[i]=ass[i];
            i++;
        }
        for(int g=0;g<i;g++){
        for(int j=g+1;j<i;j++){
            if( ass[g]>ass[j]){
                int t=ass[g];
                ass[g]=ass[j];
                ass[j]=t;
        }
        if(des[g]<des[j]){
            int t=des[g];
            des[g]=des[j];
            des[j]=t;
        }
    }
}
int max=0,min=0;
for(int n=0;n<i;n++){
      max=max*10+(des[n]);
      min=min*10+(ass[n]);
}
System.out.println("biggest number is "+ max);
System.out.println("smallest number is "+ min);
    }
}