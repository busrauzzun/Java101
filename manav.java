import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        Scanner inpt= new Scanner(System.in);

        int armut,elma,domates,muz,patlican;
        System.out.println("Armut kg giriniz");
        armut=inpt.nextInt();
        System.out.println("elma kg giriniz");
        elma=inpt.nextInt();
        System.out.println("domates kg giriniz");
        domates=inpt.nextInt();
        System.out.println("muz kg giriniz");
        muz=inpt.nextInt();
        System.out.println("Patlican kg giriniz");
        patlican=inpt.nextInt();

        double ucret=armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.0;
        System.out.println(ucret);

    }
}