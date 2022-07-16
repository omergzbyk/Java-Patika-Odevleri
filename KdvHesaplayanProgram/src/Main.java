import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tutar,kdv,sonuc = 0;
        System.out.print("Ucret Tutarini giriniz : ");;
        tutar = scanner.nextDouble();
        if (tutar >= 0 && tutar <= 1000){
            kdv = 0.18;
            System.out.println("Kdv siz Tutar : "+tutar);
            System.out.println("Kdv Orani : "+kdv);
            System.out.println("Kdv Tutari: "+tutar*kdv);
            System.out.println("Kdv li Tutari : "+(tutar = tutar +(tutar*kdv)));
        }
        else if(tutar >1000){
            kdv = 0.08;
            System.out.println("Kdv siz Tutar : "+tutar);
            System.out.println("Kdv Orani : "+kdv);
            System.out.println("Kdv Tutari: "+tutar*kdv);
            System.out.println("Kdv li Tutari : "+(tutar = tutar +(tutar*kdv)));

        }
        else{
            System.out.println("Hatali Giris");
        }
    }
}
