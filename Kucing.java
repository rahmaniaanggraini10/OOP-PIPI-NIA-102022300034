public class Kucing extends Hewan{
    private String ras;
        private String Umur;
    
        public Kucing(String Nama, int Umur, String ras){
            super(Nama,Umur);
            this.ras = ras;
        }
    
        @Override
        public void suara(){
            System.out.println("Kucing Mengeong");
        }
    
        @Override
        public void infoHewan(){
            System.out.println("Nama: " + Nama + ", Umur: " + Umur + ", Ras: " + ras);
    }
}