import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double sum = 0;
        int distance, age, trip_type;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz : ");
        distance = scanner.nextInt();
        System.out.print("Yasinizi giriniz : ");
        age = scanner.nextInt();
        System.out.print("Tek Yon ise 1'i Gidis Donus ise 2'yi giriniz : ");
        trip_type = scanner.nextInt();
        if (distance > 0 && age > 0){
            if (age < 12) {
                sum = (distance * 0.10) * 0.5;
            }
            else if (age >= 12 && age <= 24){
                sum = (distance * 0.10) * 0.90;
            }
            else if (age > 65){
                sum = (distance * 0.10) * 0.70;
            }
            else{
                sum = (distance * 0.10);
            }
            if (trip_type == 1){
                System.out.println(sum);
            } else if (trip_type == 2) {
                sum = (sum + sum) * 0.80;
                System.out.println(sum);
            }
            else{
                System.out.println("Hatali veri girdiniz");
            }
        }  else {
            System.out.println("Hatali veri girdiniz ");
        }
    }
}
