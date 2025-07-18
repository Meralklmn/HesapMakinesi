import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = input.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = input.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        System.out.print("Seçiminiz: ");
        int secim = input.nextInt();

        double sonuc;
        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 4:
                if (sayi2 == 0) {
                    System.out.println("Hata: Sıfıra bölme yapılamaz!");
                } else {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Sonuç: " + sonuc);
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçimi!");
        }

        input.close();
    }
}