package algebra;

import java.util.List;

public interface Posao {
    void parkiranjeNaVelikiVlak(VelikiVlak vlak, List<VelikoVozilo>velikaVozila);
    void parkiranjeNaMaliVlak(MaliVlak vlak, List<MaloVozilo> malaVozila);
    void punjenjeVozila(Vozilo vozilo);
}
