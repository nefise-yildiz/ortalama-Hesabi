import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        k = input.nextInt();
        int toplam=0,sayac=0;
        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sayac++;
                toplam+=i;
                System.out.println("3 ve 4' e bölünen sayılar : " + i);
            }

        }
        System.out.println("-----------------------");
        System.out.println("Sayac = " + sayac);
        System.out.println("Toplam = " + toplam);
        System.out.println("3 ve 4' e bölünen sayıların ortalaması = " + toplam/sayac);

    }
}
