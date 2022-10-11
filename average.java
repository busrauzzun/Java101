import java.util.Scanner ;

public class test {
    public static void main(String[] args) {
        int math,physics,chemistry,history,music;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter math grade: ");
        math=input.nextInt();

        System.out.println("Enter physics grade: ");
        physics=input.nextInt();

        System.out.println("Enter chemistry grade: ");
        chemistry=input.nextInt();

        System.out.println("Enter history grade: ");
        history=input.nextInt();

        System.out.println("Enter music grade: ");
        music=input.nextInt();

        float average;

        average=(math+physics+chemistry+history+music)/5;

        System.out.println("Average: "+average);

        String result = (average > 60)? "Pass the class" : "No pass";

        System.out.println("average:\t"+average+"\nresult:\t"+result);
    }
}
