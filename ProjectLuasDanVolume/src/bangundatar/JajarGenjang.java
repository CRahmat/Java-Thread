package bangundatar;
import model.Model;
public class JajarGenjang extends Model implements BangunDatar {
    double alas, tinggi;
    public JajarGenjang(double alas, double tinggi, double sisiMiring) { //CONSTRUCTOR (Extends Model)
        super(alas, tinggi);
        this.alas = alas;
        this.tinggi = tinggi;
        luas();
    }
    @Override //IMPLEMENTS METHOD BANGUN DATAR
    public final void luas() {
        setLuas(alas * tinggi);
    }
}
