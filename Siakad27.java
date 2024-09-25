import java.util.Scanner;
public class Siakad27 {

    public static void main(String[] args) {
        
        //1. input
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        double nilaiUts, nilaiUas, totalNilai;

        //2. hitung
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine() .charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUas = sc.nextDouble();
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        totalNilai = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUts * 0.3) + (nilaiUas * 0.35);

        //3. output
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ")");
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Total Nilai: " + totalNilai);


        String nilaiHuruf, kualifikasi;
        if (totalNilai >=80 && totalNilai <=100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
            System.out.println("Nilai Akhir huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: " + kualifikasi);
        } 
        else if (totalNilai >=73 && totalNilai <=80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
            System.out.println("Nilai Akhir huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: " + kualifikasi);
        }
        else if (totalNilai >=65 && totalNilai <=73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
            System.out.println("Nilai Akhir huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: " + kualifikasi);
        }
        else if (totalNilai >=60 && totalNilai <=65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
            System.out.println("Nilai Akhir huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: " + kualifikasi);
        }
        else if (totalNilai >=50 && totalNilai <=60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
            System.out.println("Nilai Akhir huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: " + kualifikasi);
        }
        else if (totalNilai >=39 && totalNilai <=50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
            System.out.println("Nilai Akhir huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: " + kualifikasi);
        }
        else if (totalNilai <=39) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
            System.out.println("Nilai Akhir huruf: " + nilaiHuruf);
            System.out.println("Kualifikasi: " + kualifikasi);
        }
       
    }
}