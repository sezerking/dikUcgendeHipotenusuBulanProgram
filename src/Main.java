import java.util.Scanner;

public class Main {
    /*รรง๐๐๐๐๐ รง๐๐ฃ๐๐๐ ๐ = 2๐ข

       ๐ข = (a+b+c) / 2

       Alan * Alan = ๐ข * (๐ข โ ๐)* (๐ข โ ๐) * (๐ข โ ๐)
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
