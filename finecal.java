import java.util.Scanner;
class library{
     String bookname;
     String books[]=new String[50];
     int days;
     int d[]=new int[50];
     int f[]=new int[50];
      int totalfine;
      int id,m=0;
      static int i=0;
      static int idarray[]=new int[100];
         int calcuation(int days,int fine){
            totalfine+= days*fine;
            return days*fine;
         }
         void display(){
            int n=0;
            while(n<m){
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("book name : "+books[n]);
            System.out.println("Id : "+id);
            System.out.println("Days : "+d[n]);
            System.out.println("Fine : "+f[n]);
            System.out.println();
            n++;
         }
         System.out.println("---------------------------");
         System.out.println("Total Fine : "+totalfine);
         }
         library(int id){
            this.id=id;
            idarray[i++]=id;
         }
}
class finecalculation extends library{
   finecalculation(int id){
    super(id);
   }
    int ndays=15;
    void display(){
           super.display();
           System.out.println("Category specific fine applied");
    }
    int calcuation(int days,int fine){
       int f= super.calcuation(days,fine);
       System.out.println("Applied fine rule : " +days+" days "+ fine + " = "+f);
       return f;
    }
     int fine(String book,int days){
        this.days=days;
        int fi=0;
        d[m]=days;
        books[m]=book;
        bookname=book;
               if(days<=ndays){
                f[m]=0;
                m++;
                return 0;
               }
               else{
                int fdays=days-ndays;
                System.out.println("fdays="+fdays);
                if(fdays<=10){
                    fi=calcuation(fdays,5);
                    f[m]=fi;
                    m++;
                    return fi;
                }
                else{
                    fdays=fdays-10;
                  fi=calcuation(10,5);
                  fi=fi+calcuation(fdays,10);
                  f[m]=fi;
                  m++;
                    return fi;
                }
         }
     }
     int fine(String book,int days,int ndays){
        this.days=days;
         int fi=0;
        d[m]=days;
        books[m]=book;
        bookname=book;
        this.ndays=ndays;
       if(days<=ndays){
                f[m]=0;
                m++;
                return 0;
               }
               else{
                int fdays=days-ndays;
                if(fdays<30){
                    fi=calcuation(fdays,5);
                    f[m]=fi;
                    m++;
                    return fi;
                }
                else{
                    fdays=fdays-30;
                    fi=calcuation(30,5);
                    fi=fi+calcuation(fdays,10);
                    f[m]=fi;
                    m++;
                    return fi;
                }
         }
     }
     int fine(String book,int days,int ndays,int fine){
        this.days=days;
        int fi=0;
        d[m]=days;
         books[m]=book;
        bookname=book;
        this.ndays=ndays; 
        if(days<=ndays){
               f[m]=0;
               m++;
                return 0;
        }
               else{
                fi=calcuation(days,fine);
                f[m]=fi;
                m++;
                  return  fi;
               }
         }
}
public class finecal{
    static int i=0;
      static int findid(int id){
            for(int i=0;i<library.idarray.length;i++){
                if(id==library.idarray[i]){
                    return i;
                }
            }
            return -1;
        }
      static void getdata(Scanner sc,String []book,int []days,int []id){
                System.out.print("Id : ");
                while(true){
                id[0]=sc.nextInt();
                if(id[0]<0)
                    System.out.println("!!ID should be positive");
                else
                   break;
                }
                sc.nextLine();
                System.out.print("Book name : ");
                book[0]=sc.nextLine();
                System.out.print("Barrow days : ");
                 while(true){
                days[0]=sc.nextInt();
                 if(days[0]<0)
                    System.out.println("!!Barrowed days  should be positive");
                else
                   break;
                }
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c;
        int id[]=new int[1];
        int days[]=new int[1];
        int uid;
        String book[]=new String[1];
    finecalculation object[]=new finecalculation[100];
    System.out.println("------------------FINE STRUCTURE---------------------");
    System.out.printf("\n%-10s | %-8s | %-8s | %-10s \n","Catagory","No Fine"," Basic Fine  ","     Seconday Fine");
    System.out.print("------------------------------------------------------------------");
    System.out.printf("\n%-10s | %-8s | %-8s | %-10s ","UG","15 days","10 days(Rs.5)","After first 10 days(Rs.10)");
    System.out.printf("\n%-10s | %-8s | %-8s | %-10s ","PG","30 days","10 days(Rs.5)","After first 10 days(Rs.10)");
      System.out.printf("\n%-10s | %-8s | %-13s | %-10s \n","Faculty","90 days","NULL","After first 90 days(Rs.10)");
         do{ 
          System.out.println();
          System.out.println("------------choose your catagory----------");
          System.out.println("1.UG student");
          System.out.println("2.PG student or Scholar");
          System.out.println("3.Faculty");
          System.out.println("4.Id to Display");
          System.out.println("5.Exit....");
          System.out.println();
          System.out.print("Catagory : ");
          c=sc.nextInt();
          System.out.println();
          switch(c){
            case 1:
                getdata(sc,book,days,id);
                 uid=findid(id[0]);
                if(uid<0){
                object[i++]=new finecalculation(id[0]);
                System.out.println("FINE : "+object[i-1].fine(book[0],days[0]));
                }
                else{
                    System.out.println("FINE : "+object[uid].fine(book[0],days[0]));
                }
                break;
            case 2:
                getdata(sc,book,days,id);
                 uid=findid(id[0]);
                if(uid<0){
                object[i++]=new finecalculation(id[0]);
                System.out.println("FINE : "+object[i-1].fine(book[0],days[0]));
                }
                else{
                    System.out.println("FINE : "+object[uid].fine(book[0],days[0]));
                }
                break;
            case 3:
                 uid=findid(id[0]);
                if(uid<0){
                object[i++]=new finecalculation(id[0]);
                System.out.println("FINE : "+object[i-1].fine(book[0],days[0],10));
                }
                else{
                    System.out.println("FINE : "+object[uid].fine(book[0],days[0],10));
                }
                break;
            case 4:
                System.out.print("enter ID : ");
               int ID=sc.nextInt();
                int t=findid(ID);
                if(t<0)
                System.out.println("!Not the User");
                else
                   object[t].display();
                break;
            case 5:
                    System.out.println("Exiting....");
                    break;
            default:
                    System.out.println("Invalid choice");

          }
         }while(c!=5);

         }
}

