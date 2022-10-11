import java.util.Scanner;

public class taxi {
    public static void main(String[] args) {
        Scanner inpt= new Scanner(System.in);
         int km;
         System.out.println("Enter road of km: ");
         km=inpt.nextInt();

         double cost;
         cost =(km<5)? 20 : 10+km*2.20;

        System.out.println(cost);

    }
}