package bangundatar;
import model.Model;
public class LayangLayang extends Model implements BangunDatar{
     private double diagonal1;
     private double diagonal2;
     private double sisi1;
     private double sisi2;
    public LayangLayang(double diagonal1, double diagonal2) { //CONSTRUCTOR (Extends Model)
        super(diagonal1, diagonal2);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        luas(); 
    }

    @Override //IMPLEMENTS METHOD BANGUN DATAR
    public final void luas() { 
        setLuas(((0.5)*diagonal1*diagonal2));
    }  
} 
