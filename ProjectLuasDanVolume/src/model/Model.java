package model;
//Model -> Mempersingkat Penggunaan Method dalam SubClass-nya
public class Model {
    private double a;
    private double b;
    private double c;
    private double d;
    private double luas;          //ENCAPSULATION
    private double keliling;      //ENCAPSULATION
    private double volume;        //ENCAPSULATION
    private double luasPermukaan; //ENCAPSULATION
    public Model(double a){ // OVERLOADING
        this.a = a;
    }
    public Model(double a, double b){ //OVERLOADING
        this.a = a;
        this.b = b;
    }
    public Model(double a, double b,double c){ //OVERLOADING
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void luas(double luas){
        System.out.println("Luas adalah : "+luas);
    }
    public double getLuas() {
        return luas;
    }
    public void setLuas(double luas) {
        this.luas = luas;
    }
    public double getKeliling() {
        return keliling;
    }
    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double getLuasPermukaan() {
        return luasPermukaan;
    }
    public void setLuasPermukaan(double luasPermukaan) {
        this.luasPermukaan = luasPermukaan;
    }
}
