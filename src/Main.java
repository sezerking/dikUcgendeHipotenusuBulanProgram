import java.util.Scanner;

public class Main {
    /*Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

       𝑢 = (a+b+c) / 2

       Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
     */
    public static void main(String[] args) {
        int a,b;
        double c,u,alan;
        Scanner scn=new Scanner(System.in);

        System.out.println("1. Kenari giriniz: ");
        a=scn.nextInt();

        System.out.println("2. Kenari giriniz: ");
        b=scn.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Hipotenus: "+c);
        System.out.println("Cevre: "+u*2);
        System.out.println("Alan: "+alan);



    }
}
