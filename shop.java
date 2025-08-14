import java.util.Scanner;
import java.util.ArrayList;
class details{
    String[][] productprice={{"milk","40"},{"butter","60"},{"icecream","150"}};
    int id;
    int totalitems;
    int total,nth;
   public  static int totalc=0;
   public static int totalamount=0;
   public static int sitems=0;
    public static ArrayList<Integer> idarray=new ArrayList<>();
    public static ArrayList<ArrayList<String>> jagged=new ArrayList<>();
    public static ArrayList<details> c=new ArrayList<>();
     details(int id){
        this.id=id;
        ArrayList<String> row = new ArrayList<>();
        row.add(String.valueOf(id));
        jagged.add(row);

        idarray.add(id);
        nth=totalc;
        totalc++;
        c.add(this);
        getitems();
     }
     void showitems(){
         System.out.println("ITEMS IN OUR STORE");
          System.out.printf("%-20s | %-10s\n"," products","price");
        for(int i=0;i<productprice.length;i++){
           
               System.out.printf("%-20s | %-10s\n",productprice[i][0],productprice[i][1]);
        }
     }
    void getitems(){
        Scanner sc=new Scanner(System.in);
        showitems();
       int index=details.idcheck(id);
    ArrayList<String> purchase= new ArrayList<>();
    if(index==-1){
       System.out.println("no coustormer not found");
       return;
    }
    else{
        purchase=jagged.get(index);
    }

     System.out.println("Enter the product name you want to buy");
   
     String choice="";
    ArrayList<String> given=new ArrayList<>();
     do{
        boolean present=false;
        System.out.println("enter product name : ");
        String s=sc.nextLine();
       
        given.add(s);
        for(int i=0;i<given.size()-1;i++){
             if(given.get(i).equalsIgnoreCase(s)){
                present=true;
                break;
             }
        }
        if(present){
            System.out.println("!YOU CAN'T ABLE TO BUY SAME ITEM TWISE");
            continue;
        }
        else{
             purchase.add(s);
            totalitems++;
            sitems++;
            for(int i=0;i<given.size()-1;i++){
                for(int j=0;j<productprice.length;j++){
                    if(productprice[j][0].equalsIgnoreCase(s)){
                        total+=Integer.parseInt(productprice[j][1]);
                        totalamount+=total;
                    }
                }
            }
        }
           
        System.out.println("do you wnat to buy more item(yes/no)");
        choice=sc.nextLine();
     }while(choice.equalsIgnoreCase("yes"));

    }
    
  static int idcheck(int id){
    boolean flag=false;
    int i;
    for(i=0;i<details.totalc;i++){
        if(id==idarray.get(i)){
            flag=true;
            break;
        }
    }
    if(flag)
    return i;
    else
     return -1;
    }
    void display(){
             System.out.println("COUSTOMER DETAILS");
             System.out.println("coustomer id : "+id);
             System.out.print("items purchased: ");
             ArrayList<String> pur=jagged.get(nth);
             for(String item:pur){
                System.out.print( item +" ");
             }
             System.out.println();
             System.out.println("Purchased Amount: "+total);
             System.out.println("Total Items : "+totalitems);
    }
   static void alldisplay(){
        System.out.println("No. of coustomers : "+totalc);
        System.out.print("Coustomers IDs : ");
        for(int i=0;i<idarray.size();i++){
            System.out.print(idarray.get(i) +" ");
        }
        System.out.println("Total No. of items sold : "+sitems);
        System.out.println("Coustomer wise item detail");
        for(ArrayList<String> row : jagged){
            for(String items: row){
                System.out.printf("%-15s |",items);
            }
            System.out.println();
        }
    }
}

public class shop{

    public static void main(String args[]){
           // details[] c=new details[100];
            Scanner sc=new Scanner(System.in);
            int choice,n=0,id,index;
            do{
                System.out.println("menu:");
                System.out.println("1.To buy Products");
                System.out.println("2.view coustomer details via Id");
                System.out.println("3.display all the details of the shop");
                System.out.println("4.exit");
                System.out.println("enter your choice:");
                choice=sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("enter the coustomer Id: ");
                         id=sc.nextInt();
                        index=details.idcheck(id);
                        if(index<0){
                           new details(id);
                        }
                        else{
                           details.c.get(index).getitems();
                        }
                        break;
                
                case 2:
                    System.out.println("Enter coustomer Id : ");
                    id=sc.nextInt();
                    index=details.idcheck(id);
                    if(index==-1)
                    System.out.println("!!Coustomer Id is invalid !!");
                    else
                      details.c.get(index).display();
                    break;
            case 3:
                System.out.println("DETAILS FO THE SHOP: ");
                 details.alldisplay();
                 break;
                
            case 4:
                System.out.println("Exiting....");
                break;
            default:
                System.out.println("!!Invalid choice");
                }

            }while(choice!=4);
    }
}