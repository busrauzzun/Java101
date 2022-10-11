import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        Scanner inpt= new Scanner(System.in);

        int x,y,z;
        System.out.println("First steep edge  ");
        x=inpt.nextInt();
        System.out.println("Second steep edge  ");
        y=inpt.nextInt();
        System.out.println("Third edge ");
        z=inpt.nextInt();

        int area, perimeter;
        perimeter=x+y+z;
        area=(x*y)/2;

        System.out.println("Perimeter: "+perimeter);
        System.out.println("Area: "+area);
    }
}
