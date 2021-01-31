package algebra;

public abstract class Vozilo {
   private String registracija;
   private String marka;
   private String vlasnik;
   private TipVozila tipVozila;
   private double napunjenostVozila;

    public Vozilo() {
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public TipVozila getTipVozila() {
        return tipVozila;
    }

    public void setTipVozila(TipVozila tipVozila) {
        this.tipVozila = tipVozila;
    }

    public double getNapunjenostVozila() {
        return napunjenostVozila;
    }

    public void setNapunjenostVozila(double napunjenostVozila) {
        this.napunjenostVozila = napunjenostVozila;
    }

    public abstract double DohvatiNaplatu();

    public void Napuni(){
        this.napunjenostVozila = 1.0;
    }
}
