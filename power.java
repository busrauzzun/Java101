import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);

        int n=inpt.nextInt();

        for(int i=1;i<n;i*=4){
            System.out.println(i);
        }
        for(int i=1;i<n;i*=5){
            System.out.println(i);
        }
    }
}
