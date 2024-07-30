import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvOran,kdvTutar, kdvliTutar;

        System.out.print("Ücret Tutarını Giriniz: ");
        Scanner input = new Scanner(System.in);
        tutar = input.nextInt();
        boolean kdv =  tutar >= 1000;
        kdvOran = kdv ? 0.08 : 0.18;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: "+ kdvliTutar);
    }
}