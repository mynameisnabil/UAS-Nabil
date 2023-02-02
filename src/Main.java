import Paket.PaketA;
import Paket.PaketB;
import Paket.PaketC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opsi;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n====================================");
            System.out.println("Pilih Opsi");
            System.out.println("1. Lihat Daftar Paket Makanan");
            System.out.println("2. Buat Paket Makanan");
            System.out.println("3. Exit");
            System.out.println("====================================");
            System.out.print("Pilihan Anda : ");
            opsi = input.nextInt();

            switch (opsi) {
                case 1:
                    System.out.println("\nDaftar Paket:");
                    System.out.println("1. Paket A (Hot Dog + Kentang Goreng + Jus)");
                    System.out.println("2. Paket B (Hamburger + Kentang Goreng + Jus)");
                    System.out.println("3. Paket C (Ayam Goreng + Kentang Goreng + Jus)");
                    break;
                case 2:

                    Scanner input2 = new Scanner(System.in);
                    do {
                        System.out.println("\n====================================");
                        System.out.println("Pilih Paket Makanan Yang Akan Dibuat");
                        System.out.println("1. Paket A ");
                        System.out.println("2. Paket B ");
                        System.out.println("3. Paket C ");
                        System.out.println("4. Exit");
                        System.out.println("====================================");
                        System.out.print("Pilihan Anda : ");
                        opsi = input.nextInt();

                        switch (opsi) {
                            case 1:
                                PaketA paketA = new PaketA();
                                paketA.sajikan();
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("\nOrderan Sudah Siap");
                                System.out.print("Enter Untuk Melanjutkan");
                                String pilih = input2.nextLine();
                                break;
                            case 2:
                                PaketB paketB = new PaketB();
                                paketB.sajikan();
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("\nOrderan Sudah Siap");
                                System.out.print("Enter Untuk Melanjutkan ");
                                String pilih2 = input2.nextLine();
                                break;
                            case 3:
                                PaketC paketC = new PaketC();
                                paketC.sajikan();
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("\nOrderan Sudah Siap");
                                System.out.print("Enter Untuk Melanjutkan ");
                                String pilih3 = input2.nextLine();
                                break;

                            case 4:
                                System.out.println("Kembali ke menu utama");
                                break;
                            default:
                                System.out.println("Pilihan tidak ada");
                        }



                    } while (opsi != 4);

                    break;
                case 3:
                    System.out.println("Terimkasih Telah Menggunakan Aplikasi Kami");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        } while (opsi != 3);
    }
}