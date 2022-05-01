import java.util.Scanner;

public class SLLMain {

    public static void menu() {
        System.out.println("====================");
        System.out.println("Menu yang tersedia :)");
        System.out.println("");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("6. Cari nama pengantri berdasarkan indeks");
        System.out.println("7. Cari indeks berdasarkan nama pengantri");
        System.out.println("0. Exit");
        System.out.println("====================");
    }

    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        SingleLinkedList2 singLL2 = new SingleLinkedList2();
        SingleLinkedList2 singLL3 = new SingleLinkedList2();
        SingleLinkedList2 singLL4 = new SingleLinkedList2();
        Scanner sc = new Scanner(System.in);

        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertBefore(700, 100);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();

        System.out.println("Data pada indeks ke-1 = " + singLL.getData(1));
        System.out.println("Data 760 berada pada indeks ke-" + singLL.indexOf(760));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();

        // Source Code Tugas No.2

        System.out.println("");
        System.out.println("======= Tugas No.2 ========");
        System.out.println("");

        singLL2.addFirst("b");
        singLL2.print();
        singLL2.addLast("e");
        singLL2.print();
        singLL2.insertAfter("b", "c");
        singLL2.print();
        singLL2.insertBefore("b", "a");
        singLL2.print();
        singLL2.insertAt(3, "d");
        singLL2.print();

        // Source Code Tugas No.3

        System.out.println("");
        System.out.println("======= Tugas No.3 ========");
        System.out.println("");
        
        singLL3.print();
        singLL3.addLast("Bahasa");
        singLL3.insertBefore("Bahasa", "Android");
        singLL3.print();
        singLL3.insertBefore("Android", "Komputer");
        singLL3.print();
        singLL3.insertBefore("Komputer", "Basis Data");
        singLL3.print();
        singLL3.insertBefore("Basis Data", "Matematika");
        singLL3.print();
        singLL3.insertBefore("Matematika", "Algoritma");
        singLL3.print();
        singLL3.insertBefore("Algoritma", "Statistika");
        singLL3.print();
        singLL3.insertBefore("Statistika", "Multimedia");
        singLL3.print();
        System.out.println("Data pada indeks ke-0 = " + singLL3.getData(0));
        System.out.println("Data Bahasa berada pada indeks ke-" + singLL3.indexOf("Bahasa"));

        // Source Code Tugas No.4

        System.out.println("");
        System.out.println("======= Tugas No.4 ========");
        System.out.println("");

        int pilih;
        do {
            menu();
            System.out.print("Masukkan menu yang anda pilih : ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru : ");
                    String dataMasuk = sc.next();
                    singLL4.addLast(dataMasuk);
                    break;
                case 2:
                    singLL4.removeFirst();
                    break;
                case 3:
                    System.out.println("Untuk sekarang antrian terdepan adalah atas nama : "+singLL4.getData(0));
                    break;
                case 4:
                    singLL4.print();
                    break;
                case 5:
                    singLL4.getLastData();
                    break;
                case 6:
                    System.out.print("Masukkan indeks : ");
                    int cari = sc.nextInt();
                    System.out.println("Indeks ke-"+cari+" adalah atas nama : "+singLL4.getData(cari));
                    break;
                case 7:
                    System.out.print("Masukkan nama : ");
                    String p = sc.next();
                    System.out.println("Atas nama "+p+" berada pada indeks : "+singLL4.indexOf2(p));
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
