import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,num3,temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.sayiyi giriniz : ");
        num1 = scanner.nextInt();
        System.out.print("2.sayiyi giriniz : ");
        num2 = scanner.nextInt();
        System.out.print("3.sayiyi giriniz : ");
        num3 = scanner.nextInt();

        if (num1 < num2 && num1 < num3){
            if (num2 < num3){
                System.out.println(num1+" "+num2+" "+num3);
            }
            else{
                System.out.println(num1+" "+num3+" "+num2);
            }
        }
        else if (num2 < num1 && num2 < num3){
            if (num1 < num3){
                System.out.println(num2+" "+num1+" "+num3);
            }
            else{
                System.out.println(num2+" "+num3+" "+num1);
            }
        }
        else{
            if (num2 < num1){
                System.out.println(num3+" "+num2+" "+num1);
            }
            else{
                System.out.println(num3+" "+num1+" "+num2);
            }
        }

    }
}
