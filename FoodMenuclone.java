import java.util.*;
public class FoodMenuclone {
    int totalbill=0;
    Scanner sc = new Scanner(System.in);

    //greeting method
    public  void greetings( ){
        System.out.println( "       OUR MENU       ");
        System.out.println("1.TIFFINS   \n2.BEVERAGES   \n3.STARTERS   \n4.MAIN COURSE   \n5.DESSERTS");
    } 
    
    //quantity method
    static int quant;
    public void quantity( ){
        System.out.print("enter the quantity of your choice : ");
        quant=sc.nextInt( );
    } 
    
    //method to choose breakfast item
    public void breakFast( ){
        System.out.println("1.Dosa                          70/-");
        System.out.println("2.Idly                          50/-");
        System.out.println("3.Pongal                        50/-");
        System.out.println("4.Vada                          25/-");
        System.out.print("enter the item of your choice     :   ");
        int item=sc.nextInt( );
        quantity();
            switch (item) {
                case 1:
                    int ds=70;
                    int qD=quant;
                    totalbill +=ds*qD;
                    break;

                case 2:
                    int id=50;
                    int qI=quant;
                    totalbill +=id*qI;
                    break;

                case 3:
                    int po=50;
                    int qP=quant;
                    totalbill +=po*qP;
                    break;
                
                case 4 :
                    int va = 25;
                    int qV=quant;
                    totalbill +=va*qV;
                    break;
                    
                default:
                    System.out.println("Opps!!!!!you have entered wrong choice....");
                    break;
            }
            System.out.print("would u like to order anything else from tiffin section  1.yes  2.no  : ");
            int select=sc.nextInt();   
            if(select==1){
              breakFast( );
            } 
    } 
    

    //drinks method to choose various drinks
    public void drinks( ){
            System.out.println("1.COFFEE                      25/-");
            System.out.println("2.TEA                         25/-");
            System.out.println("3.BADAM MILK                  50/-");
            System.out.println("4.MILK                        20/-");                
            System.out.print("enter the item of your choice : ");
            int item1=sc.nextInt( );
            quantity();
            switch (item1) {
            case 1:
                int co=25;
                int qC=quant;
                totalbill +=co;
                break;

            case 2:
                int te=25;
                int qT=quant;
                totalbill +=te;
                break;

            case 3:
                int ba=50;
                int qB=quant;
                totalbill +=ba;
                break;

            case 4 :
                int mi = 20;
                int qM=quant;
                totalbill +=mi;
                break;
                    
            default:
                System.out.println("Opps!!!!!you have entered wrong choice....");
                break;
            }
                    
            System.out.print("would u like to order anything else from drinks section  1.yes  2.no  : ");
            int select=sc.nextInt();   
                if(select==1){
                  drinks();
                }
    }
    

    //method for nonveg starters
    public void nonVegStarters( ){
        System.out.println("1.CHICKEN LOLLIPOP                    250/-");
        System.out.println("2.PEPPER CHICKEN                      250/-");
        System.out.println("3.LEMON CHICKEN                       250/-");
        System.out.println("4.GHEE CHICKEN ROAST                  250/-");
        System.out.print("enter the item of your choice : " );
        int item2=sc.nextInt( );
        quantity();
        switch (item2) {
        case 1:
            int ch=250;
            int qL=quant;
            totalbill +=ch*qL;
            break;

        case 2:
            int pp=250;
            int qP=quant;
            totalbill +=pp*qP;
            break;

        case 3:
            int le=250;
            int qV=quant;
            totalbill +=le*qV;
            break;

        case 4 :
            int gh = 250;
            int qG=quant;
            totalbill +=gh*qG;
            break;
        
        default:
            System.out.println("Opps!!!!!you have entered wrong choice....");
            break;
        }
        System.out.println("would u like to order anything else from nonveg starters  1.yes  2.no : ");
        int select=sc.nextInt();   
        if(select==1){
            nonVegStarters();
        }
    }
     
    //method for veg starters
    public void vegStarters( ){
        System.out.println("1.PANEER TIKKA MASALA                  250/-");
        System.out.println("2.GOBI MANCHURIA                       250/-");
        System.out.println("3.MUSHROOM FRY                         250/-");
        System.out.println("4.ALOO TIKKA                           250/-");
        System.out.print("enter the item of your choice : ");
        int item2=sc.nextInt( );
        quantity();
        switch (item2) {
        case 1:
            int ch1=250;
            int qL1=quant;
            totalbill +=ch1*qL1;
            break;

        case 2:
            int pp1=250;
            int qP1=quant;
            totalbill +=pp1*qP1;
            break;

        case 3:
            int le1=250;
            int qV1=quant;
            totalbill +=le1*qV1;
            break;

        case 4 :
            int gh1 = 250;
            int qG1=quant;
            totalbill +=gh1*qG1;
            break;
        
        default:
            System.out.println("Opps!!!!!you have entered wrong choice....");
            break;
        }
        System.out.println("would u like to order anything in vegStaters   1.yes  2.no : ");
        int select=sc.nextInt();   
        if(select==1){
            vegStarters();
        }
    }

    
    //method for nonveg lunch    
    public void nonVegLunch( ){
        System.out.println("1.CHICKEN BIRIYANI                     250/-");
        System.out.println("2.MUTTON BIRIYANI                      350/-");
        System.out.println("3.PRAWN BIRIYANI                       450/-");
        System.out.println("4.FISH BIRIYANI                        400/-");
        System.out.print("enter the item of your choice : "  );
        int item4=sc.nextInt( );
        quantity();
        switch (item4) {
        case 1:
            int b1=250;
            int qB=quant;
            totalbill +=b1*qB;
            break;

        case 2:
            int mu=350;
            int qmu=quant;
            totalbill +=mu*qmu;
            break;

        case 3:
            int pr=450;
            int qPr=quant;
            totalbill +=pr*qPr;
            break;

        case 4 :
            int fi=400;
            int qF=quant;
            totalbill +=fi*qF;
            break;
        
         default:
            System.out.println("Opps!!!!!you have entered wrong choice....");
            break;

        } 
        System.out.print("would u like to order anything else from nonveg section  1.yes ,  2.no  : " );
        int select=sc.nextInt();   
        if(select==1){
           nonVegLunch();
        }
    }
    
