package algebra;

import java.util.List;

public class VelikiVlak extends Vlak {
    List<VelikoVozilo> velikaVozila;

    public VelikiVlak() {
    }

    @Override
    public double IzracunajZaradu() {
        double zarada = 0;

        for (VelikoVozilo vozilo : velikaVozila) {
            zarada += vozilo.DohvatiNaplatu();
        }

        return zarada;
    }

    public List<VelikoVozilo> getVelikaVozila() {
        return velikaVozila;
    }

    public void setVelikaVozila(List<VelikoVozilo> velikaVozila) {
        if (velikaVozila.size() > getBrojVozila()) {
            throw new IllegalArgumentException("Broj vozila je veći od dopuštenog.");
        }

        this.velikaVozila = velikaVozila;

    }
}
