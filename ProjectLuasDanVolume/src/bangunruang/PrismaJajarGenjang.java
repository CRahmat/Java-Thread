package bangunruang;
import bangundatar.JajarGenjang;
public class PrismaJajarGenjang extends JajarGenjang implements BangunRuang {
    double alas, tinggi, tinggiPrisma, sisiMiring;
    public PrismaJajarGenjang(double alas, double tinggi,double tinggiPrisma,double sisiMiring) { //CONSTRUCTOR (Extends Jajar Genjang)
        super(alas, tinggi,tinggiPrisma);
        this.alas = alas;
        this.sisiMiring = sisiMiring;
        this.tinggiPrisma = tinggiPrisma;
        this.tinggi = tinggi;
        volume();
        luasPermukaan();
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public final void volume() {
        setVolume(getLuas()*tinggiPrisma);
        
    }
    @Override //IMPLEMENTS METHOD BANGUN RUANG
    public final void luasPermukaan() {
        double luasAlas=(alas*tinggi);
        setLuasPermukaan ((2*luasAlas)+(2*sisiMiring*tinggiPrisma)+(2*alas*tinggiPrisma));
    }

 
    
    
    
}
