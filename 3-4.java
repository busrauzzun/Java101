import java.util;
public class 3-4 {
    public static void main(String[] args) {
        Scanner inpt= new Scanner(System.in);

        int x;
        System.out.println("Enter the number :");
        x=inpt.nextInt();

        for(int i=0;i<x;i++){
            if(i%3==0||i%4==0){
                System.out.println(i);
            }
        }
    }
    
}
