package algebra;

public class FactoryVozila {
    public static VelikoVozilo createVelikoVozilo(VrstaVelikihVozila vrsta, String registracija, String marka, String vlasnik, TipVozila tip, double napunjenost){
        if (vrsta == null) {
            throw new IllegalArgumentException("Vrsta vozila mora biti predana");
        }

        if (vrsta.equals(VrstaVelikihVozila.AUTOBUS)){
            VelikoVozilo autobus = new Autobus();
            autobus.setMarka(marka);
            autobus.setRegistracija(registracija);
            autobus.setVlasnik(vlasnik);
            autobus.setTipVozila(tip);
            autobus.setNapunjenostVozila(napunjenost);
            return  autobus;
        }
        else {
            VelikoVozilo kamion = new Kamion();
            kamion.setMarka(marka);
            kamion.setRegistracija(registracija);
            kamion.setVlasnik(vlasnik);
            kamion.setTipVozila(tip);
            kamion.setNapunjenostVozila(napunjenost);
            return  kamion;
        }
    }

    public static MaloVozilo createMaloVozilo(VrstaMalihVozila vrsta, String registracija, String marka, String vlasnik, TipVozila tip, double napunjenost){
        if (vrsta == null) {
            throw new IllegalArgumentException("Vrsta vozila mora biti predana");
        }

        if (vrsta.equals(VrstaMalihVozila.AUTOMOBIL)){
            MaloVozilo auto = new Automobil();
            auto.setMarka(marka);
            auto.setRegistracija(registracija);
            auto.setVlasnik(vlasnik);
            auto.setTipVozila(tip);
            auto.setNapunjenostVozila(napunjenost);
            return  auto;
        }

        else {
            MaloVozilo kombij = new Kombij();
            kombij.setMarka(marka);
            kombij.setRegistracija(registracija);
            kombij.setVlasnik(vlasnik);
            kombij.setTipVozila(tip);
            kombij.setNapunjenostVozila(napunjenost);
            return  kombij;
        }
    }
}
