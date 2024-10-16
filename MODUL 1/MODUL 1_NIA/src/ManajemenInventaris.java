// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner

import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();

    public void tambahMakananKering() {
        Scanner scanner = new Scanner(System.in);
        
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.println("Masukkan Nama Makanan: ");
        String Nama = scanner.nextLine();
        System.out.println("Masukkan Jumlah Makanan: ");
        int Jumlah = scanner.nextInt();
        System.out.println("Masukkan Harga Makanan: ");
        double Harga = scanner.nextDouble();
        System.out.println("Masukkan Brand Makanan: ");
        String Brand = scanner.nextLine();

        // Todo : Create a new object for MakananKering
    MakananKering Makanan = new MakananKering(Nama, Jumlah, Harga, Brand);
    daftarMakananKering.add(Makanan);

        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
    System.out.println("Makanan Kering Berhasil di Tambahkan");
    }

    public void tambahMakananBasah() {
        Scanner scanner = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.println("Masukkan Nama Makanan: ");
        String Nama = scanner.nextLine();
        System.out.println("Masukkan Jumlah Makanan: ");
        int Jumlah = scanner.nextInt();
        System.out.println("Masukkan Harga Makanan: ");
        double Harga = scanner.nextDouble();
        System.out.println("Masukkan Bahan Makanan: ");
        String Brand = scanner.nextLine();
        // Todo : Create a new object for MakananBasah
        MakananBasah Makanan = new MakananBasah(Nama, Jumlah, Harga, Bahan);
        daftarMakananBasah.add(Makanan);
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
    System.out.println("Makanan Basag berhasil di Tambahkan ");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
        } else {
            // Todo : Create print notification for Makanan Kering  
            for 
            }
            // Todo : Create print notification for  Makanan Basah
            for 
            }
        }
    }
}
