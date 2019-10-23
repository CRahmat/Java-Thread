package bangunruang;
import bangundatar.Lingkaran;
public class Bola extends Lingkaran implements BangunRuang {
    double jariJari;
    public Bola(double jariJari) { //CONSTRUCTOR (Extends Lingkaran)
        super(jariJari);
        this.jariJari = jariJari;
        volume();
        luasPermukaan();
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public final void volume() {
        setVolume(((4/3)*PHI*(Math.pow(jariJari,3))));
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public final void luasPermukaan() {
       setLuasPermukaan((4*PHI*(Math.pow(jariJari,2))));
    }  
}
