import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int birthyear;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dogum yilinizi giriniz : ");
        birthyear = scanner.nextInt();

        if (birthyear % 12 == 0){
            System.out.println("Cin Zodyagi Burcunuz : Maymun");
        } else if (birthyear % 12 == 1) {
            System.out.println("Cin Zodyagi Burcunuz : Horoz");
        }else if (birthyear % 12 == 2) {
            System.out.println("Cin Zodyagi Burcunuz : Kopek");
        }else if (birthyear % 12 == 3) {
            System.out.println("Cin Zodyagi Burcunuz : Domuz");
        }else if (birthyear % 12 == 4) {
            System.out.println("Cin Zodyagi Burcunuz : Fare");
        }else if (birthyear % 12 == 5) {
            System.out.println("Cin Zodyagi Burcunuz : Okuz");
        }else if (birthyear % 12 == 6) {
            System.out.println("Cin Zodyagi Burcunuz : Kaplan");
        }else if (birthyear % 12 == 7) {
            System.out.println("Cin Zodyagi Burcunuz : Tavsan");
        }else if (birthyear % 12 == 8) {
            System.out.println("Cin Zodyagi Burcunuz : Ejderha");
        }else if (birthyear % 12 == 9) {
            System.out.println("Cin Zodyagi Burcunuz : Yilan");
        }else if (birthyear % 12 == 10) {
            System.out.println("Cin Zodyagi Burcunuz : At");
        }else {
            System.out.println("Cin Zodyagi Burcunuz : Koyun");
        }
    }
}
