package bangundatar;
import model.Model;
public class PersegiPanjang extends Model implements BangunDatar{
     public double panjang;
     public double lebar;

    public PersegiPanjang(double panjang, double lebar) { //CONSTRUCTOR (Extends Model)
        super(panjang, lebar);
        this.panjang = panjang;
        this.lebar = lebar;
        luas();
    }
    @Override //IMPLEMENTS METHOD BANGUN DATAR
    public final void luas() {
        setLuas(panjang*lebar);
    }   
}
