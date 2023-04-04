package uts;
import java.util.Scanner;

public class Uts {

    public static void main(String[] args) {
    int jumlahPenumpang, penumpangPorong = 0, turunPorong = 0, naikPorong = 0, penumpangSurabaya = 0, turunSurabaya = 0, naikSurabaya = 0, penumpangGresik = 0, turunGresik = 0, naikGresik = 0;
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jumlah penumpang di awal: ");
    jumlahPenumpang = input.nextInt();
    Bus bus = new Bus(jumlahPenumpang);
    
    Halte porong = new Halte(penumpangPorong);
    System.out.println("1. Bus Berangkat dari PULL/Kantor:");
    System.out.println("- jumlah penumpang: " + bus.getJumlahPenumpang() + " penumpang");
    System.out.print("Masukkan jumlah penumpang turun di Halte Porong: ");
    turunPorong = input.nextInt();
    System.out.print("Masukkan jumlah penumpang turun di Halte Gresik: ");
    turunGresik = input.nextInt();
    
    System.out.println("- " + turunPorong + " penumpang turun di Halte Porong");
    System.out.println("- " + turunGresik + " penumpang turun");
    System.out.print("Masukkan jumlah penumpang di Halte Porong: ");
    penumpangPorong = input.nextInt();
    System.out.println("2. Halte Porong: " + penumpangPorong + " Penumpang menunggu");

    System.out.println("3. Bus Sampai di Halte PORONG:");
    System.out.print("Masukkan jumlah penumpang turun di Halte Porong: ");
    turunPorong = input.nextInt();
    System.out.print("Masukkan jumlah penumpang naik di Halte Porong: ");
    naikPorong = input.nextInt();
    
    System.out.println("- " + turunPorong + " penumpang turun");
    System.out.println("- " + naikPorong + " penumpang naik");
    bus.turun(turunPorong);
    bus.naik(naikPorong);
    porong.setPenumpangMenunggu(penumpangPorong - naikPorong);
    System.out.println("        - tujuan Surabaya ");
    System.out.println("        - tujuan Gresik ");
    System.out.println("- jumlah penumpang : " + bus.getJumlahPenumpang() + " penumpang");
    System.out.println("4. Halte Porong : " + porong.getPenumpangMenunggu() + " Penumpang menunggu");
        
    Halte surabaya = new Halte(penumpangSurabaya);
    System.out.print("Masukkan jumlah penumpang di Halte Surabaya: ");
    penumpangSurabaya = input.nextInt();
  
    System.out.println("5. Halte Surabaya: " + penumpangSurabaya + " Penumpang menunggu");

    System.out.println("6. Bus Sampai di Halte SURABAYA:");
    System.out.print("Masukkan jumlah penumpang turun di Halte Surabaya: ");
    turunSurabaya = input.nextInt();
    System.out.print("Masukkan jumlah penumpang naik di Halte Surabaya: ");
    naikSurabaya = input.nextInt();
    bus.turun(turunSurabaya);
    bus.naik(naikSurabaya);
    surabaya.setPenumpangMenunggu(penumpangSurabaya - naikSurabaya);
    System.out.println("- " + turunSurabaya + " penumpang turun");
    System.out.println("- " + naikSurabaya + " penumpang naik");
    System.out.println("- " + naikSurabaya + " penumpang tujuan Gresik");
    System.out.println("- jumlah penumpang: " + bus.getJumlahPenumpang() + " penumpang");
    System.out.println("7. Halte Surabaya: " + surabaya.getPenumpangMenunggu() + " Penumpang menunggu");
    }
}