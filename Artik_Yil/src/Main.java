import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("yili giriniz : ");
        year = scanner.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0 && year % 400 == 0){
                System.out.println(year+" Artik bir yildir");
            } else if (year % 100 != 0) {
                System.out.println(year+" Artik bir yildir");
            } else {
                System.out.println(year+" Artik bir yil degildir");
            }
        }
        else {
            System.out.println(year+" Artik bir yil degildir");
        }
    }
}
