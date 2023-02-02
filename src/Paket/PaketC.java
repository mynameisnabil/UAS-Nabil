package Paket;

import Makanan.AyamGoreng;
import Makanan.KentangGoreng;
import Minuman.Jus;

public class PaketC extends Paket {
    public PaketC() {
        makanan1 = new AyamGoreng();
        makanan2 = new KentangGoreng();
        minuman = new Jus();
    }
}