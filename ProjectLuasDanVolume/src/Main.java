
import bangundatar.BelahKetupat;
import bangundatar.LayangLayang;
import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;
import bangundatar.Segitiga;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Kerucut;
import bangunruang.KerucutTerpancung;
import bangunruang.Kubus;
import bangunruang.LimasPersegi;
import bangunruang.LimasSegitiga;
import bangunruang.PrismaJajarGenjang;
import bangunruang.PrismaSegitiga;
import bangunruang.Tabung;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Model;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String menu, pilihan;
        int mainMenu = 0, choice = 0;
        boolean exception = false;
        do {
            System.out.println("+==================================+");
            System.out.println("|            KALKULATOR            |");
            System.out.println("|   BANGUN RUANG DAN BANGUN DATAR  |");
            System.out.println("+==================================+");
            System.out.println("|1. Bangun Datar                   |");
            System.out.println("|2. Bangun Ruang                   |");
            System.out.println("+==================================+");
            System.out.print(" Pilih[1-2] : ");
            //EXCEPTION (Pengecekan Input Berupa Angka atau Huruf)
            try {
                menu = input.nextLine();
                mainMenu = Integer.parseInt(menu);//Convert String to Int (Try Error in Integer)
            } catch (NumberFormatException exe) {
                System.err.println("Anda Memassukan Selain Angka, Silahkan Massukan Lagi!!!");
                exception = true;
            }
            switch (mainMenu) {
                case 1: {
                    System.out.println("+==================================+");
                    System.out.println("|      KALKULATOR BANGUN DATAR     |");
                    System.out.println("+==================================+");
                    System.out.println("|1. Persegi                        |");
                    System.out.println("|2. Persegi Panjang                |");
                    System.out.println("|3. Segitiga                       |");
                    System.out.println("|4. Lingkaran                      |");
                    System.out.println("|5. Belah Ketupat                  |");
                    System.out.println("|6. Layang-layang                  |");
                    System.out.println("+==================================+");
                    System.out.print(" Pilih[1-6] : ");
                    //EXCEPTION (Pengecekan Input Berupa Angka atau Huruf)
                    try {
                        pilihan = input.nextLine();
                        choice = Integer.parseInt(pilihan);//Convert String to Int (Try Error in Integer)
                    } catch (NumberFormatException exe) {
                        System.err.println("Anda Memassukan Selain Angka, Silahkan Massukan Lagi!!!");
                        exception = true;
                    }
                    switch (choice) {
                        case 1: {
                            double sisi;
                            System.out.println("+==================================+");
                            System.out.println("|     KALKULATOR BANGUN PERSEGI    |");
                            System.out.println("+==================================+");
                            System.out.print(" Masukkan Sisi   : ");
                            sisi = input.nextDouble();
                            Model persegi = new Persegi(sisi); //PHOLIMORFISME 
                            System.out.println("Luas Persegi     : " + persegi.getLuas());
                        }
                        break;
                        case 2: {

                            double panjang;
                            double lebar;
                            System.out.println("+==================================+");
                            System.out.println("|     KALKULATOR BANGUN PANJANG    |");
                            System.out.println("+==================================+");
                            System.out.print(" Masukan Panjang       : ");
                            panjang = input.nextDouble();
                            System.out.print(" Masukkan Lebar        : ");
                            lebar = input.nextDouble();
                            Model persegiPanjang = new PersegiPanjang(panjang, lebar); //PHOLIMORFISME
                            System.out.println("Luas Persegi Panjang  : " + persegiPanjang.getLuas());
                        }
                        break;
                        case 3: {
                            double alas;
                            double tinggi;
                            System.out.println("+==================================+");
                            System.out.println("|     KALKULATOR BANGUN SEGITIGA   |");
                            System.out.println("+==================================+");
                            System.out.print(" Masukkan Alas   : ");
                            alas = input.nextDouble();
                            System.out.print(" Masukkan Tinggi : ");
                            tinggi = input.nextDouble();
                            Model segitiga = new Segitiga(alas, tinggi); //PHOLIMORFISME
                            System.out.println("Luas Segitiga    : " + segitiga.getLuas());
                        }
                        break;
                        case 4: {
                            double jariJari;
                            System.out.println("+==================================+");
                            System.out.println("|    KALKULATOR BANGUN LINGKARAN   |");
                            System.out.println("+==================================+");
                            System.out.print(" Masukkan jari-jari : ");
                            jariJari = input.nextDouble();
                            Model lingkaran = new Lingkaran(jariJari); //PHOLIMORFISME
                            System.out.println(" Luas Lingkaran      : " + lingkaran.getLuas());
                        }
                        break;
                        case 5: {
                            double d1, d2;
                            System.out.println("+==================================+");
                            System.out.println("| KALKULATOR BANGUN BELAH KETUPAT  |");
                            System.out.println("+==================================+");
                            System.out.print(" Masukkan Diagonal 1 : ");
                            d1 = input.nextDouble();
                            System.out.print(" Masukkan Diagonal 2 : ");
                            d2 = input.nextDouble();
                            Model belahKetupat = new BelahKetupat(d1, d2); //PHOLIMORFISME
                            System.out.println(" Luas Belah Ketupat   : " + belahKetupat.getLuas());

                        }
                        break;
                        case 6: {
                            double d1, d2;
                            System.out.println("+==================================+");
                            System.out.println("| KALKULATOR BANGUN LAYANG LAYANG  |");
                            System.out.println("+==================================+");
                            System.out.print(" Masukkan Diagonal 1 : ");
                            d1 = input.nextDouble();
                            System.out.print(" Masukkan Diagonal 2 : ");
                            d2 = input.nextDouble();
                            Model layangLayang = new LayangLayang(d1, d2); //PHOLIMORFISME
                            System.out.println(" Luas Layang Layang  : " + layangLayang.getLuas());
                        }
                        break;
                    }

                }
                break;
                case 2: {
                    System.out.println("+==================================+");
                    System.out.println("|      KALKULATOR BANGUN RUANG     |");
                    System.out.println("+==================================+");
                    System.out.println("|1. Balok                          |");
                    System.out.println("|2. Kubus                          |");
                    System.out.println("|3. Tabung                         |");
                    System.out.println("|4. Kerucut                        |");
                    System.out.println("|5. Bola                           |");
                    System.out.println("|6. Limas Segitiga                 |");
                    System.out.println("|7. Limas persegi                  |");
                    System.out.println("|8. Prisma Segitiga                |");
                    System.out.println("|9. Prisma Jajar Genjang           |");
                    System.out.println("|10. Kerucut Terpancung            |");
                    System.out.println("+==================================+");
                    System.out.print(" Pilih[1-10] : ");
                    //EXCEPTION (Pengecekan Input Berupa Angka atau Huruf)
                    try {
                        pilihan = input.nextLine();
                        choice = Integer.parseInt(pilihan);//Convert String to Int (Try Error in Integer)
                    } catch (NumberFormatException exe) {
                        System.err.println("Anda Memassukan Selain Angka, Silahkan Massukan Lagi!!!");
                        exception = true;
                    }
                    switch (choice) {
                        case 1: {
                            double panjang;
                            double lebar;
                            double tinggi;
                            System.out.println("+==================================+");
                            System.out.println("|      KALKULATOR BANGUN BALOK     |");
                            System.out.println("+==================================+");
                            System.out.print(" Masukkan Panjang     : ");
                            panjang = input.nextDouble();
                            System.out.print(" Masukkan Lebar       : ");
                            lebar = input.nextDouble();
                            System.out.print(" Masukkan Tinggi      : ");
                            tinggi = input.nextDouble();
                            Model balok = new Balok(panjang, lebar, tinggi); //PHOLIMORFISME
                            System.out.println(" Luas Permukaan Balok : " + balok.getLuasPermukaan());
                            System.out.println(" Volume Balok         : " + balok.getVolume());
                        }
                        break;
                        case 2: {
                            double sisi;
                            System.out.println("+==================================+");
                            System.out.println("|      KALKULATOR BANGUN KUBUS     |");
                            System.out.println("+==================================+");
                            System.out.print(" Masukkan Sisi        : ");
                            sisi = input.nextDouble();
                            Model kubus = new Kubus(sisi); //PHOLIMORFISME
                            System.out.println(" Luas Permukaan Kubus : " + kubus.getLuasPermukaan());
                            System.out.println(" Volume Kubus         : " + kubus.getVolume());
                        }
                        break;
                        case 3: {
                            double jariJari;
                            double tinggi;
                            System.out.println("+==================================+");
                            System.out.println("|     KALKULATOR BANGUN TABUNG     |");
                            System.out.println("+==================================+");
                            System.out.print(" Masukkan Jari-Jari Tabung : ");
                            jariJari = input.nextDouble();
                            System.out.print(" Masukkan Tinggi Tabung    : ");
                            tinggi = input.nextDouble();
                            Model tabung = new Tabung(jariJari, tinggi); //PHOLIMORFISME
                            System.out.println(" Luas Permukaan Tabung     : " + tabung.getLuasPermukaan());
                            System.out.println(" Volume Tabung = " + tabung.getVolume());
                        }
                        break;

                        case 4: {
                            double jariJari;
                            double tinggi;
                            System.out.println("+==================================+");
                            System.out.println("|     KALKULATOR BANGUN KERUCUT    |");
                            System.out.println("+==================================+");
                            System.out.print(" Masukkan Jari-Jari Kerucut : ");
                            jariJari = input.nextDouble();
                            System.out.print(" Masukkan Tinggi Tabung     : ");
                            tinggi = input.nextDouble();
                            Model kerucut = new Kerucut(jariJari, tinggi); //PHOLIMORFISME
                            System.out.println(" Luas Permukaan Kerucut     : " + kerucut.getLuasPermukaan());
                            System.out.println(" Volume Kerucut             : " + kerucut.getVolume());
                        }
                        break;
                        case 5: {
                            double jariJari;
                            System.out.println("+==================================+");
                            System.out.println("|       KALKULATOR BANGUN BOLA     |");
                            System.out.println("+==================================+");
                            System.out.print(" Masukkan Jari-Jari Bola : ");
                            jariJari = input.nextDouble();
                            Model bola = new Bola(jariJari); //PHOLIMORFISME
                            System.out.println(" Luas Permukaan Bola     : " + bola.getLuasPermukaan());
                            System.out.println(" Volume Bola             : " + bola.getVolume());
                        }
                        break;
                        case 6: {
                            double alas;
                            double tinggiLimas;
                            double tinggiAlas;
                            System.out.println("+==================================+");
                            System.out.println("| KALKULATOR BANGUN LIMAS SEGITIGA |");
                            System.out.println("+==================================+");
                            System.out.println(" Masukkan Sisi Alas    : ");
                            alas = input.nextDouble();
                            System.out.println(" Masukkan Tinggi Alas  : ");
                            tinggiAlas = input.nextDouble();
                            System.out.println(" Masukkan Tinggi Limas : ");
                            tinggiLimas = input.nextDouble();
                            Model limasSegitiga = new LimasSegitiga(alas, tinggiAlas, tinggiLimas); //PHOLIMORFISME
                            System.out.println(" Luas Permukaan Limas Seigita : " + limasSegitiga.getLuasPermukaan());
                            System.out.println(" Volume Limas Segitiga        : " + limasSegitiga.getVolume());
                        }
                        break;
                        case 7: {
                            double sisi;
                            double tinggi;
                            System.out.println("+==================================+");
                            System.out.println("| KALKULATOR BANGUN LIMAS PERSEGI  |");
                            System.out.println("+==================================+");
                            System.out.println(" Masukkan Sisi Alas    : ");
                            sisi = input.nextDouble();
                            System.out.println(" Masukkan Tinggi Limas : ");
                            tinggi = input.nextDouble();
                            Model limasPersegi = new LimasPersegi(sisi, tinggi); //PHOLIMORFISME
                            System.out.println(" Luas Permukaan Limas Persegi : " + limasPersegi.getLuasPermukaan());
                            System.out.println(" Volume LImas Persegi         : " + limasPersegi.getVolume());
                        }
                        break;
                        case 8: {
                            double alas;
                            double tinggiPrisma;
                            double tinggiAlas;
                            System.out.println("+==================================+");
                            System.out.println("|KALKULATOR BANGUN PRISMA SEGITIGA |");
                            System.out.println("+==================================+");
                            System.out.println(" Masukkan Sisi Alas    : ");
                            alas = input.nextDouble();
                            System.out.println(" Masukkan Tinggi Alas  : ");
                            tinggiAlas = input.nextDouble();
                            System.out.println(" Masukkan Tinggi Limas : ");
                            tinggiPrisma = input.nextDouble();
                            Model prismaSegitiga = new PrismaSegitiga(alas, tinggiAlas, tinggiPrisma); //PHOLIMORFISME
                            System.out.println(" Luas Permukaan Prisma Segitiga : " + prismaSegitiga.getLuasPermukaan());
                            System.out.println(" Volume Prisma Segitiga         : " + prismaSegitiga.getVolume());
                        }
                        break;
                        case 9: {
                            double alas;
                            double tinggiPrisma;
                            double tinggiAlas;
                            double sisiMiring;
                            System.out.println("+==================================+");
                            System.out.println("| KALKULATOR  PRISMA JAJAR GENJANG |");
                            System.out.println("+==================================+");
                            System.out.println(" Masukkan Sisi Alas    : ");
                            alas = input.nextDouble();
                            System.out.println(" Masukkan Tinggi Alas  : ");
                            tinggiAlas = input.nextDouble();
                            System.out.println(" Masukkan Tinggi Limas : ");
                            tinggiPrisma = input.nextDouble();
                            System.out.println(" Masukan Sisi Miring   : ");
                            sisiMiring = input.nextDouble();
                            Model prismaJajarGenjang = new PrismaJajarGenjang(alas, tinggiAlas, tinggiPrisma, sisiMiring); //PHOLIMORFISME
                            System.out.println(" Luas Permukaan Prisma jajar Genjang : " + prismaJajarGenjang.getLuasPermukaan());
                            System.out.println(" Volume Prisma Jajar Genjang         : " + prismaJajarGenjang.getVolume());
                        }
                        break;
                        case 10: {
                            double jariJari;
                            double jariJari2;
                            double tinggi;
                            System.out.println("+==================================+");
                            System.out.println("|  KALKULATOR KERUCUT TERPANCUNG   |");
                            System.out.println("+==================================+");
                            System.out.print(" Masukkan Jari-Jari Besar : ");
                            jariJari2 = input.nextDouble();
                            System.out.print(" Masukan Jari-Jari Kecil  : ");
                            jariJari = input.nextDouble();
                            System.out.print(" Masukkan Tinggi Benda    : ");
                            tinggi = input.nextDouble();
                            Model kerucutTerpancung = new KerucutTerpancung(jariJari, jariJari2, tinggi); //PHOLIMORFISME
                            System.out.println("Luas Permukaan            : " + kerucutTerpancung.getLuasPermukaan());
                            System.out.println("Volume Kerucut Terpancung : " + kerucutTerpancung.getVolume());
                        }
                        break;
                    }
                }
                break;

            }
        } while (mainMenu < 3 && mainMenu > 0 || exception == true);
    }
}
