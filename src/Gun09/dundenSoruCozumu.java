package Gun09;

import java.util.Scanner;

public class dundenSoruCozumu {
    public static void main(String[] args) {
        // Girilen 2 kelimelik ad ve soyadların ilk harflerinin hepsini
        // küçük ve daha sonra büyük hallerini yazdırınız! Ahmet Yıldız -> ahmet yıldız

        Scanner oku = new Scanner(System.in);
        System.out.print("Adınızı ve soyadınız giriniz = ");
        String tamAd = oku.nextLine();

        int boslukIndex = tamAd.indexOf(" ");
        String ilkHarf=tamAd.substring(0,1).toLowerCase(); //a
        String soyadIlkHarf=tamAd.substring(boslukIndex+1, boslukIndex+2).toLowerCase(); //y

        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("soyadIlkHarf = " + soyadIlkHarf);
        
        String yeniTamAd = ilkHarf + // a
                            tamAd.substring(1, boslukIndex+1)+ // hmet
                            soyadIlkHarf + // y
                            tamAd.substring(boslukIndex+2); // ıldız
        System.out.println("yeniTamAd = " + yeniTamAd);
        


    }
}
