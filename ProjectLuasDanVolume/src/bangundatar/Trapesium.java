package bangundatar;
import model.Model;
public class Trapesium extends Model implements BangunDatar{
     private double sisi1;
     private double sisi2;
     private double tinggi;
    public Trapesium(double sisi1, double sisi2, double tinggi) { //CONSTRUCTOR (Extends Model)
        super(sisi1,sisi2,tinggi);
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        luas();
    }

    @Override //IMPLEMENTS METHOD BANGUN DATAR
    public final void luas() {
        setLuas((0.5)*(sisi1+sisi2)*(tinggi));
    } 
}
