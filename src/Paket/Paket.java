package Paket;

import Makanan.Makanan;

public class Paket {
    Makanan makanan1;
    Makanan makanan2;
    Minuman.minuman minuman;

    public void sajikan() {
        Thread t1 = new Thread(() -> makanan1.masak());
        t1.start();

        Thread t2 = new Thread(() -> makanan2.masak());
        t2.start();

        Thread t3 = new Thread(() -> minuman.bikin());
        t3.start();
    }
}
