package algebra;

import java.util.List;

public class MaliVlak extends Vlak {

    List<MaloVozilo> malaVozila;

    public MaliVlak() {
    }

    @Override
    public double IzracunajZaradu() {
        double zarada = 0;

        for (MaloVozilo vozilo : malaVozila) {
            zarada += vozilo.DohvatiNaplatu();
        }

        return zarada;
    }

    public List<MaloVozilo> getMalaVozila() {
        return malaVozila;
    }

    public void setMalaVozila(List<MaloVozilo> malaVozila) {
        if (malaVozila.size() > getBrojVozila()) {
            throw new IllegalArgumentException("Broj vozila je veći od dopuštenog.");
        }

        this.malaVozila = malaVozila;
    }

}
