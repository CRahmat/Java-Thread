package bangundatar;
import model.Model;
public class Segitiga extends Model implements BangunDatar{
     private double alas;
     private double tinggi;
    public Segitiga(double alas, double tinggi) { //CONSTRUCTOR (Extends Model)
        super(alas, tinggi);
        this.alas = alas;
        this.tinggi = tinggi;
        luas();
    }
    @Override //IMPLEMENTS METHOD BANGUN DATAR
    public final void luas() {
        setLuas((0.5)*(alas*tinggi));
    }  
}
