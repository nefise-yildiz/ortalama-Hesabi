import java.util.Scanner;
public class OrtalamaHesaplama {
    public static void main(String[] args) {
        // Öncelikle değişkenleri tanımla
        int mat,fizik,kimya,turkce,tarih,muzik;
        // Scanner ı tanımla
        // Kullanıcıdan verileri al
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.println(mat);

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.println(fizik);

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.println(kimya);

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        System.out.println(turkce);

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();
        System.out.println(tarih);

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();
        System.out.println(muzik);

        double toplam,ortalama;
        toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        System.out.println("Ders Notlarının Toplamı : " + toplam);
        ortalama = toplam/6;
        System.out.println("Derslerin Ortalaması : " + ortalama);

        String G,K,sonuc;
        G="Sınıfı Geçti";
        K="Sınıfta Kaldı";

        sonuc= (ortalama>=60)? G:K;
        System.out.println(sonuc);









    }
}
