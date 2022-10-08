import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
       double kdv1=0.18, kdv2=0.08;
        int fiyat;
        Scanner inpt= new Scanner(System.in);
        System.out.println("Tutarı giriniz:");
        fiyat=inpt.nextInt();

        double kdvli;

        kdvli=(fiyat>1000)? fiyat+(fiyat*kdv2): fiyat+(fiyat*kdv1);

        System.out.println("kdvli tutar :  "+kdvli);
    }
}
