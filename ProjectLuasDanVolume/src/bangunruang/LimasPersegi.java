package bangunruang;
import bangundatar.Persegi;
public class LimasPersegi extends Persegi implements BangunRuang {
    double sisi, tinggi;
    public LimasPersegi(double sisi,double tinggi) { //CONSTRUCTOR (Extends Persegi)
        super(sisi);
        this.tinggi = tinggi;
        this.sisi = sisi;
        volume();
        luasPermukaan();
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public final void volume() {
       setVolume(getLuas()*tinggi);
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public final void luasPermukaan() {
        double tinggiSegitiga;
        tinggiSegitiga = Math.sqrt((Math.pow((sisi/2), 2)) + (Math.pow(tinggi, 2)));
        setLuasPermukaan(((sisi*sisi)+(4*((0.5)*sisi*tinggiSegitiga))));
            
    }

    


    

    
    
}
