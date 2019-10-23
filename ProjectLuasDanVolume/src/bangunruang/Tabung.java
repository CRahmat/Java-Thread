package bangunruang;
import bangundatar.Lingkaran;
public class Tabung extends Lingkaran implements BangunRuang{
    private final double PHI = 3.14;
    double jariJari, tinggi;
    public Tabung(double jariJari, double tinggi) { //CONSTRUCTOR (Extends Tabung)
        super(jariJari);
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        volume();
        luasPermukaan(); 
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public final void volume() {
        setVolume(getLuas()*tinggi);
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public final void luasPermukaan() {
        setLuasPermukaan(((2*(PHI*jariJari))*(jariJari+tinggi)));
    }  
}
