package bangunruang;
import bangundatar.PersegiPanjang;
public class Balok extends PersegiPanjang implements BangunRuang {
        double panjang, lebar, tinggi;
    public Balok(double panjang, double lebar,double tinggi) { //CONSTRUCTOR (Extends Persegi Panjang)
        super(panjang, lebar);
        this.panjang = panjang;
        this.lebar = lebar;
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
        setLuasPermukaan((4*(tinggi*lebar))+(2*(panjang*lebar)));
    }
    
    
}
