import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inpt=new Scanner(System.in);
        int n,r;
        int i;
        System.out.print("Enter n: ");
        n=inpt.nextInt();
        System.out.println("");
        System.out.print("Enter r: ");
        r=inpt.nextInt();
        int dif=n-r;
        int nmultip=1,rmultip=1,difmultip=1;


        for(i=1;i<=n;i++){
            nmultip*=i;
        }
        for(i=1;i<=r;i++){
            rmultip*=i;
        }
        for(i=1;i<=dif;i++){
            difmultip*=i;
        }
        int combination=0;

        combination=nmultip/(rmultip*difmultip);

        System.out.println("combination: "+combination);
    }

}
