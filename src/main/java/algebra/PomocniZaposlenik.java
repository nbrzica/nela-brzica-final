package algebra;

public class PomocniZaposlenik extends Zaposlenik implements ObracunPlace{
    @Override
    public Double izracunajPlacu(double cijenaKarte) {
        return 0.11 * cijenaKarte;
    }



}
