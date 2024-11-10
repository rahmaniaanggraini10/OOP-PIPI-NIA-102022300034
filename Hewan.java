public  class Hewan {
    protected String Nama;
    private int Umur;

public Hewan(String Nama, int Umur){
    this.Nama = Nama;
    this.Umur = Umur;
}

public String getNama(){
    return Nama;
}

public void setNama(String Nama){
    this.Nama = Nama;    
}

public int getUmur(){
    return Umur;
}

public void setUmur(int Umur){
    this.Umur = Umur;
}

public void suara(){
    System.out.println("Hewan Mengeluarkan Suara.");
}

public void makan(){
    System.out.println(Nama + "Sedang Makan.");
}

public void makan(String Makanan){
    System.out.println(Nama + "Sedang Makan" + Makanan + ".");
}

public void infoHewan(){
    System.out.println("Nama:" + Nama + ", Umur:" + Umur);
}
}
