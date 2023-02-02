package Makanan;

public class Hotdog extends Makanan {

    public void masak(){
        long startTime = System.currentTimeMillis();
        System.out.println("Membuat Hot Dog");
        long endTime = System.currentTimeMillis();
        System.out.println("Hotdog Telah Siap. Waktu yang dibutuhkan untuk membuat Hotdog: " + (endTime - startTime) + "ms");
    }
}
