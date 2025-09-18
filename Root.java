import java.util.Scanner;
import java.lang.Math;
public class Root{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the constants of the Quadratic Equation");
        System.out.println("Assume the formate as ax^2 + bx + c");
        while(true) {
            System.out.print("constant  a = ");
            a = sc.nextInt();
            if (a == 0) {
                System.out.println("constant 'a' should not be ZERO");
                continue;
            }
            else
                break;
        }
        System.out.print("constant b = ") ;
        b=sc.nextInt();
        System.out.print("constant c = ");
        c=sc.nextInt();
       root e1=new root(a,b,c);
        root.inner ab=new root.inner();
        ab.roots();

    }
}
class root{ 
    static double a,b,c;
    root(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    static double realpart(){
       double k= (-b/(2*a));
        return k;
    }
    static double dis(){
        double d=b*b - 4*a*c;
       // System.out.println((float)Math.sqrt(d));
        return d;
    }
    static double image(double d){
        d=(double)Math.sqrt(d);
     double m =d/(2*a);
        return m;
    }
   static class inner{
        void roots(){
           double p1=realpart();
            double d= dis();
            if(d>0){
             //   System.out.println("Roots of the Equation "+a+"x^2"+" + "+b+"x"+" + "+c+"  are real");
                System.out.println("Roots of the Equation "+(int)a+"x^2"+" + "+(int)b+"x"+" + "+(int)c+"  are real");
                System.out.println("Root 1 = "+(p1 + image(d)));
                System.out.println("Root 2 = "+(p1 - image(d)));
            }
            else{
             //   System.out.println("Roots of the Equation "+a+"x^2"+" + "+b+"x"+" + "+c+"  are Imaginary");
                System.out.println("Roots of the Equation "+(int)a+"x^2"+" + "+(int)b+"x"+" + "+(int)c+"  are Imaginary");
                System.out.println("Root 1 = "+p1+" + i"+ (float)image(-d));
                System.out.println("Root 2 = "+p1+" - i"+ (float)image(-d));
            }
        }

   }
}
