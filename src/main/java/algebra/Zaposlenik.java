package algebra;

import java.util.List;

public class Zaposlenik implements Posao{
    private String Ime;
    private String Prezima;

    public Zaposlenik() {
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String ime) {
        Ime = ime;
    }

    public String getPrezima() {
        return Prezima;
    }

    public void setPrezima(String prezima) {
        Prezima = prezima;
    }


    @Override
    public void parkiranjeNaVelikiVlak(VelikiVlak vlak, List<VelikoVozilo> velikaVozila) {
        vlak.setVelikaVozila(velikaVozila);
    }

    @Override
    public void parkiranjeNaMaliVlak(MaliVlak vlak, List<MaloVozilo> malaVozila) {
        vlak.setMalaVozila(malaVozila);
    }

    @Override
    public void punjenjeVozila(Vozilo vozilo) {
        vozilo.Napuni();
    }
}
