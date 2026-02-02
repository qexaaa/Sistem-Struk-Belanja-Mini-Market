import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StrukBelanja belanja = new StrukBelanja();

        // input jumlah barang
        System.out.println("Berapa produk yang ingin dimasukkan?");
        int jumlahProduk = input.nextInt();
        input.nextLine(); // membersihkan newline '\n' yang tertinggal

        for (int i = 1; i <= jumlahProduk; i++) {
            System.out.println("Produk ke-" + i);
            System.out.print("Nama Produk: ");
            String nama = input.nextLine();

            System.out.print("Harga Satuan: ");
            double harga = input.nextDouble();

            System.out.print("Jumlah: ");
            int qty = input.nextInt();

            System.out.print("Apakah produk ini memiliki diskon(%)? (y/n): ");
            String diskon = input.next();

            if (diskon.equalsIgnoreCase("y")) {
                System.out.print("Masukkan persentase diskon: ");
                double persen = input.nextDouble();
                belanja.tambahProduk(new ProdukDiskon(nama, harga, qty, persen / 100));
            } else {
                belanja.tambahProduk(new Produk(nama, harga, qty));
            }
            input.nextLine(); // membersihkan newline '\n' yang tertinggal
        }

        // Cetak hasil struk
        belanja.cetakStruk();
        input.close();
    }
}
