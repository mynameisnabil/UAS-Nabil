package Makanan;

public class KentangGoreng extends Makanan {

    public void masak(){
        long startTime = System.currentTimeMillis();
        System.out.println("Membuat Kentang Goreng");
        long endTime = System.currentTimeMillis();
        System.out.println("Kentang Goreng Telah Siap. Waktu yang dibutuhkan untuk membuat Kentang Goreng: " + (endTime - startTime) + "ms");
    }
}


