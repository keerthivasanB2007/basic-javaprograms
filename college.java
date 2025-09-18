 import java.util.Scanner;
class university{
    String uname="Anna University";
    String location="Chennai";
    static int count=0;
    String grade(float t){
        if(t>90)
            return "S";
        else if(t>80)
           return "A+";
        else if(t>70)
           return "A";
        else if(t>60)
           return "B+";
        else if(t>50)
             return "B";
        else  
            return "U";
        
    }
    university(){
        count++;
    }
    void display(){
        System.out.println(uname);
        System.out.println(location);
        System.out.println("No. Students in the University : "+ count);
    }
}
class student extends university{
 String sname;
    int roll;
    float total;
       int[] mark=new int[3];
    String[] g=new String[3];
    student(String sname,int roll){
        this.sname=sname;
        this.roll=roll;
    }

}
class fulltime extends student{
    String[] sub={"Java","DS","C++"};
    fulltime(String sname,int roll){
        super(sname,roll);
    }
    Scanner sc=new Scanner(System.in);
    void getmark(){
        System.out.println("Enter the student Mark ");
        for(int i=1;i<4;i++){
        System.out.print(sub[i-1]+" : ");
        int m=sc.nextInt();
        if(m>100 || m<0){
            System.out.println("!! Enter Mark between 0 to 100 Range!!");
        i--;
        continue;
        }
        mark[i-1]=m;
        g[i-1]=grade(m);
        total=total+mark[i-1];
        
        }
        System.out.println("------------------------------------------------------");
    }
    void display(){
       System.out.println("Student Name : "+sname);
       System.out.println("Roll NO : "+roll);
       System.out.println("Full Time Student in Anna University Chennai");
       System.out.println("Subject Marks");
      System.out.printf("%-8s | %-5s | %-5s \n","Subject","Mark","Grade");
      System.out.println("--------------------");
       for(int i=0;i<3;i++){
          System.out.printf("%-8s | %-5d | %-5s \n",sub[i],mark[i],g[i]);
        
       }
       System.out.println("Total : "+total);
       System.out.println("Average : "+(total)/3.0);
       System.out.println("--------------------------------------------------------------");
       
    }
    
}
 class parttime extends student{
    String[] sub={"HTML","DS","C++"};
    parttime(String sname,int roll){
        super(sname,roll);
    }
    Scanner sc=new Scanner(System.in);
    void getmark(){
        System.out.println("Enter the student Mark ");
        for(int i=1;i<4;i++){
        System.out.print(sub[i-1] +" : ");
        int m=sc.nextInt();
         if(m>100 || m<0){
            System.out.println("!! Enter Mark between 0 to 100 Range!!");
        i--;
        continue;
        }
        mark[i-1]=m;
        g[i-1]=grade(m);
        total=total+mark[i-1];
       
        }
         System.out.println("-----------------------------------------------------------");
    }
    void display(){
       System.out.println("Student Name : "+sname);
       System.out.println("Roll NO : "+roll);
       System.out.println("Part Time Student in Anna University Chennai");
       System.out.println("Subject Marks");
       System.out.printf("%-8s | %-5s | %-5s \n","Subject","Mark","Grade");
       System.out.println("--------------------");
       for(int i=0;i<3;i++){
          System.out.printf("%-8s | %-5d | %-5s \n",sub[i],mark[i],g[i]);
        
       }
       System.out.println("Total : "+total);
       System.out.println("Average : "+(total)/3.0);
       System.out.println("----------------------------------------------------------------");
    }
    
 }
 public class college{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.println("No. of Full Time student : ");
        n=sc.nextInt();
        System.out.println("No. of Part Time student : ");
        m=sc.nextInt();
        fulltime[] f=new fulltime[n];
        parttime[] p=new parttime[m];
        if(n>0)
        System.out.println("Please Enter the Details of Full Time Students");
        for(int i=0;i<n;i++){
            System.out.println("Details of Student "+(i+1));
            sc.nextLine();
            System.out.print("Name : ");
            String s=sc.nextLine();
            System.out.print("Roll NO : ");
            int roll=sc.nextInt();
            f[i]=new fulltime(s,roll);
            f[i].getmark();
        }
        if(m>0)
        System.out.println("Please Enter the Details of Part Time Student");
        for(int i=0;i<m;i++){
            System.out.println("Details of Student "+(i+1));
            System.out.print("Name : ");
            sc.nextLine();
            String s=sc.nextLine();
            System.out.print("Roll No : ");
            int roll=sc.nextInt();
            p[i]=new parttime(s,roll);
            p[i].getmark();
        }
        System.out.println();
        System.out.printf("%-10s","DETAILS OF FULL TIME STUDENT ");
        for(int i=0;i<n;i++)
            f[i].display();
            System.out.println();
        System.out.printf("%-10s","DETAILS OF PART TIME STUDENT ");
        for(int i=0;i<m;i++)
            p[i].display();
        
    }
 }