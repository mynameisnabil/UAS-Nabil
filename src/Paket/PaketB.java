package Paket;

import Makanan.KentangGoreng;
import Makanan.hamburger;
import Minuman.Jus;

public class PaketB extends Paket {
    public PaketB() {
        makanan1 = new hamburger();
        makanan2 = new KentangGoreng();
        minuman = new Jus();
    }
}