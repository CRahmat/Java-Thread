package bangunruang;
import bangundatar.Lingkaran;
public class Kerucut extends Lingkaran implements BangunRuang {
    private final double PHI = 3.14159265358979323846;
    double jariJari, tinggi;
    public Kerucut(double jariJari, double tinggi) { //CONSTRUCTOR (Extends Lingkaran)
        super(jariJari);
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        volume();
        luasPermukaan();
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public void volume() {
        setVolume((0.33333) * (getLuas() * tinggi));
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public void luasPermukaan() {
        double garispelukis;
        garispelukis = Math.sqrt((Math.pow(jariJari, 2) + Math.pow(tinggi, 2)));
        setLuasPermukaan((PHI * jariJari) * (jariJari + garispelukis));
    }

}
