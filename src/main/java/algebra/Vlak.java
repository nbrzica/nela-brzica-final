package algebra;


public abstract class Vlak {

    private int brojVozila;

    public Vlak() {
    }

    public void setBrojVozila(int brojVozila) {
        this.brojVozila = brojVozila;
    }

    public int getBrojVozila() {
        return brojVozila;
    }

    public abstract double IzracunajZaradu();
}
