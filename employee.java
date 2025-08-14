import java.util.Scanner;

class Employee{
        static int count;
        static double total;
        static double hour;
        static int s=100;
        double t;
        int h;
       Employee(int h){
             this.h=h;
              count++;
             tot();
         }
      void tot(){
             if(h>40){
                   t=(40)*s + (h-40)*((1.5)*s);
                   total=total+t;
                
                }
              else{
                  t=h*s;
                  total=total+t;
                }
            }
       
      static void showstatic(){
             System.out.println("Total number of Employees: "+ count );
             System.out.println("Total Pay: "+total);
        }
        void display(int i){
            System.out.println(" Employee "+i+"      "+h+"    "+t);
          }
  }
public class employee{
      public static void main(String args[]){
                  Scanner sc=new Scanner(System.in);
                   Employee[] e=new Employee[100];
                  int h,i=0,choice;
                 while(true){
                     System.out.println("menu:");
                     System.out.println("1.employee working hour");
                     System.out.println("2.Exit");
                     System.out.println("press 1 for entering employee working hours else 0 for 'EXIT'");
                     System.out.println("Enter your choice:");
                     choice=sc.nextInt();
                     if(choice==1){
                            System.out.println("enter the working hours of the Employee: ");
                            h=sc.nextInt();
                            if(h<0){
                              System.out.println("!!WORKING HOURS MUST BE POSITIVE!!");
                              continue;
                            }
          
                           e[i]=new Employee(h);
                            i=i+1;
                          }
                   else{
                       System.out.println("Exiting....");
                       break;
                  }
                }
                System.out.println(" Employees     hours    pay");
                for(int n=0;n<i;n++){
                          e[n].display(n+1);
                  }
                Employee.showstatic();
       }
}
                      
           
             
                  
        
 
        