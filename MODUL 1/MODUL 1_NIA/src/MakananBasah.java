// Don't delete any comments below!!!
public class MakananBasah {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
    private String Nama;
    private int Jumlah;
    private double Harga;
    private String Bahan;

    // Todo : Create Constructor of MakananBasah
public MakananBasah (String Nama, int Jumlah, double Harga, String Bahan){
    this.Nama = Nama;
    this.Jumlah = Jumlah;
    this.Harga = Harga;
    this.Bahan = Bahan;
}
    // Todo : Create Getter and Setter

public String getNama() {
    return Nama;
}

public void setNama(String nama) {
    Nama = nama;
}

public int getJumlah() {
    return Jumlah;
}

public void setJumlah(int jumlah) {
    Jumlah = jumlah;
}

public double getHarga() {
    return Harga;
}

public void setHarga(double harga) {
    Harga = harga;
}

public String getBahan() {
    return Bahan;
}

public void setBahan(String bahan) {
    Bahan = bahan;
}
    

    // Todo : Create Method ShowData
    public void SapiGemoy(){
        System.out.println("Nama" + Nama , "Jumlah" + Jumlah , "Harga" + Harga , "Bahan" + Bahan);
    }

}
