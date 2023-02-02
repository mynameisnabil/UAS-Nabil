package Makanan;

public class hamburger extends Makanan {
    public void masak(){
        long startTime = System.currentTimeMillis();
        System.out.println("Membuat hamburger");
        long endTime = System.currentTimeMillis();
        System.out.println("Hamburger Telah Siap. Waktu yang dibutuhkan untuk membuat Hamburger: " + (endTime - startTime) + "ms");
    }
}
