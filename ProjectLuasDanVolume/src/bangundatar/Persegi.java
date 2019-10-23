package bangundatar;
import model.Model;
public class Persegi extends Model implements BangunDatar {
    double sisi;
    public Persegi(double sisi) { //CONSTRUCTOR (Extends Model)
        super(sisi);
        this.sisi = sisi;
        luas();
    }
     //IMPLEMENTS METHOD BANGUN DATAR
    @Override
    public final void luas() {
        setLuas(sisi*sisi);
    }
}
