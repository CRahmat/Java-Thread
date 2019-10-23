package bangunruang;
import bangundatar.Segitiga;
public class PrismaSegitiga extends Segitiga implements BangunRuang {
    double alas, tinggi, tinggiPrisma;
    public PrismaSegitiga(double alas, double tinggi,double tinggiPrisma) { //CONSTRUCTOR (Extends Segitiga)
        super(alas, tinggi);
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggiPrisma = tinggiPrisma;
        volume();
        luasPermukaan();
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public final void volume() {
        setVolume (getLuas()*tinggiPrisma);  
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public final void luasPermukaan() {
        double luasBidangTegak=((0.5)*alas*tinggiPrisma);
        setLuasPermukaan((2*getLuas())+(3*luasBidangTegak));
    }
 
}
