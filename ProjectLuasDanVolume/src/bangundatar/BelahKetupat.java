package bangundatar;
//Menurunkan sifat-sifat dari Class Model

import model.Model;

public class BelahKetupat extends Model implements BangunDatar {
    private final double diagonal1;
    private final double diagonal2;
    public BelahKetupat(double diagonal1, double diagonal2) { //CONSTRUCTOR (Extends Model)
        super(diagonal1, diagonal2);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        luas(); 
    }
    @Override //IMPLEMENTS METHOD BANGUN DATAR
    public final void luas() {
        setLuas(((0.5) * diagonal1 * diagonal2));
    }
}
