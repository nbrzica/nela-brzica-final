package algebra;

import java.util.ArrayList;
import java.util.List;

public class Solid {

    public static void main(String[] args) {
	// write your code here
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
        velikiVlak.setVelikaVozila(vv);

        List<MaloVozilo>mm = new ArrayList<>();
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
        maliVlak.setMalaVozila(mm);

        List<Vlak> v = new ArrayList<>();
        v.add(maliVlak);
        v.add(velikiVlak);

        double ukupanPrihod = 0;
        for (Vlak vlak: v){
            ukupanPrihod+=vlak.IzracunajZaradu();
        }

        System.out.println("Ukupan prihod od karata je " + ukupanPrihod);

        OsnovniZaposlenik s = new OsnovniZaposlenik();
        s.setIme("Ivo");
        s.setPrezima("Ivić");

        for (MaloVozilo maloVozilo: mm){
            if(maloVozilo.getNapunjenostVozila()<0.10){
                s.punjenjeVozila(maloVozilo);
            }
        }
        s.parkiranjeNaMaliVlak(maliVlak, mm);

        PomocniZaposlenik p = new PomocniZaposlenik();
        p.setIme("Pero");
        p.setPrezima("Peric");

        for (VelikoVozilo velikoVozilo: vv){
            if(velikoVozilo.getNapunjenostVozila()<0.10){
                p.punjenjeVozila(velikoVozilo);
            }
        }
        p.parkiranjeNaVelikiVlak(velikiVlak, vv);

        double placa1 = 0.0;
        for (MaloVozilo maloVozilo: mm){
            placa1+=s.izracunajPlacu(maloVozilo.DohvatiNaplatu());
        }
        System.out.println("Plaća osnovnog zaposlenika je " + placa1);

        double placa2 = 0.0;
        for (VelikoVozilo velikoVozilo: vv){
            placa2+=s.izracunajPlacu(velikoVozilo.DohvatiNaplatu());
        }
        System.out.println("Plaća pomoćnog zaposlenika je " + placa2);
    }
}
