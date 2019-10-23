package bangunruang;
import bangundatar.Segitiga;
public class LimasSegitiga extends Segitiga implements BangunRuang {
       double alas, tinggiAlas, tinggiLimas;
    public LimasSegitiga(double alas, double tinggiAlas, double tinggiLimas) { //CONSTRUCTOR (Extends Segitiga)
        super(alas, tinggiAlas);
        this.alas = alas;
        this.tinggiAlas = tinggiAlas;
        this.tinggiLimas = tinggiLimas;
        volume();
        luasPermukaan();
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public final void volume() {
        setVolume(1/3*(getLuas()*tinggiLimas));   
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public final void luasPermukaan() {
        setLuasPermukaan((0.5*alas*tinggiAlas)+(3 * tinggiLimas * alas * 0.5));
    }
}
