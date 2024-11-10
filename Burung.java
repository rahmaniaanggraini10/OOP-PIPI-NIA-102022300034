public class Burung extends Hewan{
    private String warnaBulu;
        private String Umur;
    
        public Burung (String Nama, int Umur, String warnaBulu){
            super(Nama, Umur);
            this.warnaBulu = warnaBulu;
        }
    
        @Override
        public void suara(){
            System.out.println("Burung Berkicau");
        }
    
        @Override
        public void infoHewan(){
            System.out.println("Nama: " + Nama + ", Umur: " + Umur + ", Warna Bulu: " + warnaBulu);
    }
}