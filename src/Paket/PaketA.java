package Paket;

import Makanan.Hotdog;
import Makanan.KentangGoreng;
import Minuman.Jus;

public class PaketA extends Paket {

    public PaketA() {
        makanan1 = new Hotdog();
        makanan2 = new KentangGoreng();
        minuman = new Jus();
    }
}