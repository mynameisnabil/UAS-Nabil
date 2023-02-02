package Makanan;

public class AyamGoreng extends Makanan {

    public void masak() {
        long startTime = System.currentTimeMillis();
        System.out.println("Membuat Ayam Goreng");
        long endTime = System.currentTimeMillis();
        System.out.println("Ayam Goreng Telah Siap. Waktu yang dibutuhkan untuk membuat Ayam Goreng: " + (endTime - startTime) + "ms");
    }
}
