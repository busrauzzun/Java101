import java.util.Scanner;
public class flight {
    public static void main(String[] args) {
        Scanner inpt =new Scanner(System.in);

        double km;
        int age;
        int type;
        System.out.println("Enter how many km your flight? ");
        km= inpt.nextDouble();
        System.out.println("Enter your age  ");
        age= inpt.nextInt();
        System.out.println("What is your flight type 1 or 2? ");
        type=inpt.nextInt();

        if(type!=1&&type!=2){
            System.out.println("You Entered Wrong Data!");
        }

        double cost;
        cost=km*0.1;

        double salecost1=0,salecost2=0;

        if(age<12){
            salecost1=cost*0.5;
        }
        else if (age>12&&age<24) {
            salecost1=cost*0.1;
        }
        else if (age>65){
            salecost1=cost*0.3;
        }

        double discount;
        discount=cost-salecost1;

        if(type==1){
            salecost2=0;
        }
        else if (type==2){
            salecost2=discount*0.2;
        }
        double lastcost=0;

        if(type ==1){
            lastcost=discount-salecost2;
        }
        else if (type==2){
            lastcost=(discount-salecost2)*2;
        }

        System.out.println("Cost: "+lastcost);
    }
}
