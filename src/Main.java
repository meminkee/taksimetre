import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenler Belirlendi.

        int km;
        double perKm = 2.20, total,startPrice = 10;
        Scanner inp = new Scanner(System.in);

        //Değişken istenildi.

        System.out.print("Mesafeyi Km Cinsinden Giriniz : ");
        km = inp.nextInt();

        //İşlem

        total = (km*perKm);
        total+= (startPrice);
        total = (total <20) ? 20 : total;

        //Sonuç


        System.out.print("Toplam Ödenecek Tutarınız : "+total);

    }
}