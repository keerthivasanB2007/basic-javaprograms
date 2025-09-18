import java.util.Scanner;
class empl{
    int id;
    int overtime;
    empl(int id,int o){
        this.id=id;
        this.overtime=o;
    }
}
public class employee{
    static class rankcalculator{
        public static int[] assignrank(empl[] e){
            int n=e.length;
            int[] rank=new int[n];
            for(int i=1;i<=n;i++){
                rank[i-1]=i;
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n-1;j++){
                    if(e[j].overtime<e[j+1].overtime){
                       empl temp=e[j];
                       e[j]= e[j+1];
                       e[j+1]=temp;

                       int t= rank[j];
                       rank[j]=rank[j+1];
                       rank[j+1]=t;
                    }
                }

            }
            return rank;
        }
    }
    class token{
        empl e;
        int rank;
        token(empl e,int rank){
            this.e=e;
            this.rank=rank;
        }
        public String generatetoken(){
            class lastdigit{
                int get3digit(int id){
                    return id%1000;
                }
            }
            lastdigit ld=new lastdigit();
            int last=ld.get3digit(e.id);
            return String.format("%03d",last) + ""+rank;        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of employees : ");
        int n,id,overtime;
        n=sc.nextInt();
       empl []e=new empl[n];
       for(int i=0;i<n;i++){
           System.out.println("Enter Employee "+(i+1)+" Details");
           while(true){
               System.out.print("Employee ID : ");
               id=sc.nextInt();
               if(id<=0){
                System.out.println("ID must be positive!!");
                continue;
               }
               else
                 break;
           }
           while(true){
               System.out.print("Enter overtime : ");
               overtime=sc.nextInt();
               if(overtime<0 || overtime>8){
                System.out.println("Employee Overtime should be Positive and less than 8");
                continue;
               }
               else
                break;
           }
           e[i]=new empl(id,overtime);
       }
       int[] rank=rankcalculator.assignrank(e);
       employee ets = new employee();
       System.out.println("\n-------------Employee Tokens--------------");
       for(int i=0;i<n;i++){
      //  token tg=ets.new token(e[i],rank[i]);
         empl emp=e[i];
            int r=rank[i];
            token tg=ets.new token(emp,r);
        Runnable display = new Runnable(){
           
            public void run(){
                System.out.println("Employee Id : "+ emp.id + " | Overtime : " + emp.overtime + " | Rank : " + r + " | Token: " + tg.generatetoken());
            }
        };
        display.run();
            }
        }
       }
    