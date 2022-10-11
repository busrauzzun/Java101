import java.util.Scanner;

public class radius {
    public static void main(String[] args) {
        Scanner inpt= new Scanner(System.in);
        int r,angle;
        System.out.println("Enter radius");
        r=inpt.nextInt();

        System.out.println("Enter angle");
        angle=inpt.nextInt();

        double area;
        area=(3.14*r*r)/360;

        System.out.println(area);
    }
}
