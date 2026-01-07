import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej počet sekund pro tikající bombu");
        int n = sc.nextInt();
        sc.nextLine();

        int[] a = {1,2,3,4,5,6,7,8,9,10};

        bomba(n);
        poleNeco(a);
        System.out.println(soucet(n));
        }
    public static void bomba(int white){
        if (white >= 1){
            if (white%2 == 0){
                System.out.println("tik");
                bomba(white-1);
            } else{
                System.out.println("tak");
                bomba(white-1);
            }
        }else{
            System.out.println("dvojčátka");
        }
    }

    public static long soucet(int cislo){
        if (1>=cislo){
            return cislo;
        }else{
            return cislo+soucet(cislo-1);
        }
    }

    public static long poleNeco(int[] cisloP){
        //int[] b = {2,3,4,5,6,7,8,9,10};
        if (cisloP.length == 1){
            return cisloP[0];
        }
        else{
            for (int i = ){

            }
        }
    }
}