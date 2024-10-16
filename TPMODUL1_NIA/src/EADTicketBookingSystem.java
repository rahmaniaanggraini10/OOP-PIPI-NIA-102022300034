import java.util.ArrayList;
import java.util.Scanner;

class Penerbangan {
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan, 
                       String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.hargaTiket = hargaTiket;
    }

    public String getNomorPenerbangan() { return nomorPenerbangan; }
    public String getBandaraKeberangkatan() { return bandaraKeberangkatan; }
    public String getBandaraTujuan() { return bandaraTujuan; }
    public String getWaktuKeberangkatan() { return waktuKeberangkatan; }
    public String getWaktuKedatangan() { return waktuKedatangan; }
    public float getHargaTiket() { return hargaTiket; }

    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan: " + bandaraKeberangkatan);
        System.out.println("Bandara Tujuan: " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan: " + waktuKeberangkatan);
        System.out.println("Waktu Kedatangan: " + waktuKedatangan);
        System.out.println("Harga Tiket: " + hargaTiket);
    }
}

class Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;

    public Penumpang(String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public String getNIK() { return NIK; }
    public String getNamaDepan() { return namaDepan; }
    public String getNamaBelakang() { return namaBelakang; }

    public void tampilDaftarPenumpang() {
        System.out.println("NIK: " + NIK);
        System.out.println("Nama Depan: " + namaDepan);
        System.out.println("Nama Belakang: " + namaBelakang);
    }
}

class Pembelian {
    private ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
    private ArrayList<Penumpang> daftarPenumpang = new ArrayList<>();
    private Penumpang penumpangTerpilih = null;
    private Penerbangan penerbanganTerpilih = null;
    private Scanner scanner = new Scanner(System.in);

    public void tambahPenerbangan(Penerbangan penerbangan) {
        daftarPenerbangan.add(penerbangan);
    }

    public void tampilkanDaftarPenerbangan() {
        System.out.println("Daftar Penerbangan:");
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarPenerbangan.get(i).getNomorPenerbangan());
            daftarPenerbangan.get(i).tampilDaftarPenerbangan();
            System.out.println();
        }
    }

    public void beliTiket() {
        if (daftarPenumpang.isEmpty()) {
            System.out.println("Silakan masukkan data diri terlebih dahulu.");
            System.out.print("NIM Praktikan: ");
            String nim = scanner.nextLine();
            String namaDepan = "Nama Depan Praktikan"; 
            String namaBelakang = "Nama Belakang Praktikan"; 

            penumpangTerpilih = new Penumpang(nim, namaDepan, namaBelakang);
            daftarPenumpang.add(penumpangTerpilih);
        }
        
        System.out.println("Silakan Pilih Tiket Penerbangan Yang Tersedia:");
        tampilkanDaftarPenerbangan();
        System.out.print("Pilih nomor penerbangan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); 

        if (pilihan >= 1 && pilihan <= daftarPenerbangan.size()) {
            penerbanganTerpilih = daftarPenerbangan.get(pilihan - 1);
            System.out.println("Pembelian Tiket Berhasil dilakukan.");
        } else {
            System.out.println("Nomor Penerbangan Tidak Valid.");
        }
    }

    public void tampilkanPesananTiket() {
        if (penumpangTerpilih == null || penerbanganTerpilih == null) {
            System.out.println("Pembelian Tiket Tidak Ada");
        } else {
            System.out.println("===== Detail Tiket Penerbangan =====");
            penumpangTerpilih.tampilDaftarPenumpang();
            penerbanganTerpilih.tampilDaftarPenerbangan();
        }
    }
}

public class EADTicketBookingSystem {
    public static void main(String[] args) {
        Pembelian pembelian = new Pembelian();

        pembelian.tambahPenerbangan(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 12000000));
        pembelian.tambahPenerbangan(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 13500000));
        
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("====================================");
            System.out.println(" EAD Ticket Booking System");
            System.out.println("====================================");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    pembelian.tampilkanDaftarPenerbangan();
                    break;
                case 2:
                    pembelian.beliTiket();
                    break;
                case 3:
                    pembelian.tampilkanPesananTiket();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}