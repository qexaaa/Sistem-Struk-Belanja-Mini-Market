import java.util.ArrayList;

public class StrukBelanja {
    private ArrayList<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk p) {
        daftarProduk.add(p);
    }

    public void cetakStruk() {
        double total = 0;
        System.out.println("=========== STRUK BELANJA ===========");
        for (Produk p : daftarProduk) {
            System.out.println(p.getInfo());
            total += p.hitungTotal();
        }
        System.out.println("=====================================");
        System.out.println("TOTAL PEMBAYARAN: Rp " + total);
    }
}
