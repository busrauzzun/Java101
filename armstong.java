import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inpt=new Scanner(System.in);
        int n,baseNumber=0;

        System.out.print("Enter number ");
        n=inpt.nextInt();
        int temp=n;

        while(temp>0){
            baseNumber++;
            temp=temp/10;
        }
        int basValue,sum=0,basPower=1;
        temp=n;

        while(temp>0){
            basValue=temp%10;
            for(int i=1;i<=baseNumber;i++){
                basPower*=basValue;


            }
            sum+=basPower;
            basPower=1; //yeniden değer vermezsek program çalışmıyor
            temp/=10;
        }

        if(sum==n){
            System.out.println("Your number is amstrong  number");
        }
        else{
            System.out.println("Your number is not amstrong  number");
        }

    }

}
