package hr.algebra;

import algebra.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ZaposlenikTest {
    @Test
    public void shouldReturnListMalaVozilaThatIsNotEmptyWhenWhenVehiclesAreLoaded(){
        Zaposlenik s = new Zaposlenik();
        s.setIme("Ivo");
        s.setPrezima("Ivić");

        List<MaloVozilo> mm = new ArrayList<>();
        MaloVozilo auto1 = FactoryVozila.createMaloVozilo(VrstaMalihVozila.AUTOMOBIL,"ZG123VF", "Opel", "Ana Anic", TipVozila.ELEKTRICNO, 0.50);
        MaloVozilo auto2 = FactoryVozila.createMaloVozilo(VrstaMalihVozila.AUTOMOBIL,"ZG321VF", "BMW", "Ivo Ivic", TipVozila.ELEKTRICNO, 0.80);
        MaloVozilo auto3 = FactoryVozila.createMaloVozilo(VrstaMalihVozila.AUTOMOBIL,"VZ321VF", "Mercedes", "Pero Peric", TipVozila.PLINSKO, 0.75);
        MaloVozilo kombij1 = FactoryVozila.createMaloVozilo(VrstaMalihVozila.KOMBIJ,"SI321VF", "Peugeot", "Marko Markic", TipVozila.PLINSKO, 0.25);

        mm.add(auto1);
        mm.add(auto2);
        mm.add(auto3);
        mm.add(kombij1);

        MaliVlak maliVlak  = new MaliVlak();
        maliVlak.setBrojVozila(8);

        Assert.assertEquals(maliVlak.getMalaVozila(), null);

        s.parkiranjeNaMaliVlak(maliVlak, mm);

        Assert.assertEquals(maliVlak.getMalaVozila().size(), 4);
    }

    @Test
    public void shouldReturnListVelikaVozilaThatIsNotEmptyWhenWhenVehiclesAreLoaded(){
        Zaposlenik s = new Zaposlenik();
        s.setIme("Ivo");
        s.setPrezima("Ivić");

        List<VelikoVozilo>vv = new ArrayList<>();
        VelikoVozilo a1 = FactoryVozila.createVelikoVozilo(VrstaVelikihVozila.AUTOBUS,"ZG123VF", "Opel", "Ana Anic", TipVozila.ELEKTRICNO, 0.50);
        VelikoVozilo a2 = FactoryVozila.createVelikoVozilo(VrstaVelikihVozila.AUTOBUS,"ZG321VF", "BMW", "Ivo Ivic", TipVozila.ELEKTRICNO, 0.80);
        VelikoVozilo a3 = FactoryVozila.createVelikoVozilo(VrstaVelikihVozila.AUTOBUS,"VZ321VF", "Mercedes", "Pero Peric", TipVozila.PLINSKO, 0.75);
        VelikoVozilo k1 = FactoryVozila.createVelikoVozilo(VrstaVelikihVozila.KAMION,"SI321VF", "Peugeot", "Marko Markic", TipVozila.PLINSKO, 0.09);
        vv.add(a1);
        vv.add(a2);
        vv.add(a3);
        vv.add(k1);

        VelikiVlak velikiVlak  = new VelikiVlak();
        velikiVlak.setBrojVozila(6);

        Assert.assertEquals(velikiVlak.getVelikaVozila(), null);

        s.parkiranjeNaVelikiVlak(velikiVlak, vv);

        Assert.assertEquals(velikiVlak.getVelikaVozila().size(), 4);
    }

    @Test
    public void shouldReturnFullVechileWhenNapunjenostVozilaIsLessThenTenPercentes(){
        Zaposlenik s = new Zaposlenik();
        s.setIme("Ivo");
        s.setPrezima("Ivić");

        List<VelikoVozilo>vv = new ArrayList<>();
        VelikoVozilo a1 = FactoryVozila.createVelikoVozilo(VrstaVelikihVozila.AUTOBUS,"ZG123VF", "Opel", "Ana Anic", TipVozila.ELEKTRICNO, 0.50);
        VelikoVozilo a2 = FactoryVozila.createVelikoVozilo(VrstaVelikihVozila.AUTOBUS,"ZG321VF", "BMW", "Ivo Ivic", TipVozila.ELEKTRICNO, 0.80);
        VelikoVozilo a3 = FactoryVozila.createVelikoVozilo(VrstaVelikihVozila.AUTOBUS,"VZ321VF", "Mercedes", "Pero Peric", TipVozila.PLINSKO, 0.75);
        VelikoVozilo k1 = FactoryVozila.createVelikoVozilo(VrstaVelikihVozila.KAMION,"SI321VF", "Peugeot", "Marko Markic", TipVozila.PLINSKO, 0.09);
        vv.add(a1);
        vv.add(a2);
        vv.add(a3);
        vv.add(k1);

        for (VelikoVozilo velikoVozilo: vv){
            if(velikoVozilo.getNapunjenostVozila()<0.10){
                s.punjenjeVozila(velikoVozilo);
            }
        }

        for (VelikoVozilo velikoVozilo: vv){
            Assert.assertFalse(velikoVozilo.getNapunjenostVozila() < 0.10);
        }
    }

}
