import java.util.Scanner;
public class PemilihanHariDenganIf27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        String dayType;
        System.out.print("Input angka: ");
        angka = sc.nextInt();

        if (angka >=1 && angka<=5) {
            dayType = "weekday";
            
        } 
        else if (angka ==6 || angka==7) {
            dayType = "weekend";
        }
        else {
            dayType = "Invalid number";
        }
        System.out.println(angka + " is a " + dayType);
        }
        
    }

