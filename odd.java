import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner inpt =new Scanner(System.in);

        int n;
        int sum=0;
        System.out.println("Enter number :");
        n=inpt.nextInt();

        while(n%2==0){
            if(n%4 == 0){
               sum=sum+n;
            }
            n=inpt.nextInt();

        }
        System.out.println(sum);

    }
}
