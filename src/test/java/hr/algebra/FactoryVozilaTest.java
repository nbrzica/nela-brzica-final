package hr.algebra;


import algebra.*;
import org.junit.Assert;
import org.junit.Test;

public class FactoryVozilaTest {
    @Test
    public void shouldReturnAutobusWhenSentAutobusAsVrstaVozila(){
        VelikoVozilo a1 = FactoryVozila.createVelikoVozilo(VrstaVelikihVozila.AUTOBUS,"ZG123VF", "Opel", "Ana Anic", TipVozila.ELEKTRICNO, 0.50);
        Assert.assertEquals(Autobus.class, a1.getClass());
    }

    @Test
    public void shouldReturnKamionWhenSentKamionAsVrstaVozila(){
        VelikoVozilo a1 = FactoryVozila.createVelikoVozilo(VrstaVelikihVozila.KAMION,"ZG123VF", "Opel", "Ana Anic", TipVozila.ELEKTRICNO, 0.50);
        Assert.assertEquals(Kamion.class, a1.getClass());
    }

    @Test
    public void shouldThrowExceptionWhenVrstaVelikihVozilaIsNull(){
        Assert.assertThrows(
                IllegalArgumentException.class,
                () -> FactoryVozila.createVelikoVozilo(
                        null,
                        "ZG123VF",
                        "Opel",
                        "Ana Anic",
                        TipVozila.ELEKTRICNO,
                        0.50));
    }

    @Test
    public void shouldReturnAutomobilWhenSentAutomobilAsVrstaVozila(){
        MaloVozilo a1 = FactoryVozila.createMaloVozilo(VrstaMalihVozila.AUTOMOBIL,"ZG123VF", "Opel", "Ana Anic", TipVozila.ELEKTRICNO, 0.50);
        Assert.assertEquals(Automobil.class, a1.getClass());
    }

    @Test
    public void shouldReturnKombijWhenSentKombijAsVrstaVozila(){
        MaloVozilo a1 = FactoryVozila.createMaloVozilo(VrstaMalihVozila.KOMBIJ,"ZG123VF", "Opel", "Ana Anic", TipVozila.ELEKTRICNO, 0.50);
        Assert.assertEquals(Kombij.class, a1.getClass());
    }

    @Test
    public void shouldThrowExceptionWhenVrstaMalihVozilaIsNull(){
        Assert.assertThrows(
                IllegalArgumentException.class,
                () -> FactoryVozila.createMaloVozilo(
                        null,
                        "ZG123VF",
                        "Opel",
                        "Ana Anic",
                        TipVozila.ELEKTRICNO,
                        0.50));
    }
}
