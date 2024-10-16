// Don't delete any comments below!!!

public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String Nama;
    private int Jumlah;
    private double Harga;
    private String Brand;

    // Todo : Create Constructor of MakananKering
    public MakananKering (String Nama, int Jumlah, double Harga, String Brand){
        this.Nama = Nama;
        this.Jumlah = Jumlah;
        this.Harga = Harga;
        this.Brand = Brand;
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

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    // Todo : Create Method ShowData
    public void SapiGemoy(){
        System.out.println("Nama" + Nama , "Jumlah" + Jumlah , "Harga" + Harga , "Brand" + Brand);
    }
}
