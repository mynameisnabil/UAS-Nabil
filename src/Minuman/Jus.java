package Minuman;

import Minuman.minuman;

public class Jus extends minuman {

    public void bikin() {
        long startTime = System.currentTimeMillis();
        System.out.println("Membuat jus");
        long endTime = System.currentTimeMillis();
        System.out.println("Jus Telah Siap. Waktu yang dibutuhkan untuk membuat Jus: " + (endTime - startTime) + "ms");
    }
}