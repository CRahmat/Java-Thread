package bangunruang;
public class KerucutTerpancung extends Kerucut implements BangunRuang {
            private final double PHI = 3.14159265358979323846;
            double jariJari1, jariJari2, tinggi;

    public KerucutTerpancung(double jariJari1, double jariJari2,double tinggi) { //CONSTRUCTOR (Extends Kerucut)
        super(jariJari1,tinggi);
        this.jariJari1 = jariJari1;
        this.jariJari2 = jariJari2;
        this.tinggi = tinggi;
        volume();
        luasPermukaan();
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public void volume() {
        double tinggiKerucut = ((tinggi * jariJari1)/(jariJari2-jariJari1) + tinggi);
        double volumeKerucut = ((0.33333) * PHI * (Math.pow(jariJari2, 2)) * tinggiKerucut);
        double volumeKerucutKecil = ((0.33333) * PHI * (Math.pow(jariJari1, 2)) * tinggi);
        setVolume (volumeKerucut - volumeKerucutKecil);  
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public void luasPermukaan() {
        double alas = jariJari2 - jariJari1;
        double s = ((Math.sqrt(Math.pow(alas, 2)))+ (Math.pow(tinggi, 2)));
        setLuasPermukaan((PHI * s) *(jariJari2 + jariJari1));
    }
 
}