    //method for veg lunch
    public void VegLunch( ){
        System.out.println("1.FULL MEALS                            250/-");
        System.out.println("2.VEG BIRIYANI                          350/-");
        System.out.println("3.MUSHROOM BIRIYANI                     450/-");
        System.out.println("4.PANEER ALOO BIRIYANI                  400/-");
        System.out.print("enter the item of your choice : ");
        int item4=sc.nextInt( );
        quantity();
        switch (item4) {
        case 1:
            int b11=250;
            int qB1=quant;
            totalbill +=b11*qB1;
            break;

        case 2:
            int mu1=350;
            int qmu1=quant;
            totalbill +=mu1*qmu1;
            break;

        case 3:
            int pr1=450;
            int qPr1=quant;
            totalbill +=pr1*qPr1;
            break;

        case 4 :
            int fi1=400;
            int qF1=quant;
            totalbill +=fi1*qF1;
            break;
        
         default:
            System.out.println("Opps!!!!!you have entered wrong choice....");
            break;

        } 
        System.out.print("would u like to order anything else from veg section  1.yes ,  2.no  : ");
        int select=sc.nextInt();   
        if(select==1){
           VegLunch();
        }
    }

    //method to choose desserts
    public void sweets( ){
        System.out.println("1.ICECREAM                         50/-");
        System.out.println("2.FALOODA                          100/-");
        System.out.println("3.CHOCO LAVA CAKE                  150/-"); 
        System.out.println("4.JAMUN                            50/-");
        System.out.println("enter the item of your choice : ");
        int item5=sc.nextInt( );
        quantity();
        switch (item5) {
        case 1:
            int ic=50;
            int qI=quant;
            totalbill +=ic*qI;
            break;

        case 2:
            int fa=100;
            int qf=quant;
            totalbill +=fa*qf;
            break;

        case 3:
            int ca=150;
            int qco=quant;
            totalbill +=ca*qco;
            break;

        case 4 :
            int ja=50;
            int qJ=quant;
            totalbill +=ja*qJ;
            break;
            
        default:
            System.out.println("Opps!!!!!you have entered wrong choice....");
            break;
        }
        System.out.print("would u like to order anything else from desserts section  1.yes  2.no : " );
        int select=sc.nextInt();   
        if(select==1){
           sweets();
        }
    }
    
    //billing method
    public void billing( ){
        System.out.println("thank you here is your  BILL : "+totalbill);
        tax();
        time();
        System.out.println(".................happy ordering....visit again!!!!!.................");
    }

    //tax method
    public void tax( ){
        double bill =0.08*totalbill+totalbill;
        System.out.println("total bill including 8% tax : "+bill);
    }

    //method to print time and date in the bill 
    public void time( ){
        Date date = new Date( );
        System.out.println(date);
    }
    
    //method for ordering food
    public  void order( ){
        greetings();
        System.out.print("please enter your choice  :  ");
        int choice=sc.nextInt();
        switch (choice) {
        case 1:
            breakFast();
            break;

        case 2:
            drinks();
            break;

        case 3:
            System.out.print("Do you want to order in veg or non veg:  1- nonveg   2- veg   :  ");
            int a = sc.nextInt();
            if(a==1){
                nonVegStarters();
            }
            else{
                vegStarters();
            }
            break;

        case 4: 
            System.out.print("Do you want to order in veg or non veg:  1- nonveg   2- veg : ");
            int b = sc.nextInt();
            if(b == 1){
                nonVegLunch();
            }
            else{
                VegLunch();
            }
            break;

        case 5:
            sweets();
            break;

        default:
            System.out.println("sorry,we dont have this in our menu");
        } 

        System.out.print("would u like to order anything else from main menu  1.yes  2.no : ");
        int select=sc.nextInt();   
        if(select==1){
            order();
        }  else{
            billing();
        } 
    } 
    
    //main method
    public static void main(String[] args) {
        FoodMenuclone f=new FoodMenuclone();
        System.out.println("welcome to V4U food delivery app \n  please,place your order");
        System.out.println( );
        f.order();
        System.out.println("           thank you !!");
    }
}
          

    


           
        
    


    

