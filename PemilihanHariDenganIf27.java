import java.util.Scanner;
public class PemilihanHariDenganIf27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        String dayType;
        System.out.print("Input angka: ");
        angka = sc.nextInt();

        switch (angka) {
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
                dayType = "weekday";
                break;
            case '6':
            case '7':
                dayType = "weekend";
                break;
            default:
                dayType = "invalid number";
              
        }
        System.out.println(angka + " is a " + dayType);
    }
}
