import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner a = new Scanner(System.in);

        System.out.print( "Matemartik notunuzu giriniz: ");
        mat =a.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = a.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = a.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = a.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih= a.nextInt();

        System.out.print("Müzik notunzu giriniz: ");
        muzik = a.nextInt();

        int toplam =( mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = ( toplam / 6.0);
        System.out.println("not ortalanız: " + sonuc);

        String b = (sonuc >= 60) ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";
        System.out.println(b);



    }
}
