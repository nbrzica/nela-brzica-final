package algebra;

public class OsnovniZaposlenik extends Zaposlenik implements ObracunPlace{
    @Override
    public Double izracunajPlacu(double cijenaKarte) {
        return 0.10 * cijenaKarte ;
    }

}
