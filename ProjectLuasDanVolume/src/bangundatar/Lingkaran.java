package bangundatar; 
import model.Model;
public class Lingkaran extends Model implements BangunDatar {
    private double jarijari;
    public final double PHI = 3.14;
    public Lingkaran(double jarijari) { //CONSTRUCTOR (Extends Model)
        super(jarijari);
        this.jarijari = jarijari;
        luas();  
    }
    @Override //IMPLEMENTS METHOD BANGUN DATAR
    public final void luas() {
        setLuas(PHI * jarijari * jarijari);
    }
}
