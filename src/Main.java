import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz ; ");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuz : " );
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();


        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız : " + sonuc);

        if (sonuc >= 60) {
            System.out.print("Tebrikler, sınıfı geçtiniz!");
        } else {
            System.out.println("Maalesef, sınıfı geçemediniz");
        }







    }
}