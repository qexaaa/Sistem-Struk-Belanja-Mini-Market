public class Produk {

    private String nama;
    private double hargaSatuan;
    private int jumlah;

    public Produk(String nama, double hargaSatuan, int jumlah) {
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
    }

    public double hitungTotal() {
        return hargaSatuan * jumlah;
    }

    public String getInfo() {
        return nama + " x" + jumlah + " = Rp " + hitungTotal();
    }
}
