public class Main {
    public static void main(String[] args){
        Hewan Hewan1 = new Hewan("Hewan Liar", 5);
        Hewan1.suara();
        Hewan1.makan();
        Hewan1.makan("Daging");
        Hewan1.infoHewan();

        Kucing Kucing1 = new Kucing("SapiGemoy", 2, "Persia");
        Kucing1.suara();
        Kucing1.makan("Ikan");
        Kucing1.infoHewan();

        Burung Burung1 = new Burung("SamoGemoy", 1, "Hijau");
        Burung1.suara();
        Burung1.makan("Biji-Bijian");
        Burung1.infoHewan();
    }
}