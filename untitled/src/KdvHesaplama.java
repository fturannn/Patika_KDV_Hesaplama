import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double KDV, KDVsizFiyat, KDVliFiyat, KDVTutari;

        System.out.print("KDV'siz fiyatı giriniz: ");
        KDVsizFiyat = input.nextDouble();

        KDV = KDVsizFiyat < 1000 ? 0.18 : 0.08;
        
        KDVTutari = KDV * KDVsizFiyat;
        KDVliFiyat = KDVsizFiyat + KDVTutari;
        System.out.println("KDV'siz Fiyat: " + KDVsizFiyat);
        System.out.println("KDV'li Fiyat: " + KDVliFiyat);
        System.out.println("KDV tutarı: " + KDVTutari);
    }
}
