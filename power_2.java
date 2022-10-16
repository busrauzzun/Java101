import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inpt=new Scanner(System.in);
        int n,r;

        System.out.print("Enter number ");
        n=inpt.nextInt();
        System.out.print("How many power? ");
        r=inpt.nextInt();
        int power=1;
        for(int i=0;i<=r;i++){
            power=n*n;

        }
        System.out.println(" "+power);

    }

}
