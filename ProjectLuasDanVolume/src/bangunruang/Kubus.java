package bangunruang;
import bangundatar.Persegi;
public class Kubus extends Persegi implements BangunRuang {
    double sisi;
    public Kubus(double sisi) { //CONSTRUCTOR (Extends Kubus)
        super(sisi);
        this.sisi = sisi;
        volume();
        luasPermukaan();
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public final void volume() {
        setVolume(getLuas()*sisi); 
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public final void luasPermukaan() {
        setLuasPermukaan(6 *(getLuas()));
    }

    

   
    
}
